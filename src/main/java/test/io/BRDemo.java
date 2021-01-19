package test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/io/BRDemo.java");
        InputStreamReader ins = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(ins);

        String line ;
        while ((line = br.readLine()) !=null){
            System.out.println(line);
        }
        br.close();
    }
}
