package operating_system;

public class Producer_Consumer_Master {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer p1= new Producer(buffer);
        Producer p2= new Producer(buffer);
        Producer p3= new Producer(buffer);
        Producer p4= new Producer(buffer);
        Producer p5= new Producer(buffer);
        Producer p6= new Producer(buffer);
        Consumer c1 = new Consumer(buffer);
        Consumer c2 = new Consumer(buffer);
        Consumer c3 = new Consumer(buffer);
        Consumer c4 = new Consumer(buffer);
        p1.setNum(10);
        p2.setNum(10);
        p3.setNum(10);
        p4.setNum(10);
        p6.setNum(10);
        p5.setNum(60);
        c1.setNum(20);
        c2.setNum(30);
        c3.setNum(40);
        c4.setNum(50);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
