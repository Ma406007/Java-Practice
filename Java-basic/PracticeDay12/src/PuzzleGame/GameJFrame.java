package PuzzleGame;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //游戏相关逻辑

    //创建二维数组管理数据
    int[][] imageArr = new int[4][4];

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    //定义变量记录当前展示图片的路径
    String defaultPath1 = "PracticeDay12\\image\\animal\\animal1\\";
    String defaultPath2 = "PracticeDay12\\image\\girl\\girl1\\";
    String defaultPath3 = "PracticeDay12\\image\\sport\\sport1\\";

    StringBuilder path1 = new StringBuilder("PracticeDay12\\image\\animal\\");
    StringBuilder path2 = new StringBuilder("PracticeDay12\\image\\girl\\");
    StringBuilder path3 = new StringBuilder("PracticeDay12\\image\\sport\\");

    //定义一个二维数组存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义一个变量来记录步数
    int step = 0;

    //创建更换图片
    JMenu changeImage = new JMenu("更换图片");
    //创建JMenuItem的对象
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    //创建选项下面的条目对象
    JMenuItem replayJMenuItem = new JMenuItem("重新游戏");
    JMenuItem reLoginJMenuItem = new JMenuItem("重新登录");
    JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");

    JMenuItem accountJMenuItem = new JMenuItem("公众号");


    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        //initImage();
        initImage(defaultPath1);

        //让窗口显示出来
        this.setVisible(true);

    }

    private void initData() {
        Random rand = new Random();
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int count = 0;

        for (int i = 0; i < tempArr.length; i++) {
            int index = rand.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            imageArr[i / 4][i % 4] = tempArr[i];
        }
    }

    //动物图片
    private void initImage(String imagePath) {
        //清空原本出现的图片
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("PracticeDay12\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数:" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        //先加载的图片在上方,后加载的图片在下方
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个JLabel的对象(管理容器)
                //JLabel imageLabel = new JLabel(new ImageIcon(defaultPath1 + imageArr[i][j] + ".jpg"));
                JLabel imageLabel = new JLabel(new ImageIcon(imagePath + imageArr[i][j] + ".jpg"));
                //指定图片位置和大小
                imageLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                //RAISED:让图片凸起
                //LOWERED:让图片凹陷
                imageLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                this.getContentPane().add(imageLabel);
            }
        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("PracticeDay12\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    //美女图片
    private void initImage2() {
        //清空原本出现的图片
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("PracticeDay12\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数:" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        Random rand = new Random();
        int imagePath = rand.nextInt(8) + 1;
        //先加载的图片在上方,后加载的图片在下方
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个JLabel的对象(管理容器)
                JLabel imageLabel = new JLabel(new ImageIcon(path1 + "animal" + imagePath + "\\" + imageArr[i][j] + ".jpg"));
                //指定图片位置和大小
                imageLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                //RAISED:让图片凸起
                //LOWERED:让图片凹陷
                imageLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                this.getContentPane().add(imageLabel);
            }
        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("PracticeDay12\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    //运动图片
    private void initImage3() {
        //清空原本出现的图片
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("PracticeDay12\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数:" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        Random rand = new Random();
        int imagePath = rand.nextInt(8) + 1;
        //先加载的图片在上方,后加载的图片在下方
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个JLabel的对象(管理容器)
                JLabel imageLabel = new JLabel(new ImageIcon(path1 + "animal" + imagePath + "\\" + imageArr[i][j] + ".jpg"));
                //指定图片位置和大小
                imageLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                //RAISED:让图片凸起
                //LOWERED:让图片凹陷
                imageLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                this.getContentPane().add(imageLabel);
            }
        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("PracticeDay12\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象(功能 关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");

        //将每一个选项下面的条目添加到对应选项中
        functionJMenu.add(changeImage);
        functionJMenu.add(replayJMenuItem);
        functionJMenu.add(reLoginJMenuItem);
        functionJMenu.add(closeJMenuItem);

        aboutJmenu.add(accountJMenuItem);

        //将菜单里面的两个选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJmenu);

        //把美女,动物,运动添加到更换图片中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        //给条目绑定事件
        replayJMenuItem.addActionListener(this);
        reLoginJMenuItem.addActionListener(this);
        closeJMenuItem.addActionListener(this);
        accountJMenuItem.addActionListener(this);

        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(603,680);

        //设置界面标题
        this.setTitle("拼图单机版 v1.0");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中放置
        this.setLayout(null);

        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //把界面中所有图片删除
            this.getContentPane().removeAll();
            //加载第一张完整的图片
            JLabel all = new JLabel(new ImageIcon(defaultPath1 + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("PracticeDay12\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            //刷新
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利,如果胜利该方法直接结束
        if (victory()) {
            return;
        }

        //对上下左右进行判断
        //左:37 上:38 右:39 下:40
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }
            //把空白块下方的数字赋值给空白方块
            imageArr[x][y] = imageArr[x][y + 1];
            imageArr[x][y + 1] = 0;
            //调用方法按照最新数字加载图片
            y++;
            step++;
            //initImage();
            initImage(defaultPath1);
        }
        else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                return;
            }
            //把空白块下方的数字赋值给空白方块
            imageArr[x][y] = imageArr[x + 1][y];
            imageArr[x + 1][y] = 0;
            //调用方法按照最新数字加载图片
            x++;
            step++;
            //initImage();
            initImage(defaultPath1);
        }
        else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            //把空白块下方的数字赋值给空白方块
            imageArr[x][y] = imageArr[x][y - 1];
            imageArr[x][y - 1] = 0;
            //调用方法按照最新数字加载图片
            y--;
            step++;
            //initImage();
            initImage(defaultPath1);
        }
        else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            //把空白块下方的数字赋值给空白方块
            imageArr[x][y] = imageArr[x - 1][y];
            imageArr[x - 1][y] = 0;
            //调用方法按照最新数字加载图片
            x--;
            step++;
            //initImage();
            initImage(defaultPath1);
        }
        else if (code == 65) {
            //initImage();
            initImage(defaultPath1);
        }
        else if (code == 87) {
            imageArr = new int[][] {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            //initImage();
            initImage(defaultPath1);
        }
    }

    public boolean victory() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (imageArr[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //实现图片的随机选择
        Random rand = new Random();
        int imagePath = rand.nextInt(8) + 1;
        //获取当前被点击的条目对象
        Object obj = e.getSource();
        //判断
        if (obj == replayJMenuItem) {
            System.out.println("重新游戏");
            //计步器清零
            step = 0;
            //再次打乱图片
            initData();
            //重新加载图片
            //initImage();
            initImage(defaultPath1);
        }
        else if (obj == reLoginJMenuItem) {
            System.out.println("重新登录");
            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        }
        else if (obj == closeJMenuItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        }
        else if (obj == accountJMenuItem) {
            System.out.println("公众号");
            //创建一个弹框对象
            JDialog dialog = new JDialog();
            //创建一个管理图片的容器对象
            JLabel label = new JLabel(new ImageIcon("PracticeDay12\\image\\about.png"));
            //设置位置和宽高
            label.setBounds(0, 0, 258, 258);
            //把图片添加到弹框当中
            dialog.getContentPane().add(label);
            //给弹框设置大小
            dialog.setSize(344, 344);
            //让弹框置顶
            dialog.setAlwaysOnTop(true);
            //让弹框居中
            dialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            dialog.setModal(true);
            //让弹框显示出来
            dialog.setVisible(true);
        }
        else if (obj == animal) {
        }
    }
}
