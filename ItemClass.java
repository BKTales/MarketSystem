public class ItemClass implements Item{
    private int id;
    private float cost;

    public ItemClass(int id, float cost){
        this.id = id;
        this.cost = cost;
    }
    public float getCost(){
        return cost;
    }
    public int getId(){
        return id;
    }
}


