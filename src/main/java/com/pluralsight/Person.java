package com.pluralsight;

import java.beans.PersistenceDelegate;

public class Person implements Comparable {
    public String firstName, lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person e){
        if(this.age==e.age)
            return 0;
        else if(this.age>e.age)
            return 1;
        else
            return -1;
    }

}
