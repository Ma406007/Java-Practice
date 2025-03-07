package NetworkProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //static InetAddress getByName(String host) 确定主机名称的IP地址(主机名称可以是机器名称,也可以是IP地址)
        //IP的对象 也就是一台电脑的对象
        InetAddress inetAddress = InetAddress.getByName("LAPTOP-6N8RGT4K");
        System.out.println(inetAddress);

        //String getHostName() 获取此IP地址的主机名
        String name =  inetAddress.getHostName();
        System.out.println(name);

        //String getHostAddress() 返回文本显示中的IP地址字符串
        String ip = inetAddress.getHostAddress();
        System.out.println(ip);
    }
}
