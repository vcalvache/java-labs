package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
public class Librarian extends Member{
    private static int index = 0;
    private int librarianID;

    public Librarian(String firstName, String lastName, String email,String userName, String password){
        super(firstName, lastName, email, userName, password);
        index++;
        this.librarianID = index;
    }

    public User registerNewUser(Scanner reader){
        System.out.println("Enter user first name");
        String firstName = reader.nextLine();
        System.out.println("Enter user last name");
        String lastName = reader.nextLine();
        System.out.println("Enter user email");
        String email = reader.nextLine();
        User newUser = new User(firstName, lastName, email);
        return newUser;
    }



}
