package chapter02;

/**
 * @Author wucy0
 * @Date 2023/6/13
 * @Description
 **/
public class Test {
    private int i;
    private char j;

    public Test() {
        System.out.println("i = " + i);
        System.out.println("j = [" + j + "]");
    }
    public static void main(String[] args) {
        new Test();
    }
}
