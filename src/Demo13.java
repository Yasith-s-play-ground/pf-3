void main() throws InterruptedException {
//    System.out.println(Thread.currentThread().getName());
    int x = 0;
    while (x++ < 10) {
//        System.out.println(Thread.currentThread().getName());
        System.out.println(x);
        Thread.sleep(250); // ask the current thread to sleep for 250 milli-seconds
    }
//    System.out.println(Thread.currentThread().getName());

}