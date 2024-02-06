import java.util.Scanner;

void main() {
    final Scanner SCANNER = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int value = SCANNER.nextInt();
    if (value > 10) System.out.println("Value is greater than 10");
    else if (value > 5) System.out.println("Value is greater than 5");
    else System.out.println("Value is less than or equal 5");
    assert value > 0 : "Negative Number";
    System.out.println("App is about to exit");
}



