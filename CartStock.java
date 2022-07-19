import java.util.Map;

public class CartStock {
    public Cart[] cartsArray;

    public CartStock() {
        this.cartsArray = new Cart[50];
    }
    public void addCart(int thisCartId, Map itemsHashMap) {
        for (int i = 0; i < cartsArray.length; i++)
        {
            if(cartsArray[i] == null) {
                cartsArray[thisCartId] = new Cart(thisCartId, itemsHashMap);
            }
        }
    }
}