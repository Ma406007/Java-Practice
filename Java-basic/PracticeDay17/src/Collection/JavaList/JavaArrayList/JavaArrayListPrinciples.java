package Collection.JavaList.JavaArrayList;

public class JavaArrayListPrinciples {
    //ArrayList集合底层的扩容原理
    //1.利用空参创建的集合,在底层创建一个默认长度为0的数组
    //2.添加第一个元素时,底层会创建一个新的长度为10的数组
    //3.存满时会扩容1.5倍
    //4.如果一次添加多个元素,1.5倍还放不下,此时新创建数组的长度以实际为准 例如,有一个长度为10的ArrayList集合,要往集合一次性添加100个元素,这时新创建的数组的长度为10+100=110
}
