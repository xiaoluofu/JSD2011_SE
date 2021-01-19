package test.string;

public class SubstringDemo {

    public String getHost(String address){
        int index1 = address.indexOf(".");
        int index2 = address.indexOf(".",index1+1);
        return address.substring(index1+1,index2);
    }


    public static void main(String[] args) {
        String host ="www.tedu.com";
        String s1 = host.substring(4, 8);
        System.out.println(s1);

        SubstringDemo s = new SubstringDemo();

        String address = "doc.canglaoshi.org";
        String host1 = s.getHost(address);
        System.out.println(host1);

        String address2 = "http://www.tedu.org";
        String host2 = s.getHost(address2);
        System.out.println(host2);
    }
}
