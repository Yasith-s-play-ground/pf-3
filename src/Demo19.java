void main() {

    System.out.println("Diagram using 2 while loops");
    int noOfRows = 9;
    int currentRow = 0;
    int noOfColumns = 5;
    while (currentRow++ < noOfRows) {
        int currentColumn = 0;
        while (currentColumn++ < noOfColumns) {
            System.out.print("* ");
        }
        System.out.println();
        if (currentRow < 5) noOfColumns--;
        else noOfColumns++;
    }

    System.out.println("Diagram using 1 while loop");
    final int NO_OF_STARS = 29;
    int currentPos = 0;
    boolean needNewLine;
    while (currentPos++ < NO_OF_STARS) {
        needNewLine = currentPos == 5 || currentPos == 9 || currentPos == 12 || currentPos == 14 || currentPos == 15 || currentPos == 17 || currentPos == 20 || currentPos == 24;
        System.out.print("*" + (needNewLine ? "\n" : " "));
    }

}