import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private Map<Integer, Item> items;
    private List<Cart> carts;

    public Supermarket(){
        this.items = new HashMap<>();
        this.carts = new LinkedList<>();
    }
    public void item(int id, float cost){
        items.put(id, new Item(id, cost));
    }
    public void cart(int id){
        carts.add(new Cart(id));
    }
    public void pay(int id){
        for(Cart c: carts){
            if(id == c.getId()){
                System.out.println(c.getTotalCost());
                c.resetCost();
                c.resetCart();
            }
        }
    }
}


/*
cart.resetCost() -> Method
resetCost(cart) -> Function
 */