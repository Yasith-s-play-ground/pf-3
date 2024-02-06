void main() {
    if (true) System.out.println("True");
    else ;

    if (true) {
        System.out.println("True");
        System.out.println("In block");
    } else System.out.println("Else block has only one statement");

    if (true) {
        System.out.println("True");
        System.out.println("In if block");
    } else {
        System.out.println("This is else block");
        System.out.println("Multiple statements in else block");
    }

    if (true) {
        System.out.println("True");
        System.out.println("In if block");
    } else if (false) {
        System.out.println("This is else block");
        System.out.println("Multiple statements in else block");
    } else if (false) System.out.println("This is else block");
    else if (true) {
        System.out.println(" one of else if ");
        System.out.println("it's second line");

       // System.out.println();
    }
    // System.out.println("Multiple statements in else block");


}