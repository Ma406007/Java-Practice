package DynamicProxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //1.获取代理的对象
        BigStar bigStar = new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(bigStar);

        //2.调用唱歌的方法
        String result = proxy.sing("只因你太美");
        System.out.println(result);

        //3.调用跳舞的方法
        proxy.dance();
    }
}
