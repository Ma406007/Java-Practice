package PuzzleGame;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册相关逻辑

    public RegisterJFrame() {
        //初始化界面
        initJFrame();
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(488,500);

        //设置界面标题
        this.setTitle("拼图注册");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //让窗口显示出来
        this.setVisible(true);
    }
}
