package JavaException;

public class NameFormatException extends RuntimeException {
    //NameFormat:当前异常的名字,表示姓名格式化问题
    //Exception:表示当前是一个异常类

    //运行时异常:继承RuntimeException
    //编译时异常:继承Exception
    public NameFormatException() {}
    public NameFormatException(String message) {
        super(message);
    }
}
