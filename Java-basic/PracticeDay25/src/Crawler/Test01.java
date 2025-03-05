package Crawler;

import java.io.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) throws IOException {
        String net1 = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String net2 = "http://www.haoming8.cn/baobao/10881.html";
        String net3 = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = webCrawler(net1);
        String boyNameStr = webCrawler(net2);
        String girlNameStr = webCrawler(net3);

        ArrayList<String> FamilyNameTempList = getData(familyNameStr, "([^\\w]{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(.. ){4}..", 0);
        
        
        ArrayList<String> FamilyNameList = new ArrayList<>();
        for (String str : FamilyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                FamilyNameList.add(str.charAt(i) + "");
            }
        }

        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                boyNameList.add(str);
            }
        }

        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            Collections.addAll(girlNameList, arr);
        }

        ArrayList<String> NameList = getInfos(FamilyNameList, boyNameList, girlNameList, 50, 30);
        Collections.shuffle(NameList);

        BufferedWriter bw = new BufferedWriter(new FileWriter("PracticeDay25\\names.txt"));
        for (String name : NameList) {
            bw.write(name);
            bw.newLine();
        }
        bw.close();
    }

    /*
      作用:获取男生和女生的信息
      形参:
        参数一:装着姓氏的集合
        参数二:装着男生名字的集合
        参数三:装着女生名字的集合
        参数四:男生的个数
        参数五:女生的个数
    */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        HashSet<String> boyHashSet = new HashSet<>();
        while (true) {
            if (boyHashSet.size() == boyCount) {
                break;
            }

            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);

            boyHashSet.add(familyNameList.get(0) + boyNameList.get(0));
        }

        HashSet<String> girlHashSet = new HashSet<>();
        while (true) {
            if (girlHashSet.size() == girlCount) {
                break;
            }

            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);

            girlHashSet.add(familyNameList.get(0) + girlNameList.get(0));
        }

        ArrayList<String> InfosList = new ArrayList<>();
        Random random = new Random();
        for (String boyName : boyHashSet) {
            int age = random.nextInt(10) + 18;
            InfosList.add(boyName + "-男-" + age);
        }

        for (String girlName : girlHashSet) {
            int age = random.nextInt(8) + 18;
            InfosList.add(girlName + "-女-" + age);
        }

        return InfosList;
    }

    /*
      作用:
        根据正则表达式获取字符串中的数据
      参数一:
        完整的字符串
      参数二:
        正则表达式
      参数三:
        下标
      返回值:
        真正想要的数据
    */
    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        //按照正则表达式的规则去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则,到str中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    /*
      作用:
        从网络中爬取数据,把数据拼接成字符串返回
      形参:
        网址
      返回值:
        爬取到的所有数据
    */
    public static String webCrawler(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);

        //连接上这个网址
        //要保证网络是畅通的,并且这个网址是可以连接上的
        URLConnection coon = url.openConnection();
        InputStreamReader isr = new InputStreamReader(coon.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char)ch);
        }
        isr.close();

        return sb.toString();
    }
}
