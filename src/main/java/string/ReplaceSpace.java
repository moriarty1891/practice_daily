package string;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * Created by zhujia on 2017/9/10.
 */

public class ReplaceSpace {
    /**
     * 方法1
     *
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') spaceCount++;
        }
        int newLength = str.length() + spaceCount * 2;//计算空格转换成%20之后的str长度
        int indexOld = str.length() - 1;//iindexold为为替换前的str下标
        int indexNew = newLength - 1;//indexNew为为把空格替换为%20后的str下标
        str.setLength(newLength);//使str的长度扩大到转换成%20之后的长度,防止下标越界
        for (; indexOld >= 0 && indexOld < indexNew; --indexOld) {
            if (str.charAt(indexOld) == ' ') {
                str.setCharAt(indexNew--, '0');
                str.setCharAt(indexNew--, '2');
                str.setCharAt(indexNew--, '%');
            } else str.setCharAt(indexNew--, str.charAt(indexOld));
        }
        return str.toString();
    }

    /**
     * 方法2
     * @param str
     * @return
     */
    public String replaceSpace2(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }
}
