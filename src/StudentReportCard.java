import java.util.Scanner;

void main() {
    final String FIRST_NAME, LAST_NAME;
    final int MARK1, MARK2, MARK3, TOTAL;
    final double AVERAGE;
    final char GRADE1, GRADE2, GRADE3;
    final String COLOUR1, COLOUR2, COLOUR3;
    final Scanner SCANNER;
    final String GREEN, BLUE, YELLOW, PURPLE, RED, DEFAULT;

    RED = "\033[31m";
    GREEN = "\033[32m";
    YELLOW = "\033[33m";
    BLUE = "\033[34m";
    PURPLE = "\033[35m";
    DEFAULT = "\033[0m";

    SCANNER = new Scanner(System.in);

    System.out.print("Enter your First Name : ");
    FIRST_NAME = SCANNER.next();

    System.out.print("Enter your Last Name : ");
    LAST_NAME = SCANNER.next();

    System.out.print("Enter marks for Subject 1 : ");
    MARK1 = SCANNER.nextInt();
    if (MARK1 < 0 || MARK1 > 100) {
        System.err.println("Mark is invalid ! \nPlease try again.");
        System.exit(1);
    }
    System.out.print("Enter marks for Subject 2 : ");
    MARK2 = SCANNER.nextInt();
    if (MARK2 < 0 || MARK2 > 100) {
        System.err.println("Mark is invalid ! \nPlease try again.");
        System.exit(1);
    }
    System.out.print("Enter marks for Subject 3 : ");
    MARK3 = SCANNER.nextInt();
    if (MARK3 < 0 || MARK3 > 100) {
        System.err.println("Mark is invalid ! \nPlease try again.");
        System.exit(1);
    }

    GRADE1 = MARK1 >= 75 ? 'A' : MARK1 >= 65 ? 'B' : MARK1 >= 55 ? 'C' : MARK1 >= 35 ? 'S' : 'F';
    GRADE2 = MARK2 >= 75 ? 'A' : MARK2 >= 65 ? 'B' : MARK2 >= 55 ? 'C' : MARK2 >= 35 ? 'S' : 'F';
    GRADE3 = MARK3 >= 75 ? 'A' : MARK3 >= 65 ? 'B' : MARK3 >= 55 ? 'C' : MARK3 >= 35 ? 'S' : 'F';

    COLOUR1 = GRADE1 == 'A' ? GREEN : GRADE1 == 'B' ? BLUE : GRADE1 == 'C' ? YELLOW : GRADE1 == 'S' ? PURPLE : RED;
    COLOUR2 = GRADE2 == 'A' ? GREEN : GRADE2 == 'B' ? BLUE : GRADE2 == 'C' ? YELLOW : GRADE2 == 'S' ? PURPLE : RED;
    COLOUR3 = GRADE3 == 'A' ? GREEN : GRADE3 == 'B' ? BLUE : GRADE3 == 'C' ? YELLOW : GRADE3 == 'S' ? PURPLE : RED;

    TOTAL = MARK1 + MARK2 + MARK3;
    AVERAGE = TOTAL / 3.0;

    System.out.println("=========================================");
    System.out.println("          STUDENT REPORT CARD            ");
    System.out.println("=========================================");
    System.out.println(STR."Name : \{FIRST_NAME} \{LAST_NAME}");
    System.out.println("-----------------------------------------");
    System.out.println("\tSUBJECT\t|\tMARKS\t|\tSTATUS\t|");
    System.out.println("-----------------------------------------");
    System.out.println(STR."Subject 1\t|\t\{COLOUR1}\{MARK1}\{DEFAULT}\t\t|\t\{COLOUR1}\{GRADE1}\{DEFAULT}\t\t|");
    System.out.println(STR."Subject 2\t|\t\{COLOUR2}\{MARK2}\{DEFAULT}\t\t|\t\{COLOUR2}\{GRADE2}\{DEFAULT}\t\t|");
    System.out.println(STR."Subject 3\t|\t\{COLOUR3}\{MARK3}\{DEFAULT}\t\t|\t\{COLOUR3}\{GRADE3}\{DEFAULT}\t\t|");
    System.out.println("-----------------------------------------");

    System.out.println(STR."Total is : \{TOTAL}");

    System.out.println(STR."Average is : \{AVERAGE}");



}