package CommonAPI;

//Runtime表示当前虚拟机的运行环境

public class JavaRuntime {
    //public static Runtime getRuntime() 当前系统的运行环境对象
    //public void exit(int status) 停止虚拟机(与System中的exit方法一致)
    //public int availableProcessors() 获得CPU的线程数
    //public long maxMemory() 虚拟机能从系统中获取的总内存大小(单位byte)
    //public long totalMemory() 虚拟机已经从系统中获取的总内存大小(单位byte)
    //public long freeMemory() 虚拟机剩余内存大小(单位byte)
    //public Process exec(String command) 运行cmd命令

    public static void main(String[] args) {
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1 == r2);

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 / 1024);

        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
    }
}
