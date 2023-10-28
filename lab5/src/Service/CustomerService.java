package Service;

import Entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public Customer inputCustomer(Scanner scanner, ArrayList<Customer>customers){
        System.out.println("nhap ten chu ho");
        String name = scanner.nextLine();
        System.out.println("nhap so nha");
        int houseId = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap max cong to");
        int elecId= Integer.parseInt(scanner.nextLine());
        Customer customer = new Customer(name, houseId, elecId);
        customers.add(customer);
        return customer;
    }

    public void printfInfor(){
        System.out.println("........");
    }
}
