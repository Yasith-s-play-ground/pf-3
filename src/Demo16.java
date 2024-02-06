void main() {
    final int NO_OF_ROWS = 7;
    int currentRow = 0;
    int noOfColumns;
    int decreasingColumnCount = 0;
    while (currentRow++ < NO_OF_ROWS) {
        if (NO_OF_ROWS % 2 != 0) { //checking for no of rows is odd or even
            if (currentRow <= NO_OF_ROWS / 2 + 1) {
                noOfColumns = currentRow;
            } else {
                decreasingColumnCount += 2;
                noOfColumns = currentRow - decreasingColumnCount;
            }
        } else {
            if (currentRow <= NO_OF_ROWS / 2) {
                noOfColumns = currentRow;
            } else {
                decreasingColumnCount += 2;
                noOfColumns = currentRow - decreasingColumnCount;
            }
        }
        int currentColumn = 0;
        while (currentColumn++ < noOfColumns) {
            System.out.print("* ");
        }
        System.out.println();
    }
}