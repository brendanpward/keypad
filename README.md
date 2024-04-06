# KeyPad

## About

KeyPad is a simple notepad project to allow for saving and editing of PGP
encrypted text files. It takes inspiration from
[jamessan/vim-gnupg](https://github.com/jamessan/vim-gnupg) and should operate
in a similar fashion, but with an Android GUI.  It will use
[open-keychain/open-keychain](https://github.com/open-keychain/open-keychain)
for its encryption backend allowing you to use your own PGP keys that are
stored locally or on a device such as a Yubikey.  Files will be stored in a
local folder so that they can be transferred easily using the method of your
choice (ie. git, USB, E-mail, etc.).

## Design Goals

- Very simple text editor for use as a notepad
- Allows for signing and encryption to multiple keys
- Stores all encrypted files in a folder accessible to other applications on
  the device
- Choose between ASCII armoured text or binary
- Use [open-keychain](https://github.com/open-keychain/open-keychain) for
  encryption backend

## Layout

### Main Page

- A scrollable list of all .asc, .pgp, and .gpg files in the selected folder
  - The list will show only the name of the file
  - Other files will not be included in the list
  - Clicking on an item in this list decrypts the file and opens it in the
    editor page
- A floating compose button in the bottom right for creating new notes
- Configure cog in the top right leading to the settings page
- Hamburger menu on the top left allowing quick navigation to other folders
  temporarily

### Settings Page

- Allows the user to select defaults such as:
  - Default save/open folder
  - Default signing key (optional)
  - Default encryption key(s) (optional)
  - Default file creation type (.asc, .gpg, or .pgp)
  - Automatic saves
    - Save frequency

### Editor Page

- File name
- Signing key
- Encryption key(s)
- Text body
- Save button in top right
- Close without saving

