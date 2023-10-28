package Entities;

public class Bill {
    private double oldBill;
    private double newBill;
    private double pay;
    private Customer customer;

    public Bill(Customer customer) {
        this.customer = customer;
    }

    public Bill(double oldBill, double newBill, double pay, Customer customer) {
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "oldBill=" + oldBill +
                ", newBill=" + newBill +
                ", pay=" + pay +
                ", customer=" + customer +
                '}';
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bill(double oldBill, double newBill, double pay) {
        this.oldBill = oldBill;
        this.newBill = newBill;
        this.pay = pay;
    }

    public double getOldBill() {
        return oldBill;
    }

    public void setOldBill(double oldBill) {
        this.oldBill = oldBill;
    }

    public double getNewBill() {
        return newBill;
    }

    public void setNewBill(double newBill) {
        this.newBill = newBill;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

}
