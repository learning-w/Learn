package chapter02;

/**
 * @Author wucy0
 * @Date 2023/6/12
 * @Description
 **/
//: object/ShowProperties.java
public class ShowProperties{
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path"));
    }
}/// :~
