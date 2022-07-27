public interface Cart {
    void updateTotalCost(float cost);
    void addItem(ItemClass item);
    void resetCost();
    void resetCart();
    int getId();
    float getTotalCost();
}
