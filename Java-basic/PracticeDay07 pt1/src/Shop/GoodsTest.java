package Shop;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];

        Goods g1 = new Goods(1, "华为mate70", 5999.0, 100);
        Goods g2 = new Goods(2, "小米15", 4999.0, 100);
        Goods g3 = new Goods(3, "苹果16", 9999.0, 100);

        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getName() + " " + goods[i].getPrice() + " " + goods[i].getCount());
        }
    }
}
