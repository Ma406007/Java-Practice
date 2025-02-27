package JavaException;

public class Introduction {
    //异常:Exception,代表程序可能出现的问题,通常会用Exception及其子类来封装程序出现的问题

    //异常体系的最上层父类是Exception,分为运行时异常和编译时异常
    //运行时异常:RuntimeException及其子类,编译阶段不会出现异常提醒,运行时出现的异常(如:数组索引越界异常),作用在于提醒程序员
    //编译时异常:直接继承于Exception,没有继承RuntimeException的异常,编译阶段就会出现异常提醒的(如:日期解析异常),一般是由于参数传递错误带来的问题
}
