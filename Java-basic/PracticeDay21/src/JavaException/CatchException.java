package JavaException;

public class CatchException {
    //自己处理(捕获异常)
    /*
      格式:
      try {
          可能出现异常的代码;
      }
      catch (异常类名 变量名) {
          异常的处理代码;
      }
    */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }
    }

    //灵魂四问:
    //1.如果try中没有遇到问题,该怎么执行? 会把try里面所有的代码全部执行完毕且不会执行catch里面的代码,只有当出现异常才会执行catch里面的代码
    //2.如果try中可能遇到多个问题,该怎么执行? 只会捕捉到其中一个或几个异常,剩下的异常由于没有对应的catch就不会被捕获,JVM也不会自动地捕捉异常,catch后面的语句会正常执行
    //                                 所以要写多个catch与之对应,如果我们要捕获多个异常,这些异常中如果存在父子关系,父类一定要写在下面
    //                                 在JDK7以后可以将多个异常类型写在同一个catch中,格式:异常类型1 | 异常类型2 | ... | 异常类型n 变量名
    //                                 作用是可以同时捕获多个异常,且捕获这些异常后采取相同的处理方法
    //3.如果try中的问题没有被捕获,该怎么执行? 相当于try-catch语句没有写,JVM会自动处理
    //4.如果try中某一行遇到了问题,那么这一行的下面的代码还会执行吗? 下面的代码不会执行,会直接跳转到catch当中,执行catch里面的语句
    //                                                   如果没有对应catch与之匹配,还是会交给JVM处理
}
