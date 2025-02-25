package ComprehensiveTest;

import java.util.HashMap;

public class Test04 {
    /*
      需求:
      定义一个Map集合,键用省份(province)表示,值表示city,但是市会有多个
      添加完毕后,遍历结果格式如下:
      江苏省 = 南京市, 扬州市, 苏州市, 无锡市, 常州市
      湖北省 = 武汉市, 孝感市, 十堰市, 宜昌市, 鄂州市
      河北省 = 石家庄市, 唐山市, 邢台市, 保定市, 张家口市
    */

    public static void main(String[] args) {
        HashMap<String, String[]> map = new HashMap<>();
        String[] Jiangsu = {"南京市", "扬州市", "苏州市", "无锡市", "常州市"};
        String[] Hubei = {"武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市"};
        String[] Hebei = {"石家庄市", "唐山市", "邢台市", "保定市", "张家口市"};

        map.put("江苏省", Jiangsu);
        map.put("湖北省", Hubei);
        map.put("河北省", Hebei);

        for (String key : map.keySet()) {
            StringBuilder KeyValue = new StringBuilder(key + " = ");
            for (int i = 0; i < map.get(key).length; i++) {
                if (i == map.get(key).length - 1) {
                    KeyValue.append(map.get(key)[i]);
                }else {
                    KeyValue.append(map.get(key)[i]).append(", ");
                }
            }
            System.out.println(KeyValue);
        }
    }
}
