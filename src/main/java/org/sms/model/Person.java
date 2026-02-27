package org.sms.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;

    private PersonNames names;
//    private String email;

    public Person() {

    }

    public int getPersonId() {
        return personId;
    }

    public PersonNames getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", names=" + names +
                '}';
    }

    public void setNames(PersonNames names) {
        this.names = names;
    }
}
