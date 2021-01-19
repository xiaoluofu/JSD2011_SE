package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Hollow
 * @create 2020/12/25 0025 14:02
 * RAF读写基本类型数据，以及RAF基于指针的读写操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
        //创建RAF后指针默认在文件最开始处。位置的表示与数组下标一样从0开始。
        long pos = raf.getFilePointer();
        System.out.println("pos:"+pos);
        //向文件中写入int最大值
        /*
            int 最大值：
            01111111 11111111 11111111 11111111
                                       vvvvvvvv
            01111111 11111111 11111111 11111111

            max>>>24
            00000000 00000000 00000000 11111111
         */
        int max = Integer.MAX_VALUE;
        raf.write(max>>>24);
        System.out.println("pos:"+raf.getFilePointer());
        raf.write(max>>>16);
        System.out.println("pos:"+raf.getFilePointer());
        raf.write(max>>>8);
        System.out.println("pos:"+raf.getFilePointer());
        raf.write(max);
        System.out.println("pos:"+raf.getFilePointer());
        System.out.println("写入完毕");
        raf.writeInt(max);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeDouble(123456.33);
        System.out.println("pos:"+raf.getFilePointer());
        raf.writeLong(22222222222L);
        System.out.println("pos:"+raf.getFilePointer());

        raf.seek(0);//移动指针到指定位置(下标)
        /*
            RAF同样提供了方便读取基本类型的方法
            int readInt()
            连续读取四个字节并将其转换为对应的int值返回
         */
        System.out.println(raf.readInt());
        System.out.println(raf.readInt());
        System.out.println(raf.readDouble());
        System.out.println(raf.readLong());
        /*
            readInt,readLong这些方法在读取相应的字节数的过程中
            读取到了文件末尾则会直接抛出EOFException。并不是再用-1表示读取到了文件末尾
         */
//        raf.seek(23);
//        System.out.println(raf.readInt());

        raf.close();

    }
}
