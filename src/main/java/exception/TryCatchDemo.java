package exception;

/**
 * @author Hollow
 * @create 2020/12/29 0029 15:22
 * 异常处理机制中的try-catch
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
//            String str = null;
//            String str = "";
            String str = "a";
            /*
                当JVM执行某句代码出现了一个异常时，就会实例化这个异常的实例来表示这种问题
                并将程序的执行过程设置进去以便追查错误出现的位置
                然后将该异常抛出
             */
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
            /*
                try语句块中出现错误的语句之后的内容都不会执行
             */
            System.out.println("wdnmddndndndndndnndndndndndnndndnd");
            //try语句块中没有异常发生时，catch不会执行。
        }catch (NullPointerException e){
            System.out.println("出现了空指针异常");
            //catch可以写多个，针对try中不同的异常可以分别捕获并处理
        }catch (StringIndexOutOfBoundsException e ){
            System.out.println("出现了字符串下标越界");
        /*
            当多个不同的异常需要使用相同的方法处理时，我们可以捕获这几种异常的超类异常。
            也可以为了避免出现未捕获的异常导致程序中断在最后一个catch处捕获Exception
            当多个catch的异常存在继承关系时，要先catch子类型异常后catch超类型异常
         */
        }catch (Exception e){
            System.out.println("出错了");
        }

        System.out.println("程序结束了");

    }
}
