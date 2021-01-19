package file;

import java.io.File;

/**
 * @author Hollow
 * @create 2020/12/24 0024 14:36
 * lambda表达式的引入是在JDK8之后开始的
 * lambda可以让我们以更精简的语法创建匿名内部类
 *
 * 语法：
 * (参数列表)->{
 *     方法体
 * }
 * lambda创建时要求实现的接口中只能有一个抽象方法，否则不可以使用
 */
public class Lambda {
    public static void main(String[] args) {
        File dir = new File("./");
        if (dir.isDirectory()){

//            FileFilter filter = (file)->{
//                return file.getName().endsWith(".txt");
//            };

            /*
                lambda表达式创建时，如果方法只有一句代码，那么方法的{}可以省略。
                若果这句话代码有return，那么return也必须省略
             */
//            FileFilter filter = (file)-> file.getName().endsWith(".txt");
//            File[] subs = dir.listFiles(filter);

            File[] subs = dir.listFiles((file)-> file.getName().endsWith(".txt"));
            System.out.println(subs.length);
        }
    }

}
