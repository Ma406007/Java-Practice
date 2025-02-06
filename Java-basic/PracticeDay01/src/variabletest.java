public class variabletest {
    public static void main(String[] args) {
        // 一开始没有乘客
        int count = 0;

        // 第一站上去一位乘客
        count++;

        // 第二站上去两位乘客,下来一位乘客
        count += 2;
        count--;

        // 第三站上去两位乘客,下来一位乘客
        count += 2;
        count--;

        // 第四站下来一位乘客
        count--;

        // 第五站上去一位乘客
        count++;

        // 问:到了终点站车上共几位乘客
        System.out.println(count);
    }
}
