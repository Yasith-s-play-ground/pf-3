void main() throws InterruptedException {
    final int TOTAL_SPACES = 100;
    int count = 0;

    while (count <= 100) {

        String output = "[";
        int progressSpaceCount = 0;
        while (progressSpaceCount < (count /100.0 * TOTAL_SPACES)) {
            output += "\033[41m ";
            progressSpaceCount++;
        }
        int emptyCount = 0;
        while (emptyCount < ((100 - count) / 100.0 * TOTAL_SPACES)) {
            output += "\033[0m ";
            emptyCount++;
        }
        output += "\033[0m]" + count + "%";
        System.out.print(output);

        Thread.sleep(100);
        int backSpaceLength = 0;
        while (backSpaceLength < output.length() && count < 100) {
            System.out.print("\b");
            backSpaceLength++;
        }

        count += 100 / TOTAL_SPACES;
    }


}