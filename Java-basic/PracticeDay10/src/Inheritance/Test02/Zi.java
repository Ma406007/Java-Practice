package Inheritance.Test02;

public class Zi extends Fu {
//    String name = "Zi";
//    public void ziShow() {
//        String name = "ziShow";
//        System.out.println(name);//Zi
//        System.out.println(this.name);//ziShow
//        System.out.println(super.name);//Fu
//    }
    String name = "Zi";
    String game = "吃鸡";

    public void show() {
        //如何打印Zi
        System.out.println(name);
        System.out.println(this.name);
        //如何打印Fu
        System.out.println(super.name);
        //如何打印喝茶
        //根据就近原则会向上查找
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);
        //如何打印吃鸡
        System.out.println(game);
        System.out.println(this.game);
    }
}
