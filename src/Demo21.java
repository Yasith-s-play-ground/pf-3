void main() {
    final int NO_OF_STARS = 37;
    int currentPos = 0;
    boolean needNewLine;
    while (currentPos++ < NO_OF_STARS) {
        needNewLine = currentPos == 5 || currentPos == 9 || currentPos == 12 || currentPos == 16 || currentPos == 21 || currentPos == 25 || currentPos == 28 || currentPos == 32;
        System.out.print("*" + (needNewLine ? "\n" : " "));
    }
}