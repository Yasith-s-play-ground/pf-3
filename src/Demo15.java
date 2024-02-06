import java.util.Scanner;

void main() {

    final int NO_OF_STUDENTS = 3;
    final double NO_OF_SUBJECTS = 3;

    String worstStudentName, bestStudentName;
    int worstStudentTotal, bestStudentTotal;
    double worstStudentAverage, bestStudentAverage;
    final Scanner SCANNER = new Scanner(System.in);

    bestStudentAverage = worstStudentAverage = bestStudentTotal = worstStudentTotal = 0;

    int studentCount = 0;
    int subjectCount;

    worstStudentName = bestStudentName = "";

    String studentName = "";
    int mark, total;


    while (studentCount++ < NO_OF_STUDENTS) {
        System.out.print(STR."Enter the name of student \{studentCount} : ");
        studentName = SCANNER.next();

        subjectCount = 0;
        total = 0;
        while (subjectCount++ < NO_OF_SUBJECTS) {
            System.out.print(STR."Enter the subject \{subjectCount} marks of student \{studentCount} : ");
            mark = SCANNER.nextInt();
            if (mark <= 100 && mark >= 0) total += mark;
            else {
                System.err.println("Invalid marks, Please enter a valid mark !!");
                subjectCount--;
            }
        }

        if (studentCount == 1) {
            bestStudentName = studentName;
            bestStudentTotal = total;
            bestStudentAverage = total / NO_OF_SUBJECTS;

            worstStudentName = studentName;
            worstStudentTotal = total;
            worstStudentAverage = worstStudentTotal / NO_OF_SUBJECTS;
        } else {
            if (total > bestStudentTotal) {
                bestStudentName = studentName;
                bestStudentTotal = total;
                bestStudentAverage = bestStudentTotal / NO_OF_SUBJECTS;
            } else if (total < worstStudentTotal) {
                worstStudentTotal = total;
                worstStudentName = studentName;
                worstStudentAverage = worstStudentTotal / NO_OF_SUBJECTS;
            }
        }


//        if (worstStudentTotal == 0) {
//            worstStudentTotal = total;
//            worstStudentName = studentName;
//            worstStudentAverage = worstStudentTotal / NO_OF_SUBJECTS;
//        }

    }

    System.out.println("==========================================");
    System.out.println("              STUDENT REPORT              ");
    System.out.println("------------------------------------------");
    System.out.println("\t\t|\tWorst\t|\tBest\t|");
    System.out.println(STR."Name\t|\t\{worstStudentName}\t|\t\{bestStudentName}\t|");
    System.out.println(STR."Total\t|\t\{worstStudentTotal}\t\t|\t\{bestStudentTotal}\t|");
    System.out.println(STR."Average\t|\t\{worstStudentAverage}\t|\t\{bestStudentAverage}\t|");

}