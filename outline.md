# Outline

## About

Keypad is an application that allows for easy notetaking using text or markdown files.  It relies on open-keychain/open-keychain for the encryption and decryption of files.

## Interface

- On open, should present the user with a list structure.
  - The structure will contain all of the files in a specified folder that use the extension {.md,.txt}{.asc,.pgp,.gpg} for example myFile.md.gpg.  The name of the file will be what's listed for selection.
  - There will be a button to create a new file
- When a file is selected
  - it will decrypt and show who signed it at the top along with who it's encrypted to.
  - The message will be shown below in a text box that can be edited.
  - The message should auto-save every minute and upon pressing the back button
