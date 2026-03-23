package org.sms.model;

public class Laptop {

    private int laptopId;
    private String laptopDesc;

    public Laptop() {
    }

    public Laptop( String laptopDesc) {
        this.laptopDesc = laptopDesc;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopDesc() {
        return laptopDesc;
    }

    public void setLaptopDesc(String laptopDesc) {
        this.laptopDesc = laptopDesc;
    }
}
