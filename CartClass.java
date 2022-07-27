import java.util.LinkedList;
import java.util.List;

public class CartClass implements Cart{
    private int id;
    public List<ItemClass> items;
    private float totalCost;
    public CartClass(int id){
        this.id = id;
        this.items = new LinkedList<>();
        this.totalCost = 0;
    }
    @Override
    public void updateTotalCost(float cost){
        totalCost += cost;
    }
    @Override
    public void addItem(ItemClass item){
        for (ItemClass item1: items)
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
