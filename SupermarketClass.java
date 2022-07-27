import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SupermarketClass implements Supermarket{
    private Map<Integer, ItemClass> items;
    private List<CartClass> carts;

    public SupermarketClass(){
        this.items = new HashMap<>();
        this.carts = new LinkedList<>();
    }
    @Override
    public void item(int id, float cost){
        items.put(id, new ItemClass(id, cost));
    }
    @Override
    public void cart(int id){
        carts.add(new CartClass(id));
    }
    @Override
    public void add(int cartId, int itemId){
        for (CartClass c: carts){
            if (c.getId() == cartId){
                c.addItem(items.get(itemId));
            }
        }
    }
    @Override
    public void pay(int id){
        for(CartClass c: carts){
            if(id == c.getId()){
                System.out.println(c.getTotalCost());
                c.resetCost();
                c.resetCart();
            }
        }
    }
}
