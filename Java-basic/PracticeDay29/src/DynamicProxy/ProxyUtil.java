package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    /*
      Java中可以用java.lang.reflect.Proxy类来创建代理对象
      public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
      参数一:用于指定类加载器,加载生成的代理类
      参数二:指定接口,这些接口用于指定生成的代理拥有哪些方法
      参数三:用来指定生成的代理对象要干什么
    */
    public static Star createProxy(BigStar bigStar) {
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//参数一:用于指定类加载器,加载生成的代理类
                new Class[]{Star.class},//参数二:指定接口,这些接口用于指定生成的代理拥有哪些方法
                //参数三:用来指定生成的代理对象要干什么
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    /*
                      参数一:代理的对象
                      参数二:要运行的方法
                      参数三:调用方法时传递的实参
                    */
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒,收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地,收钱");
                        }
                        //代码的表现形式:调用BigStar里面对应的方法
                        return method.invoke(bigStar, args);
                    }
                }
        );
        return star;
    }

    //为什么需要代理? 代理可以无侵入式的给对象增强其他的功能
    //代理长什么样? 代理里面就是对象要被代理的方法
    //Java通过什么来保证代理的样子? 通过接口保证,后面的对象和代理需要实现同一个接口,接口中就是被代理的所有方法
}
