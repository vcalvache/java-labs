package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member extends Person{

    private String email;
    private String userName;
    private String password;

    public Member(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Member(String firstName, String lastName, String email,String userName, String password){
        super(firstName, lastName);
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
}
