import java.util.Scanner;

void main() {
    final Scanner SCANNER = new Scanner(System.in);
    final int MARK1, MARK2, MARK3, COLOUR1, COLOUR2, COLOUR3, TOTAL;
    final double AVERAGE;
    final char GRADE1, GRADE2, GRADE3;
    final String FIRST_NAME, LAST_NAME;
    System.out.print("Enter your first name : ");
    FIRST_NAME = SCANNER.next();
    System.out.print("Enter your last name : ");
    LAST_NAME = SCANNER.next();

    System.out.print("Enter your subject 1 marks : ");
    MARK1 = SCANNER.nextInt();


    if (MARK1 >= 75) {
        GRADE1 = 'A';
        COLOUR1 = 32;
    } else if (MARK1 >= 65) {
        GRADE1 = 'B';
        COLOUR1 = 34;
    } else if (MARK1 >= 55) {
        GRADE1 = 'C';
        COLOUR1 = 36;
    } else if (MARK1 >= 35) {
        GRADE1 = 'S';
        COLOUR1 = 35;
    } else {
        GRADE1 = 'F';
        COLOUR1 = 31;
    }

    System.out.print("Enter your subject 2 marks : ");
    MARK2 = SCANNER.nextInt();

    if (MARK2 >= 75) {
        GRADE2 = 'A';
        COLOUR2 = 32;
    } else if (MARK2 >= 65) {
        GRADE2 = 'B';
        COLOUR2 = 34;
    } else if (MARK2 >= 55) {
        GRADE2 = 'C';
        COLOUR2 = 36;
    } else if (MARK2 >= 35) {
        GRADE2 = 'S';
        COLOUR2 = 35;
    } else {
        GRADE2 = 'F';
        COLOUR2 = 31;
    }

    System.out.print("Enter your subject 3 marks : ");
    MARK3 = SCANNER.nextInt();

    if (MARK3 >= 75) {
        GRADE3 = 'A';
        COLOUR3 = 32;
    } else if (MARK3 >= 65) {
        GRADE3 = 'B';
        COLOUR3 = 34;
    } else if (MARK3 >= 55) {
        GRADE3 = 'C';
        COLOUR3 = 35;
    } else if (MARK3 >= 35) {
        GRADE3 = 'S';
        COLOUR3 = 36;
    } else {
        GRADE3 = 'F';
        COLOUR3 = 31;
    }

    TOTAL = MARK1 + MARK2 + MARK3;
    AVERAGE = TOTAL / 3.;

    System.out.println("=================================");
    System.out.println("STUDENT REPORT CARD");
    System.out.println("=================================");
    System.out.println(STR."Name : \{FIRST_NAME} \{LAST_NAME}");
    System.out.println("---------------------------------");
    System.out.println("Subject\t\tMarks\t\tStatus");
    System.out.println("---------------------------------");
    System.out.println(STR."Subject1\t\t\033[\{COLOUR1}m\{MARK1}\t\t\{GRADE1}\033[0m");
    System.out.println(STR."Subject2\t\t\033[\{COLOUR2}m\{MARK2}\t\t\{GRADE2}\033[0m");
    System.out.println(STR."Subject3\t\t\033[\{COLOUR3}m\{MARK3}\t\t\{GRADE3}\033[0m");


    System.out.println(STR."Total Marks : \{TOTAL}");
    System.out.println(STR."Average : \{AVERAGE}");

    //System.out.println("\033[31mColored \033[0m Text");

}