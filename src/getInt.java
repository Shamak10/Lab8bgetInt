import java.util.Scanner;
public class getInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = getInt(scanner, "Enter an integer: ");
        System.out.println("You entered: " + num);}
    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
            } else {
                pipe.next();
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return result;
    }
}
