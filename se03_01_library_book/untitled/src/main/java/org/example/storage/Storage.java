package org.example.storage;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.model.Borrow;
import org.example.model.Publication;
import org.example.model.User;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class Storage {
    private HashMap<Integer, User> users;
    private HashMap<Integer, Publication> publications;
    private HashMap<Integer, Borrow> borrows;
}
