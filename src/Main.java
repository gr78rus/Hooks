import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        do {
            s = s.replace("()", "");
        } while (s.contains("()"));

        if (s.isEmpty()) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
            hjhj
        }
    }
}