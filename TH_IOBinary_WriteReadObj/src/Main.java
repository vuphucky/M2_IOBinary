import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void WriteDataToFile(String path, List<Student> students){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>)ois.readObject();
            fis.close();
            ois.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }


    public static void main(String[] args) {
          List<Student> students = new ArrayList<>();
          students.add(new Student(1,"janh wong","HN"));
          students.add(new Student(2,"minh juan","HN"));
          students.add(new Student(3,"duc juy","HN"));
          students.add(new Student(4,"hung","HN"));
          students.add(new Student(5,"phuc ky","HN"));
          WriteDataToFile("student.txt",students);

          List<Student> studentDataFromFile = readDataFromFile("student.txt");
          for (Student student:studentDataFromFile){
              System.out.println(student);
          }
    }
}