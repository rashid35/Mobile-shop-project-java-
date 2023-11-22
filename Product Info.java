import java.util.ArrayList;
import java.util.Scanner;

public abstract class Product_Info {
    Scanner scanner = new Scanner(System.in);
    Login_Info info = new Login_Info();
    static ArrayList<String> product_list = new ArrayList<>();
    static ArrayList<Integer> product_price = new ArrayList<>();
    void add(){
        product_list.add("Nokia 5 A");
        product_list.add("Xoumi 12");
        product_list.add("Redmi pro 12");
        product_list.add("Samsung");
        product_price.add(30000);
        product_price.add(40000);
        product_price.add(20000);
        product_price.add(50000);
    }

    static void view(){
        for(int i=0; i<product_list.size(); i++){
            System.out.printf("%d.Name: %s   Price: %d\n",i+1,product_list.get(i),product_price.get(i));
        }
    }
}
