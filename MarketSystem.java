import java.util.HashMap;
import java.util.Map;

public class MarketSystem {
    public static void main(String[] args) {
        Map<Integer, Float> itemsHashMap = new HashMap<>();
        int thisCartId = 0;

        Cart obj1 = new Cart(thisCartId, itemsHashMap);
        obj1.menu();
    }
}
