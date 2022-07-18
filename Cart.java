import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cart {

    Scanner scan = new Scanner(System.in);
    private int cartId;
    private Map<Integer, Float> itemsHashMap = new HashMap<>();
    private float totalCost;

    public Cart(int cartId, Map itemsHashMap, float totalCost) {
        this.cartId = cartId;
        this.itemsHashMap = itemsHashMap;
        this.totalCost = totalCost;
    }
    public void createItem(){
        System.out.println("Input itemId and itemCost: \n");
        itemsHashMap.put(scan.nextInt(), scan.nextFloat());
    }
    private void addItemToCart(){
        System.out.println("Input itemId, price and cartId");
        itemsHashMap.put(scan.nextInt(), scan.nextFloat());
        cartId = scan.nextInt();
    }
    public float totalCost(){
        for (float value : itemsHashMap.values()) {
            totalCost += value;
        }
        return totalCost;
    }
}
