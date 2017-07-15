package algorithm;

import java.util.Scanner;

/**
 * Created by zhujia on 2017/7/14.
 */
public class JumpFloor {

        public static int JumpFloor(int target) {
        if (target<=0)return 0;
        else if(target==1)return 1;
        else if (target==2)return 2;
        else
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    public static void main(String[] args) {
            Boolean flag = true;
            while (flag){
                System.out.println("请输入台阶数：");
                Scanner scanner = new Scanner(System.in);
                try {
                    int  target = scanner.nextInt();
                    System.out.println("有"+JumpFloor(target)+"种跳法");

                }catch (java.util.InputMismatchException e){
                    System.out.println("你没有输入数字，程序很生气即将退出");
                    flag = false;
                }
            }

    }
}
