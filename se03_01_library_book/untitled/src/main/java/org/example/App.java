package org.example;

import org.example.manager.UserManager;
import org.example.model.User;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter text");
        String text = scanner.nextLine();
        User user = new User("Victor", "Calvache", "vcalvache@email.com");
        UserManager.resetPassword(scanner, user);
        System.out.println(user.getPassword());
    }
}
