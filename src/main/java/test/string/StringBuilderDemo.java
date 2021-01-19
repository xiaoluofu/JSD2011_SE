package test.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习，天天向上";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.append("，这样才能找到工作").toString());

        System.out.println(sb.replace(9,18,"，才是王道"));

        System.out.println(sb.insert(0,"我要"));

    }
}
