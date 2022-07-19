import java.util.LinkedList;
import java.util.List;

public class Cart{
    private int id;
    public List<Item> items;
    private float totalCost;

    public Cart(int id){
        this.id = id;
        this.items = new LinkedList<>();
        this.totalCost = 0;
    }
    public void updateTotalCost(float cost){
        totalCost += cost;
    }
    public void addItem(Item item){
        items.add(item);
        updateTotalCost(item.getCost());
    }
    public void resetCost(){
        totalCost = 0;
    }
    public void resetCart(){
        items.clear();
    }
    public int getId(){
        return id;
    }
    public float getTotalCost(){
        return totalCost;
    }
}
