package com.company;

import Entities.Bill;
import Entities.Customer;
import Service.BillService;
import Service.CustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bill> bills = new ArrayList<Bill>();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        CustomerService customerService = new CustomerService();
        customerService.inputCustomer(scanner, customers);
        System.out.println("thong tin chu nha"+customers);
        BillService billService = new BillService();
        billService.inputBill(scanner,bills,customers);
    }
}
