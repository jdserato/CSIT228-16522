package Jan23;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person vince = new Person();
        vince.deposit(25000);
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("hello.txt"));
            bw.write("Jay Vince");
            vince.deposit(-5000);
            System.out.println(vince.balance);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Age of Vince = " + vince.age);
        } catch (InputMismatchException e) {
            System.out.println("Not an integer");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("END OF PROGRAM");
    }
}
