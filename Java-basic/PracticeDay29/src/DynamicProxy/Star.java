package DynamicProxy;

//动态代理是一种在运行时动态生成代理类和代理对象的技术
//代理对象可以在不修改目标对象代码的情况下对目标对象的方法进行增强,例如添加日志记录,事务管理等功能

//原理:
//动态代理的核心原理是通过Java的反射机制在运行时创建一个实现了指定接口的代理类,并生成该代理类的实例
//代理对象会拦截对目标对象方法的调用,并在调用前后执行额外的逻辑,然后再将调用转发给目标对象

public interface Star {
    //可以把想要被代理的方法定义在interface接口当中
    public abstract String sing(String name);

    public abstract void dance();
}
