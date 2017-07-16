package algorithm;


/**
 * Created by zhujia on 2017/7/16.
 */
public class LeftRotateString {
    /* 1.首先逆置数组前p个元素；
    2.逆置余下n-p个元素；
    3.逆置整个数组R。*/
    //这道题还可以变形为求左旋转数组，左旋转链表方法类似。
    public static String LeftRotateString(String str,int n) {

        String a = reverse(str.substring(0,n));
        String b =  reverse(str.substring(n,str.length()));
        String c = a+b;


        return reverse(c);

    }
    //反转字符串方法，通过将字符串转为数组，倒序循环拼接。
    public static String reverse (String str){
        String newstr="";
        char[] array = str.toCharArray();
        for (int i = array.length-1; i>=0 ; i--) {
            newstr +=array[i];
        }
        return  newstr;

    }

    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(LeftRotateString(a,3));
    }

}
