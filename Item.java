public class Item {
    private int id;
    private float cost;

    public Item(int id, float cost){
        this.id = id;
        this.cost = cost;
    }
    public float getCost(){
        return cost;
    }
    public int getId(){
        return id;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
}


