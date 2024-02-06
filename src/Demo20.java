void main() {
    final int NO_OF_STARS = 16;
    int currentPos = 0;
    boolean needNewLine;
    while (currentPos++ < NO_OF_STARS) {
        needNewLine = currentPos == 1 || currentPos == 3 || currentPos == 6 || currentPos == 10 || currentPos == 13 || currentPos == 15;
        System.out.print("*" + (needNewLine ? "\n" : " "));
    }


//    System.out.println("\n\nSecond method");
//
//    int maxNoOfColumns = 1;
//    int currentColumn = 0;
//    int currentRow = 0;
//    while (currentColumn++ < maxNoOfColumns) {
//        currentRow++;
//        //System.out.println(" Current row is " + currentRow);
//        System.out.print(currentColumn < maxNoOfColumns ? "* " : "\n");
//        if (currentRow < 5 && currentColumn == maxNoOfColumns) {
//            maxNoOfColumns++;
//            // System.out.println("next max no of columns is " + maxNoOfColumns);
//            currentColumn = 0;
//        } else if (currentRow >= 5  && currentColumn == maxNoOfColumns) {
//            maxNoOfColumns--;
//           // System.out.println("next max no of columns is " + maxNoOfColumns);
//            currentColumn = 0;
//        }
//    }
}