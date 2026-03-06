package org.sms.model;

public class Person {

    private int personId;
    private PersonNames names;

    public Person() {
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public PersonNames getNames() {
        return names;
    }

    public void setNames(PersonNames names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", names=" + names +
                '}';
    }
}
