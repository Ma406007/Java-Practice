package RegularExpression;

//正则表达式可以校验字符串是否满足一定的规则,并用来校验数据格式 也可以在一段文本中查找满足要求的内容
//public boolean matches(String regex) 判断是否与正则表达式匹配,匹配返回true

public class Regex {
    //字符类(只匹配一个字符)
    //[abc] 只能是a,b或c
    //[^abc] 除了a,b,c之外的任何字符
    //[a-zA-Z] a到Z A到z 包括(范围) 取并集
    //[a-d[m-p]] a到d,或m到p 取并集
    //[a-z&&[def]] a到z和def的交集 为d,e,f
    //[a-z&&[^bc]] a到z和非bc的交集 等同于[ad-z]
    //[a-z&&[^m-p]] a到z和除了m到p的交集 等同于[a-lq-z]

    //预定义字符(只匹配一个字符)
    //. 任何字符
    //\d 一个数字:[0-9]
    //\D 非数字:[^0-9]
    //\s 一个空白字符:[\t\n\xOB\f\r]
    //\S 非空白字符:[^\s]
    //\w [a-zA-Z_0-9] 英文,数字,下划线
    //\W [^\w]一个非单词字符

    //数量词
    //X? X出现一次或0次
    //X* X出现0次或多次
    //X+ X出现一次或多次
    //X{n} X出现正好n次
    //X{n,} X出现至少n次
    //X{n,m} X出现至少n次但不超过m次

    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));
        System.out.println("ab".matches("[abc][abc]"));

        System.out.println("你a".matches(".."));
        System.out.println("3".matches("\\d"));

        System.out.println("2442fsfsfs".matches("\\w{6,}"));
    }
}
