package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList= new ArrayList<>();

public Forum(){
    usersList.add(new ForumUser(1001, "Abakus", 'M', LocalDate.of(1986, 03, 19), 5));
    usersList.add(new ForumUser(1002, "Betty", 'F', LocalDate.of(1996, 11, 15), 35));
    usersList.add(new ForumUser(1003, "LordVader", 'M', LocalDate.of(2000, 03, 31), 174));
    usersList.add(new ForumUser(1004, "Sasha_Black", 'F', LocalDate.of(2003, 07, 02), 0));
    usersList.add(new ForumUser(1005, "Markus007", 'M', LocalDate.of(2004, 01, 01), 4));
    usersList.add(new ForumUser(1006, "XYZABC", 'F', LocalDate.of(1980, 10, 19), 15));
    usersList.add(new ForumUser(1007, "Laurajones", 'F', LocalDate.of(1996, 03, 22), 22));
    usersList.add(new ForumUser(1008, "asdfMarta", 'F', LocalDate.of(1999, 01, 02), 17));
    usersList.add(new ForumUser(1009, "FakeAdmin", 'M', LocalDate.of(1990, 01, 01), 305));
    usersList.add(new ForumUser(1010, "JavaProgrammer01", 'M', LocalDate.of(2001, 03, 03), 777));
}


    public List<ForumUser> getUserList(){
        return new ArrayList<>(usersList);
    }

}
