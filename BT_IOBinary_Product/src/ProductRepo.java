import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepo {
    private Scanner scanner = new Scanner(System.in);
    private static List<Product> listProduct;
     static {
         listProduct = new ArrayList<>();
     }
    public static void writeDataToFile(String path, List<Product> products){
        try{
            FileOutputStream fos= new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>)ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
     public void addProduct(){
         System.out.println("enter id:");
         String id = scanner.nextLine();
         System.out.println("enter name product:");
         String name = scanner.nextLine();
         System.out.println("enter price product:");
         double price = scanner.nextDouble();
         scanner.nextLine();
         System.out.println("made in:");
         String origin = scanner.nextLine();
         System.out.println("Describe:");
         String describe = scanner.nextLine();

         Product newProduct = new Product(id,name,price,origin,describe);
         listProduct.add(newProduct);
     }
     public List<Product> showAll(){
         for (Product product:listProduct){
             if (product != null){
                 System.out.println(product);
             }
         }
         return listProduct;
     }

     public void writeFile(){
         writeDataToFile("product.txt",listProduct);
     }

     public void readFile(){
         List<Product> productsDataFromFile = readDataFromFile("product.txt");
         for (Product product:productsDataFromFile){
             System.out.println(product);
         }
     }
}