package IOStream;

public class CharSet {
    //GBK字符集:2000年3月17日发布,收录21003个汉字,包含国家标准GB13000-1中的全部中日韩汉字和BIG5编码中的所有汉字
    //Windows系统默认使用的就是GBK 系统显示为ANSI

    //计算机的存储规则(汉字)(GBK)
    //规则1:汉字两个字节存储
    //规则2:高位字节二进制一定以1开头,转成十进制之后是一个负数
    //计算机的存储规则(英文)(GBK)
    //规则:英文一个字节存储,兼容ASCII码,二进制前面补0

    //Unicode字符集(万国码):国际标准字符集,它将世界各种语言的每个字符定义一个唯一的编码以满足跨语言跨平台的文本信息转换
    //UTF(Unicode Transformation Format)常见的共有三个:
    //UTF-16编码规则:用2~4个字节保存
    //UTF-32编码规则:固定使用四个字节保存
    //UTF-8编码规则(主要使用):用1~4个字节保存,其中英文一个字节存储(0开头),汉字三个字节存储(1开头)

    //乱码出现的原因:1.读取数据时未读完整个汉字 2.编码和解码的方式不统一
    //乱码解决措施:1.不要使用字节流读取文本文件 2.编码解码时要使用同一个码表和编码方式
}
