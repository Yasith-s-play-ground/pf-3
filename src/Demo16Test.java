void main() {
    int y = 0;
    while (y++ < 7) {
        int x = 0;
        while (x++ < (y < 5 ? y : (8 - y))) {
            System.out.println("* ");
        }
        System.out.println();
    }

}