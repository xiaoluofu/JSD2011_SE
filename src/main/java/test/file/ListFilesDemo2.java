package test.file;

import java.io.File;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File("./");
        if (dir.isDirectory()){
//            FileFilter filter = new FileFilter() {
//                @Override
//                public boolean accept(File file) {
//                    return file.getName().endsWith(".txt");
//                }
//            };
//            File[] files = dir.listFiles(filter);


//            File[] files = dir.listFiles(new FileFilter() {
//                @Override
//                public boolean accept(File file) {
//                    return file.getName().endsWith(".txt");
//                }
//            });


//            FileFilter filter = (file)->{
//                return file.getName().endsWith(".txt");
//            };
//            File[] files = dir.listFiles(filter);

            File[] files = dir.listFiles((file) -> (file.getName().endsWith(".txt")));


            for (int i = 0;i < files.length;i++){
                System.out.println(files[i]);
            }
        }else{
            System.out.println("这不是个目录");
        }

    }
}
