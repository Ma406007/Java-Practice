package JavaProperties;

//常见的配置文件:XML,ini,YAML,properties
//配置文件的好处:1.可以把软件的设置永久化存储 2.如果我们要修改参数,不需要改动代码,直接修改配置文件就可以了

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaProperties {
    //properties是一个双列集合,拥有Map集合所有的特点
    //properties中有一些特有的方法,可以把集合中的数据按照键值对的形式写到配置文件当中,也可以把配置文件中的数据读取到集合中来
    public static void main(String[] args) throws IOException {
        //创建对象
        Properties prop = new Properties();

        //添加数据
        //虽然我们可以往Properties当中添加任意的数据类型,但是一般只会往里面添加字符串类型的数据
        prop.put("aaa", "bbb");
        prop.put("ccc", "ddd");
        prop.put("eee", "fff");
        prop.put("ggg", "hhh");

        //把集合中的数据以键值对的形式写到本地文件中
        FileOutputStream fos = new FileOutputStream("PracticeDay26\\src\\JavaProperties\\properties.txt");
        //comments为注释,一般不写中文
        prop.store(fos, "test");
        fos.close();

        Properties prop1 = new Properties();

        //读取本地Properties文件里面的数据
        FileInputStream fis = new FileInputStream("PracticeDay26\\src\\JavaProperties\\properties.txt");
        prop1.load(fis);
        fis.close();

        System.out.println(prop1);
    }
}
