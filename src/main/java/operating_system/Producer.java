package operating_system;

public class Producer extends Thread {
    private int num ;
    private Buffer buffer;
    public Producer(Buffer buffer){
        this.buffer=buffer;
    }
    public void produce(int num){
        buffer.produce(num);
    }

    @Override
    public void run() {
        produce(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
