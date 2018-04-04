import java.io.FileInputStream;
import java.io.FileReader;

/**
 * Created by Lenovo on 2018/4/1.
 */
public class Demo3 {
    public static void main(String[] args) {
        try {
            FileInputStream in = null;
            in = new FileInputStream("D:\\Java\\src3\\StreamTest\\src\\Demo3.java");
            int r = 0;
            System.out.println("测试中文");
            while ((r = in.read()) != -1) {//要在这里有循环的结束条件，read()自动向下走

                System.out.print((char) r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            FileReader in2 = null;
            in2 = new FileReader("D:\\Java\\src3\\StreamTest\\src\\Demo3.java");
            int r2 = 0;
            System.out.println("测试中文");
            while ((r2 = in2.read()) != -1) {//要在这里有循环的结束条件，read()自动向下走

                System.out.print((char) r2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
