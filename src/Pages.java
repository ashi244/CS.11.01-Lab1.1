import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String stringAge = scanner.nextLine();
        int age = Integer.parseInt(stringAge);
        int pages = 100 - age;
        System.out.print("\n" + age + "-year olds should read at least " + pages + " pages before giving up on a book");
    }
}
