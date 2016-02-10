package com.optum.cirrus.legacy.core.pricingengine.businesslogic.ambulance;

import java.lang.String;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ybutola on 10/4/15.
 */
public class IteratorConcept {
    public static void main(String args[]){
        Person person = new Person();
        person.setAge(22);
        person.setName("Yogi");

        Person person2 = new Person();
        person2.setAge(24);
        person2.setName("Butola");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        personList.add(person2);

        java.util.Iterator <Person>  personIterator = personList.iterator();

        while(personIterator.hasNext()){
            Person _person = personIterator.next();
             if(_person.getName().equals("butola")){
                 System.out.println("Removing "+ _person.getName() + " from the list!!!!");
                 personIterator.remove();
             }else{
                 System.out.println(_person.getName() + " has not been removed from the list!!!!");
             }
        }
    }
}

class Person{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
