package operating_system;

public class Consumer extends Thread{
    int num;
    private Buffer buffer;
    public Consumer(Buffer buffer){
        this.buffer=buffer;
    }
    public void consume(int num){
        buffer.consume(num);
    }

    @Override
    public void run() {
        consume(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
