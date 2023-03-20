package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
public class User extends Member{
    private static int index = 0;
    private int userID;


    public User(String firstName, String lastName, String email, String userName, String password){
        super(firstName, lastName, email, userName,  password);
        index++;
        this.userID = index;
    }

    public User(String firstName, String lastName, String email){
        super(firstName, lastName, email);
        index++;
        this.userID = index;
    }
}
