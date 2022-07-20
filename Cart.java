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
        for (Item item1: items)
        {
            if(id == item.getId()){
                items.add(item);
                updateTotalCost(item.getCost());
            } else if(id != item.getId()){
                System.out.println("Please select a valid item.");
            }
        }

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
