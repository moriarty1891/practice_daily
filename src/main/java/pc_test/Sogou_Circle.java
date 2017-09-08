package pc_test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sogou_Circle {

    public static String calculation(double[] array){
        DecimalFormat df =new DecimalFormat("0.00000000");
        double max=0;
        double temp;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                  if (array[i]>array[j]) temp = array[i]-array[j];
                  else temp = array[j]-array[i];
                  if (temp>180.00000000d){
                      temp=360.00000000d-temp;
                  }
                  if (temp>max){
                      max=temp;
                  }

            }
        }
        return df.format(max);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int number = scanner.nextInt();
            double array[]= new double[number];
            for (int i = 0; i <array.length ; i++) {
                array[i]=scanner.nextDouble();
            }
            System.out.println(calculation(array));
        }
    }
}
