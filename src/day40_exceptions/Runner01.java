package day40_exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner01 {

    public static void main(String[] args) throws InvalidEmailIdCheckedException{
        Scanner scan = new Scanner(System.in);
        System.out.print("mail: ");
        String mailClient = scan.nextLine();

        if (mailClient.contains("@gmail.com")||mailClient.contains("@hotmail.com")){
            System.out.println("Successful");
        } else {
            throw new InvalidEmailIdCheckedException("Wrong mail. try again.");
        }

        System.out.println("islem bitti");
        scan.close();

    }
}
