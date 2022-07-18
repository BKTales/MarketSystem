import java.util.Map;

public class CartStock {
    private Cart[] carts;

    public CartStock() {
        this.carts = new Cart[100];
    }

    public void addCart(int cartId, Map itemsHashMap, float totalCost) {
        for(int i = 0; i < carts.length; i++){
            if(carts[i] == null){
                carts[i] = new Cart(cartId, itemsHashMap, totalCost);
                break;
            }
        }
    }
}