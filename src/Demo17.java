void main() {

    System.out.println("First Method");
    final int NO_OF_STARS = 25;
    int currentPos = 0;

    while (currentPos++ < NO_OF_STARS) {
        System.out.print("*" + (currentPos % 5 == 0 ? "\n" : " "));
    }

    /*System.out.println("Second Method ");
    int noOfStars = 30;
    int c = 0;
    while (c++ < noOfStars) {
        System.out.print(c % 6 == 0 ? "\n" : "* ");
    }*/
}