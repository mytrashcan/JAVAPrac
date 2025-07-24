package chapter04;

// 예제 4-3
import java.util.Scanner;
public class GoodsArray {
    public static void main(String[] args) {
        Goods[] goodsArray;
        goodsArray = new Goods[3];

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < goodsArray.length; i++) {
            String name = sc.next();
            int price = sc.nextInt();
            int numberOfStock = sc.nextInt();
            int sold = sc.nextInt();

            goodsArray[i] = new Goods(name, price, numberOfStock, sold);
        }

        for(int i = 0; i < goodsArray.length; i++){
            System.out.print(goodsArray[i].getName() + " ");
            System.out.print(goodsArray[i].getPrice() + " ");
            System.out.print(goodsArray[i].getNumberOfStock() + " ");
            System.out.println(goodsArray[i].getSold());
        }

        sc.close();
    }
}
