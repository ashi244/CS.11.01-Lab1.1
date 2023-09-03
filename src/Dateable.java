
import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String stringAge = scanner.nextLine();
        int age = Integer.parseInt(stringAge);
        int dateableAge = 7 + age/2;
        System.out.print("\n" + age + "-year olds should date someone who is at least " + dateableAge + " years old");
    }
}
