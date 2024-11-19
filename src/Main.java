import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
         scanner.close();

         String fileName = name + ".txt";

         try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
             writer.write("Имя" + name + "/n");
             writer.write(" Возраст" + age);
             System.out.println("Информация записана в файл" + fileName);
         }catch (IIOException e){
             System.out.println("" + e.getMessage());


         } catch (IOException e) {
             throw new RuntimeException(e);
         }


    }
}