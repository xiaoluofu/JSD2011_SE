package xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 使用DOM4J解析XML文档
 */
public class ParseXmlDemo {
    public static void main(String[] args) {
        /*
            使用DOM4J解析XML的大致步骤
            1:实例化SAXReader
            2:使用SAXReader读取xml文档并生成Document对象
              这一步也是DOM解析耗时耗资源的地方，因为要先读取整个XML文档并内建完整结构
              到Document对象中保存
            3:通过Document对象获取根元素
            4:从根元素开始按照XML文档的结构逐级获取子元素最终达到遍历XML文档数据的目的
         */

        try {
            //1 实例化SAXReader
            SAXReader reader = new SAXReader();

            //2 此步执行完毕后，dom解析会将xml文档以树状结构的形式保存到Document对象中
            Document doc = reader.read("./emplist.xml");


            /*
                Element的每一个实例用于表示XML文档中的一个元素(一对标签)
                Element提供了获取其表示的元素的相关信息方法，常用的有:
                String getName()
                获取元素名(标签名)

                String getText()
                获取元素体中的文本(开始与结束标签中间的文本信息)

                Element element(String name)
                获取指定名字的子元素(子标签)

                List element()
                获取当前标签中所有的子标签，集合中每个元素是一个Element实例表示其中一个子标签

                List element(String name)
                获取当前标签下所有指定的同名子标签

             */
            //3 获取根标签:<list>标签
            Element root = doc.getRootElement();
            String name = root.getName();
            System.out.println(name);

            //获取根标签下所有名为<emp>的子标签
            List<Element> list = root.elements("emp");
            System.out.println(list.size());

            //4遍历集合获取每个员工的信息
            for (Element e : list){
                //获取员工姓名
                //1获取<name>标签
                Element nameEle = e.element("name");
                //2获取<name>子标签中间的文本
                String ename = nameEle.getText();
                //获取<age>子标签中的文本
                Element ageEle = e.element("age");
                int eage = Integer.parseInt(ageEle.getText());

                /*
                    String elementText(String name)
                    该方法可以获取当前标签下指定名字的子标签中间的文本，等同上面的操作
                 */
                //获取<gender>子标签中的文本
                String egender = e.elementText("gender");

                //获取<salary>子标签中的文本
                int esalary = Integer.parseInt(e.elementText("salary"));


                //获取<emp>的id属性
                //Attribute attr = empEle.attribute("id");
                //int id =Integer.parseInt(attr.getValue());

                //int id = Integer.parseInt(empEle.attribute("id").getValue());
                /*
                    String attributeValue(String name)
                    该方法可以获取当前标签下的属性值等同上面的操作
                 */
                int id = Integer.parseInt(e.attributeValue("id"));

                System.out.println(id+" "+ename+" "+eage+" "+egender+" "+esalary);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
