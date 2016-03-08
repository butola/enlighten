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
    public static void main(String args[]) {
        Person person = new Person();
        person.setAge(22);
        person.setName("Yogi");

        Person person2 = new Person();
        person2.setAge(24);
        person2.setName("Butola");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        //  personList.add(person2);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o2.getAge(), o1.getAge());
            }
        });

        int age = 0
        Person eldest = null;
        for (Person _person : personList) {
            if (_person.getAge() > age) {
                age = _person.getAge();
                eldest = _person
            }
        }
        System.out.println("Name : " + eldest.getName() + " is eldest !!!!");
    }
    //New Comment  #1
}

class Person {
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
