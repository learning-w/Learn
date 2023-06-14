package chapter05;

/**
 * @Author wucy0
 * @Date 2023/6/14
 * @Description
 **/
public class Test {

//    String s;
    /**
     * 初始化过的String
     */
    private String s = "ac";

    Test(String s) {
        this.s = s;
    }
    public static void main(String[] args) {
        Test t = new Test("abc");
        System.out.println("s=" + t.s);
    }
}
