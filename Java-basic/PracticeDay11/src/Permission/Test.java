package Permission;

public class Test {
    public static void main(String[] args) {
        //权限修饰符:用来控制一个成员能够被访问的范围,可以修饰成员变量,成员方法,构造方法,内部类

        //private:只能在同一个类中使用
        //缺省/默认/空着不写:能在同一个类和同一个包中其他类中使用
        //protected:能在同一个类,同一个包中其他类和不同包下的子类使用
        //public:能在同一个类,同一个包中其他类,不同包下的子类和不同包下的无关类中使用

        //使用规则:
        //实际开发中一般只用private(成员变量私有)和public(方法公开)
        //如果方法中的代码是抽取其他方法中共性代码,这个方法一般也私有
    }
}
