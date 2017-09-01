package operating_system;

import java.util.LinkedList;

public class Buffer {
    private final int MAX_SIZE=100;
    LinkedList<Commodity> linkedList = new LinkedList<>();
    public void produce(int num){
        synchronized (linkedList){
            while (linkedList.size()+num>MAX_SIZE){
                System.out.println("要生产的产品数量："+num+"/t库存量："+linkedList.size()+"/t暂时不能执行生产任务。");
                try {
                    linkedList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i <num ; i++) {
                linkedList.add(new Commodity());
            }
            System.out.println("已经生产"+num+"件商品"+"/t现仓库数量为："+linkedList.size());
            linkedList.notifyAll();
        }
    }
    public void consume(int num ){
        synchronized (linkedList){
            while (linkedList.size()-num<0){
                System.out.println("要消费的数量："+num+"大于库存数量"+linkedList.size()+"/t暂时不能执行消费任务。");
                try {
                    linkedList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i <num ; i++) {
                    linkedList.remove();
                }
                System.out.println("已消费"+num+"件商品"+"/t现仓库容量："+linkedList.size());
                linkedList.notifyAll();
            }
        }
    }

}
