package org.example;

public class PasswordChecker {

    public boolean validatePassword(String password) {
        boolean passwordOkay = false;

        /* checks if empty, then checks if length is correct. First Matches \\d+ checks if the password have at least one digit.
        Second matches checks if password has at least one upper case and lower case letter. */

        if (password.isEmpty()) {
            System.out.println("Password empty!");

        } else if (password.length() >= 8 && password.length() <= 16) {
            if (password.matches(".*\\d.*") && password.matches(".*[a-zA-Z].*")){
                System.out.println("This password fulfills the criteria.");
                passwordOkay = true;
                return passwordOkay;

            } else {
                System.out.println("Password doesn't contain a number");
            }
        }
        return passwordOkay;
    }
}
