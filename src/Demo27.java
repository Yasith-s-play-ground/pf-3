void main() {
    int x, y;
    for (x = 3, y = 0, System.out.print("+ "); x-- > y; System.out.print(x == y ? "+ " : "+ \n+ ")) {
        for (int k = -3; k < y; k++) System.out.print("* ");
    }
}

/*
+***+
+***+
+***+
* */