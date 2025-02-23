package Collection;

//增强for的底层就说迭代器,是为了简化迭代器的代码书写的
//它是JDK5之后出现的,其内部原理就是一个Iterator迭代器
//所有的单列集合和数组才能用增强for进行遍历

import java.util.ArrayList;
import java.util.Collection;

public class ForEach {
    /*
      增强for格式
      for (元素的数据类型 变量名: 数组或者集合) {

      }
      快速生成方式:
      集合名/数组名+for
    */

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        for (String s : collection) {
            //修改增强for中的变量,不会改变集合中原本的数据
            s = "qqq";
        }
        System.out.println(collection);
    }
}
