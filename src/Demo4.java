void main() {
    int x = 3, y = 2;

    if (x++ + ++y > x + y) System.out.println(STR."\{x++} \{y++}");
    else if (2 * ++x >= 3 * (y += 5) && y++ < (x *= 2)) {
        System.out.println(STR."x=\{x++} y=\{y++}");
        x++;
        --y;
    } else if (x++ + y > 10 % (x + y)) System.out.println(STR."x=\{x++} y=\{y++}");
    else if (++x + ++y >= (x + y)) System.out.println(STR."x=\{x++} y=\{y++}");
    else System.out.println(STR."x=\{x = 2 * x++} y=\{3 * y++}");

    System.out.println(STR."x=\{x} y=\{y}");

}