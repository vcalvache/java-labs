package org.example.manager;


import org.example.model.User;

import java.util.Scanner;

public class UserManager {

    public static void resetPassword(Scanner reader, User user){
        System.out.println("Enter new Password");
        String newPassword = reader.nextLine();
        if (user.getPassword().equals(newPassword)){
            System.out.println("New Password can't be the same as old password");
        } else {
            user.setPassword(newPassword);
        }
        System.out.println("Password has been changed");
    }
}
