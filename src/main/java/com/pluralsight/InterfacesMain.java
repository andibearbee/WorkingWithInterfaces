package com.pluralsight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class InterfacesMain {
    public static void main(String[] args) {

        List<Person> friendsCharacters = new ArrayList<Person>();
        friendsCharacters.add(new Person("Phoebe", "Buffay", 26));
        friendsCharacters.add(new Person("Joey", "Tribbiani", 25));
        friendsCharacters.add(new Person("Chandler", "Bing", 26));
        friendsCharacters.add(new Person("Monica", "Geller-Bing", 24));
        friendsCharacters.add(new Person("Ross", "Geller", 26));
        friendsCharacters.add(new Person("Rachel", "Green", 24));

        Collections.sort(friendsCharacters);


        for (Person person:friendsCharacters) {

            System.out.println(person);
        }
    }
}
