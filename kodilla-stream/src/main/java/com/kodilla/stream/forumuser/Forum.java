package com.kodilla.stream.forumuser;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum (){
        theForumUsersList.add(new ForumUser(1, "Michael", 'M', LocalDate.of(1964, 03, 28) , 20));
        theForumUsersList.add(new ForumUser(2, "Monica", 'F', LocalDate.of(1999, 12, 06) , 0));
        theForumUsersList.add(new ForumUser(3, "Bill", 'M', LocalDate.of(1987, 07, 10) , 120));
        theForumUsersList.add(new ForumUser(4, "Sebastian", 'M', LocalDate.of(2002, 01, 15) , 7));
        theForumUsersList.add(new ForumUser(5, "Alice", 'F', LocalDate.of(1979, 06, 02) , 87));
        theForumUsersList.add(new ForumUser(6, "Cathrin", 'F', LocalDate.of(1995, 11, 01) , 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
