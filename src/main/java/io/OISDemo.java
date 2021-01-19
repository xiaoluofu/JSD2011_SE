package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Hollow
 * @create 2020/12/28 0028 16:50
 * 对象输入流
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //将person.obj文件中的对象读取回来
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        /*
            Object readObject()
            通过其链接的流将字节读取回来并还原为对应的java对象，返回是以Object类型返回的。
            接收后需要自行做类型转换(造型)
            如果读取的字节表示的部分java对象(字节不是通过对象输出流将一个对象转换的字节)
            则会抛出异常：ClassNotFoundException
         */

        Person p  =(Person) ois.readObject();
        System.out.println(p);
        System.out.println("读完毕");
        ois.close();

    }
}
