package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
}
