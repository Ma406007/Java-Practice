public class array {
    public static void main(String[] args) {
        //完整格式
        int [] arr1 = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //简化格式
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //直接打印数组名得到的是数组的地址值
        System.out.println(arr1);
        System.out.println(arr2);

        //获取数组长度
        int len1 = arr1.length;
        int len2 = arr2.length;
        System.out.println(len1);
        System.out.println(len2);

        //快速生成数组遍历方式:数组名.fori
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //动态初始化
        int [] arr3 = new int [10];
    }
}
