import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//MouseListener常用方法
//void mouseClicked(MouseEvent e) 在组件上单击(按下并释放)鼠标按钮时调用
//void mouseEntered(MouseEvent e) 当鼠标进入组件时调用
//void mouseExited(MouseEvent e) 当鼠标退出组件时调用
//void mousePressed(MouseEvent e) 在组件上按下鼠标按钮时调用
//void mouseReleased(MouseEvent e) 在组件上释放鼠标按钮时调用

public class MyFrame1 extends JFrame implements MouseListener {
    //创建一个按钮对象
    JButton jtb1 = new JButton("点击");

    public MyFrame1() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面指定
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置,只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        //给按钮设置位置和宽高
        jtb1.setBounds(0, 0, 100, 50);
        //给按钮绑定鼠标事件
        jtb1.addMouseListener(this);

        //将按钮添加到整个界面当中
        this.getContentPane().add(jtb1);

        //让整个界面显示出来
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
