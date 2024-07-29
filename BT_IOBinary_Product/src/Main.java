import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepo productRepo = new ProductRepo();

        int choice;
        do {
            System.out.println("mana product: \n" +
                    "1.Add product \n" +
                    "2.Show product \n" +
                    "3.Write file \n" +
                    "4. Read file \n" +
                    "5.exit" +
                    "Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    productRepo.addProduct();
                    break;
                case 2:
                    productRepo.showAll();
                    break;
                case 3:
                    productRepo.writeFile();
                    break;
                    case 4:
                        productRepo.readFile();
                        break;
                case 5:
                    System.exit(0);
            }
        }while (true);
    }
}