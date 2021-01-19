package exception;

/**
 * @author Hollow
 * @create 2020/12/30 0030 11:14
 * 非法的年龄异常
 *
 * 自定义异常，通常用来定义程序中特定的错误，比如符合语法不符合某业务时导致的问题
 * 自定义异常要做到见名知义，异常还要满足以下几个工作：
 * 1:是Exception的子类，直接继承或间接继承都可以
 * 2.提供Exception定义的所有构造器
 */
public class IllegalAgeExeception extends Exception{
    public IllegalAgeExeception() {
    }

    public IllegalAgeExeception(String message) {
        super(message);
    }

    public IllegalAgeExeception(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeExeception(Throwable cause) {
        super(cause);
    }

    public IllegalAgeExeception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
