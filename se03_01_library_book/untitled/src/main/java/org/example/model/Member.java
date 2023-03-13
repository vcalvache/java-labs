package org.example.model;

public class Member extends Person{

    private String email;
    private String userName;
    private String password;
    private static int userID = 1;

    public Member(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Member(String firstName, String lastName, String email,String userName, String password){
        super(firstName, lastName);
        this.userName = userName;
        this.password = password;
    }
}
