import java.util.Scanner;

void main() {
    final int MARKS;
    final Scanner SCANNER = new Scanner(System.in);

    System.out.print("Enter your marks : ");
    MARKS = SCANNER.nextInt();

    assert MARKS >= 0 && MARKS <= 100 : "Invalid Marks"; //Assert Statement

    System.out.println(STR."Your Marks is \{MARKS}");
}