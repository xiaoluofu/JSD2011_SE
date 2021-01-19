package test.string;

public class CharAt {
    public static void main(String[] args) {
        String str = "从前有座山";
        char c = str.charAt(4);
        System.out.println(c);

        String str2 = "上海自来水来自海上";
        for (int i =0;i<str2.length();i++){
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(str2.length()-i-1);
            if (c1 != c2){
                System.out.println("不");
                break;
            }
        }
        System.out.println("是回文");
    }
}
