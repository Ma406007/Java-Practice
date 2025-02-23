package Generics;

import java.util.ArrayList;

public class GenericsWildCard {
    public static void main(String[] args) {
        ArrayList<ye> list1 = new ArrayList<>();
        ArrayList<fu> list2 = new ArrayList<>();
        ArrayList<zi> list3 = new ArrayList<>();

        method(list1);
        //泛型不具有继承性,但是数据具有继承性,此时需要通配符来解决
        method(list2);
        method(list3);
    }

    //?也表示不确定的类型
    //它可以进行类型的限定
    //? extends E 表示可以传递E或者E所有的子类类型
    //? super E 表示可以传递E或者E所有的父类类型
    public static void method(ArrayList<? extends ye> list) {

    }
    //如果类型不确定,但是能知道以后只能传递某个继承体系中的类,就可以使用泛型的通配符
    //关键:泛型的通配符可以限定类型的范围
}

class ye {

}

class fu extends ye {

}

class zi extends fu {

}
