package com.optum.cirrus.legacy.core.pricingengine.businesslogic.ambulance;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ybutola on 10/4/15.
 */
public class Test {
    public static void main(String args[]){
        Person person = new Person();
        person.setAge(07);
        person.setName("Zulu");

        Person person2 = new Person();
        person2.setAge(30);
        person2.setName("Madhu");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        personList.add(person2);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o2.getAge(), o1.getAge());
            }
        });

        for(Person _person: personList){
            System.out.println("Name : "+ _person.getName() + " is eldest !!!!");
        }

        // More tests.
        //NO more tests.
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
