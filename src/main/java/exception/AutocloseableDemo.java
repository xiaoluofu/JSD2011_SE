package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Hollow
 * @create 2020/12/29 0029 17:11
 * JDK7之后，java推出了一个新的特性：自动关闭
 * 可以在异常处理机制中用更精简的代码完成在finally中的IO关闭
 */
public class AutocloseableDemo {
    public static void main(String[] args) {
        try (
                /*
                    只有实现了AutoCloseable接口的类可以定义在这里
                    编译器在编译后会将代码改为在finally中调用他们的close方法关闭
                 */
                FileOutputStream fos = new FileOutputStream("fos.dat");){
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
