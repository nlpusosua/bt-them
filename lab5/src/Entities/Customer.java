package Entities;

public class Customer {
    private String name;
    private int houseId;
    private int elecId;

    public Customer() {
    }

    public Customer(String name, int houseId, int elecId) {
        this.name = name;
        this.houseId = houseId;
        this.elecId = elecId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public int getElecId() {
        return elecId;
    }

    public void setElecId(int elecId) {
        this.elecId = elecId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", houseId=" + houseId +
                ", elecId=" + elecId +
                '}';
    }
}
