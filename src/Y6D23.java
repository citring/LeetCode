/**
 * @author 陈畅
 * @version 1.0
 * @date 2021-06-23 9:30
 */
public class Y6D23 {

    public static void main(String[] args) {
        int a = hammingWeight(00000000000000000000000000001011);
        System.out.println(a);
    }

    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
