void main() {

    //for (; true ; ) System.out.println("Hello");

    // for (/*1. Initialization*/;/*2. Boolean Expression*/;/*4. Update or step */)/*3. Loop body*/;

    for (int x = 0; x < 5; System.out.print(" DEP "), System.out.println("IJSE"), x = x + 1) {
        System.out.print("Hello");
        // x++;
    }

    // for (int y=5,f=3,x;true;)System.out.println("Hello");//multiple comma separated variables declared of same data type
    int x = 0;
    for (System.out.println("INIT 1"); x < 3; System.out.println("Update1"), System.out.println("Update2")) {
        System.out.println("Hello");
        x++;
    }

    /*INIT1
    Hello
    Update1
    Update2
    Hello
    Update1
    Update2
    Hello
    Update1
    Update2
     */

    //int x=8,int y=9; error
    //int x=8,y=9; ok
    x = 0;
    for (System.out.println("INIT 1"),System.out.println("INIT 2") ; x < 3;
    System.out.println("Update1"), System.out.println("Update2")){
        System.out.println("Hello");
        x++;
    }

}