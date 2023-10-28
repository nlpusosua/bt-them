package Utils;

import java.util.Scanner;

public class Utils {
    public long inputLong(Scanner scanner){
       while (true){
           try{
               return Long.parseLong(scanner.nextLine());
           } catch (Exception e){
               System.out.println("nhap sai, nhap lai de");
           }
       }
    }
    public double inputDouble(Scanner scanner){
       while (true){
           try {
               return Double.parseDouble(scanner.nextLine());
           } catch (Exception e){
               System.out.println("nhap sai, nhap lai de");
           }
       }
    }
}
