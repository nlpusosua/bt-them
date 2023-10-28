package Service;

import Entities.Bill;
import Entities.Customer;
import Utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;



public class BillService {
    CustomerService customerService = new CustomerService();
    Utils utils = new Utils();

    public void inputBill(Scanner scanner, ArrayList<Bill>bills, ArrayList<Customer> customers){
            System.out.println("nhap chi so cu");
            long oldBill = utils.inputLong(scanner);
            System.out.println("nhap chi so moi");
            long newBill =utils.inputLong(scanner);
            System.out.println("so tien phai tra la");
            double pay = (newBill - oldBill) * 750;
            System.out.println(pay);
            System.out.println("bạn muốn nhập tiếp không");
            System.out.println("1.có");
            System.out.println("2.ko");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    customerService.inputCustomer(scanner,customers);
                    BillService billService = new BillService();
                    billService.inputBill(scanner, bills,customers);
                    break;
                case 2:
                    System.exit(0);
            }
    }

    public void printfInfor(){
        customerService.printfInfor();
    }


}
