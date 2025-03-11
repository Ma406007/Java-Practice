package TCP;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        //UUID可以用来获取随机的名称
        //方法
        //static UUID randomUUID() 获取类型4(伪随机)的UUID的静态工厂
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
    }
}
