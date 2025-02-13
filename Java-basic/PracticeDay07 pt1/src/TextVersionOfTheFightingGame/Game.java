package TextVersionOfTheFightingGame;

import java.util.Random;

public class Game {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"风流雅俊", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身，抓向对方的%部位。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。",
    };
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果-轰-的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去",
    };

    public Game() {

    }
    public Game(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getFace() {
        return face;
    }
    public void setFace(char gender) {
        Random rand = new Random();
        if (gender == '男') {
            this.face = boyfaces[rand.nextInt(boyfaces.length)];
        }
        else if (gender == '女') {
            this.face = girlfaces[rand.nextInt(girlfaces.length)];
        }
        else {
            this.face = "相貌平平";
        }
    }

    //定义一个方法用于攻击别人
    //谁攻击谁?
    //Game r1 = new Game();
    //Game r2 = new Game();
    //r1.attack(r2);
    //方法的调用者去攻击参数
    public void attack(Game game) {
        Random rand = new Random();
        int index = rand.nextInt(attacks_desc.length);
        String Kungfu = attacks_desc[index];

        System.out.printf(Kungfu, this.getName(), game.getName());
        System.out.println();

        //计算造成的伤害
        int hurt = rand.nextInt(20) + 1;

        //扣血
        int remainblood = game.getBlood() - hurt;
        remainblood = remainblood < 0 ? 0 : remainblood;
        game.setBlood(remainblood);

        if (remainblood > 90) {
            System.out.printf(injureds_desc[0], game.getName());
        }
        else if (remainblood > 80) {
            System.out.printf(injureds_desc[1], game.getName());
        }
        else if (remainblood > 70) {
            System.out.printf(injureds_desc[2], game.getName());
        }
        else if (remainblood > 60) {
            System.out.printf(injureds_desc[3], game.getName());
        }
        else if (remainblood > 40) {
            System.out.printf(injureds_desc[4], game.getName());
        }
        else if (remainblood > 20) {
            System.out.printf(injureds_desc[5], game.getName());
        }
        else if (remainblood > 10) {
            System.out.printf(injureds_desc[6], game.getName());
        }
        else {
            System.out.printf(injureds_desc[7], game.getName());
        }
        System.out.println();
    }

    //展示角色信息
    public void show() {
        System.out.println("姓名:" + this.getName());
        System.out.println("血量:" + this.getBlood());
        System.out.println("性别:" + this.getGender());
        System.out.println("长相:" + this.getFace());
    }
}
