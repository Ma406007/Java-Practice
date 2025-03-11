package JavaReflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test02 {
    /*
      跟配置文件结合动态创建
      反射可以跟配置文件结合的方式,动态的创建对象,并调用方法
    */

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("PracticeDay29\\src\\prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        String className = (String)prop.getProperty("classname");
        String methodName = (String)prop.getProperty("method");
        System.out.println(className);
        System.out.println(methodName);

        Class clazz = Class.forName(className);

        Constructor con = clazz.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(obj);
    }
}
