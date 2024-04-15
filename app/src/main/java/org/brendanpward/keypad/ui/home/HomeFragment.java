package org.brendanpward.keypad.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.brendanpward.keypad.R;
import org.brendanpward.keypad.databinding.FragmentHomeBinding;
import java.util.ArrayList;

public class HomeFragment extends Fragment implements FileMenuAdapter.ItemClickListener {

    private FragmentHomeBinding binding;
    FileMenuAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Populate the RecyclerView
        ArrayList<String> ListOfFiles = new ArrayList<>();
        ListOfFiles.add("File1");
        ListOfFiles.add("File2");

        RecyclerView recyclerView = root.findViewById(R.id.fileList);
        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
        adapter = new FileMenuAdapter(root.getContext(), ListOfFiles);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onItemClick(View view, int position) {
        //Check this line
        Toast.makeText(getActivity().getApplicationContext(), "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}