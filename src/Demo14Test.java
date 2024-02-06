void main() throws InterruptedException {
    int count = 0;
    final String RED_SPACE = "\033[41m ";
    final String EMPTY_SPACE = "\033[0m ";

    while (count <= 100) {

        String output = "[";
        output += RED_SPACE.repeat(count / 10) + EMPTY_SPACE.repeat((100 - count) / 10) + "\033[0m]" + count + "%";

        System.out.print(output);

        Thread.sleep(100);
        int backSpaceLength = 0;
        while (backSpaceLength < output.length() && count < 100) {
            System.out.print("\b");
            backSpaceLength++;
        }

        count += 10;
    }


}