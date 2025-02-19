package CommonAPI;

//System是一个工具类,提供了一些与系统相关的方法

public class JavaSystem {
    //public static void exit(int status) 终止当前运行的Java虚拟机 status为状态码 0:当前虚拟机正常停止 非0:当前虚拟机异常停止
    //public static long currentTimeMillis() 返回当前系统的事件毫秒值形式
    //public static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数) 拷贝数组(如果都是基本数据类型则类型必须保持一致否则报错 如果都是引用数据类型那么子类类型可以赋值给父类类型)

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            System.out.print(" ");
        }
    }
}
