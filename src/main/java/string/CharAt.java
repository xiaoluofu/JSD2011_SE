package string;

/**
 * char charAt(int index)
 * 返回给定位置的字符
 */
public class CharAt {
    public static void main(String[] args) {
        String str = "helloworld";
        char c = str.charAt(5);
        System.out.println(c);
        if (Character.isUpperCase(c)){
            System.out.println("123");
        }else{
            System.out.println(234);
        }
        String line = "上海自来水来海上";
        for (int i = 0; i<=line.length()/2;i++){
            char c1 = line.charAt(i);
            char c2 = line.charAt(line.length()-1-i);
            if(c1 != c2){
                System.out.print("不");
                break;
            }
        }
        System.out.println("是回文");
    }
}
