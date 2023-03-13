package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Member{
    private static int index = 0;
    private int userID;


    public User(String firstName, String lastName, String email, String userName, String password){
        super(firstName, lastName, email, userName, password);
        index++;
        this.userID = index;
    }

    public int getUserID(){
        return this.userID;
    }
}
