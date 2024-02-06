void main() {
    final int NO_OF_STARS = 15;
    int currentPos = 0;

    while (currentPos++ < NO_OF_STARS) {

        System.out.print("*" + (currentPos == 5 || currentPos == 9 || currentPos == 12 || currentPos == 14 ? "\n" : " "));

    }

    System.out.println("\n\nSecond method");

    int maxNoOfColumns = 6;
    int currentColumn = 0;
    while (currentColumn++ < maxNoOfColumns) {
        System.out.print(currentColumn < maxNoOfColumns ? "* " : "\n");
        if (currentColumn == maxNoOfColumns) {
            maxNoOfColumns--;
            currentColumn = 0;
        }
    }
}