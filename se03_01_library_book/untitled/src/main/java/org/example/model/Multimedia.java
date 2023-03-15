package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
public class Multimedia extends Publication{
    private String format;

    public Multimedia(String title, String author, int yearPublished, String format){
        super(title, author, yearPublished);
        this.format = format;
    }
}
