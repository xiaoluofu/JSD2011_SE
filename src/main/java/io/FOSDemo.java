package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Hollow
 * @create 2020/12/28 0028 9:28
 * JAVA标准的IO，即：标准的输入与输出
 * 标准IO将读操作和写操作完全分开，并且用方向进行了划分：输入用来读，输出用来写。
 * java.io.InputStream,OutputStream是所有字节输入流与输出流的超类，里面规定了读写的基础方法(抽象方法)。
 * 实际读写不同设备的字节流都继承自他们。使得我们将来可以用相同的方式利用这些流来完成对不同设备统一的读写操作。
 *
 * java将流划分为两大类
 * 节点流：真实链接我们程序和数据源的"管道"，负责实际搬运数据。因此链接的另一端是明确的。读写一定是建立在节点流基础上进行的。
 * 处理流：不能独立存在，必须链接在其他流上，目的是当数据"流经"当前流时对其做某些加工处理，简化我们对此的相关操作
 * 节点流一般也称为：低级流   处理流一般也称为：高级流
 * 实际应用中我们往往会通过串联一组高级流并最终链接到低级流上讲一个复杂的数据的读写操作以流水线式的加工来完成，这个过程称为流的链接。
 *
 * 文件流：java.io.FileOutputStream和FileInputStream
 * 他们是一对低级流，用于读写文件数据的流
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("fos.txt");
        /*
            文件流常见的构造方法：
            FileOutputStream(File file)
            FileOutputStream(String path)
            以上两种方式创建的文件流为覆盖模式，即：如果指定的文件已经存在
            会将该文件原有的数据全部删除。然后将通过当前流写出的内容全部保存到文件中

            FileOutputStream(File file ,boolean append)
            FileOutputStream(String path,boolean append)
            如果第二个参数为true，则是追加模式，即：如果指定的文件已存在
            则原有的数据都会被保留。新写入的内容都会被顺序追加到文件末尾。
         */


        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        fos.write("fgnb".getBytes(StandardCharsets.UTF_8));
        fos.write("法国南部".getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");
        fos.close();

    }
}
