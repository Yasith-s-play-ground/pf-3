import java.util.Scanner;

void main() {
    final Scanner SCANNER = new Scanner(System.in);
    System.out.print("Enter a day of week : ");
    final String DAY = SCANNER.next();
    System.out.println(DAY);

    if (DAY.equalsIgnoreCase("Monday")) System.out.println("Monday is quite refreshing");
    else if (DAY.equalsIgnoreCase("Tuesday")) System.out.println("Tuesday is kind of boring but not bad");
    else if (DAY.equalsIgnoreCase("Wednesday")) System.out.println("Wednesday is a struggle");
    else if (DAY.equalsIgnoreCase("Thursday")) System.out.println("Thursday amarui");
    else if (DAY.equalsIgnoreCase("Friday")) System.out.println("Friday gedara yankn inne");
    else if (DAY.equalsIgnoreCase("Saturday")) System.out.println("Saturday fun");
    else if (DAY.equalsIgnoreCase("Sunday")) System.out.println("Heta idan DEP");
    else System.out.println("Invalid Day");

}