package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Hollow
 * @create 2020/12/29 0029 9:17
 * 字符流
 * 字符流的超类是：java.io.Reader和Writer
 * 字符流的最小读写单位是一个字符(char)。但是实际上底层还是读写字节
 * 只是字符流与字节的转换工作由字符流完成。所以字符流只适合读写文本数据。
 *
 * 转换流：java,io.InputStreamReader和OutputStreamWriter
 * 转换流是一对高级流，我们实际应用中几乎不会直接操作转换流，但是在流链接的建立中他们是非常重要的一环
 * 起到的作用是衔接其他高级字符流与字节流的“桥梁”
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        /*
            创建时通常在构造方法中再传入第二个参数：指定字符集的名字
            这样通过转换流写出的字符都会按照该字符集转换为字节后写出

            如果不指定第二个参数，则默认使用系统字符集，不推荐这样做！
            这样不利于跨平台（不同的系统默认的字符集可能不相同）
         */
        osw.write("wdnmd");
        osw.write(" fgnb");
        System.out.println("写出完毕");
        osw.close();
    }
}
