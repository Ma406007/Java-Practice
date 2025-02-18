import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

//KeyListener常用方法
//void keyPressed(KeyEvent e) 按下键时调用
//void keyReleased(KeyEvent e) 当键已被释放时调用
//void keyTyped(KeyEvent e) 键入键时调用

public class MyFrame2 extends JFrame implements KeyListener {
    public MyFrame2() {
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

        //给整体窗体添加键盘监听
        this.addKeyListener(this);

        //让整个界面显示出来
        this.setVisible(true);
    }

    //如果按下一个按键没有松开就会重复地去调用keyPressed方法
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");

        //获取键盘上每一个按键的编号
        int code = e.getKeyCode();
        System.out.println(code);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
