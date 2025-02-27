package JavaException;

public class ThrowException {
    //抛出处理
    //throws:写在方法定义处,表示声明一个异常,告诉调用者,使用本方法可能会有哪些异常
    /*
      格式:
      public void 方法() throws 异常类名1, 异常类名2... {
          ...
      }
    */
    //编译时异常必须要写,运行时异常可以不写

    public static void main(String[] args) {
        //throw:写在方法内,结束方法,手动抛出异常对象,交给调用者,方法中下面的代码不再执行
        /*
          格式:
          public void 方法() {
              throw new NullPointerException();
          }
        */

        int[] arr = new int[0];
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }
        if  (arr.length == 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("检查执行代码");//throw后的语句不会执行
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
