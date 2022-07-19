import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MarketSystem {
    public static void main(String[] args) {
        int cartId = 0;
        Map<Integer, Float> itemsHashMap = new HashMap<>();
        float totalCost = 0f;
        Scanner scan = new Scanner(System.in);

        Cart obj1 = new Cart(cartId, itemsHashMap, totalCost);
        obj1.menu();
    }
}
