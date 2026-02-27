package org.sms.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonNames {

    private String fistName;
    private String lastName;

    public String getFistName() {

        return fistName;
    }

    public PersonNames(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
