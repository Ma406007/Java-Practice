public class methodoverload {
    public static void main(String[] args) {

    }
    //在同一个类中定义了多个同名的方法,这些同名的方法具有同种的功能
    //每个方法具有不同的参数类型或参数个数,这些同名的方法就构成了重载关系
    //简记:同一个类中,方法名相同,参数不同的方法.与返回值无关
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
