package org.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int laptopId;
    private String laptopDesc;

    public Laptop( String laptopDesc) {
        this.laptopDesc = laptopDesc;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public String getLaptopDesc() {
        return laptopDesc;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public void setLaptopDesc(String laptopDesc) {
        this.laptopDesc = laptopDesc;
    }
}
