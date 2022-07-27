public interface Supermarket {
    void item(int id, float cost);
    void cart(int id);
    void add(int cartId, int itemId);
    void pay(int id);
}
