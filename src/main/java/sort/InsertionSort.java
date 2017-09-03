package sort;

/**
 * Created by zhujia on 2017/7/10.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {49,38,65,97,76,13,27,49,78,34,12,64,1} ;
        System.out.println("before  sort：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] +" ");
        }



        for(int i=1;i<a.length;i++){//从头部第一个当做已经排好序的，把后面的一个一个的插到已经排好的列表中去。
            if(a[i]<a[i-1]){
                int j;
                int x=a[i];//x为待插入元素
                a[i]=a[i-1];//直接后移一个，空出一个坑
                for(j=i-1;  j>=0 && x<a[j];j--){//x需要小于比他大的元素。
                    //通过循环，逐个后移一位找到要插入的位置。
                    a[j+1]=a[j];
                }
                a[j+1]=x;//插入
            }
        }




            System.out.println();
        System.out.println("after sort：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] +" ");
        }
    }
}
