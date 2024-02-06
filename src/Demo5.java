void main() {
    int x = 2, y = x++;

    if (x + y > x++ ? x > ++y : y++ > x) {
        if (x++ > 2 * y || ++y + 5 >= x) {
            x++;
            y += ++y;
            System.out.println(STR."x=\{x}, y=\{++y}");
        } else x++;
        y--;
        x += 2;
    } else {
        if (x++ > 2 * y && ++y + 5 >= x) {
            x--;
            y += --y;
            System.out.println(STR."x=\{x++}, y=\{y}");
        } else y++;
        x++;
        y += 2;
    }
    System.out.println(STR."x=\{x}, y=\{y}");
}