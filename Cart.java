import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cart extends CartStock{

    Scanner scan = new Scanner(System.in);
    public int cartId;
    public Map<Integer, Float> itemsHashMap;
    public float totalCost;

    public Cart(int cartId, Map itemsHashMap, float totalCost) {
        this.cartId = cartId;
        this.itemsHashMap = itemsHashMap;
        this.totalCost = totalCost;
    }

    public void createItem(){
        System.out.println("Input itemId and itemCost: \n");
        itemsHashMap.put(scan.nextInt(), scan.nextFloat());
    }
    public void addItemToCart(){
        System.out.println("Input itemId, price and cartId");
        itemsHashMap.put(scan.nextInt(), scan.nextFloat());
        cartId = scan.nextInt();
    }
    public float totalCost(){
        for (float value : itemsHashMap.values()) {
            totalCost += value;
        }
        return totalCost;
    }
    public void menu(){
        char option = ' ';
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a command: ");
        System.out.println("a) Item <itemId> <cost>");
        System.out.println("b) Create a cart <cartId>");
        System.out.println("c) Add <itemId> <cartId>");
        System.out.println("d) Pay <cartId>");
        System.out.println("e) Exit");

        do{
            System.out.println("Choose an option: ");
            option = scan.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'a':
                    createItem();
                    break;
                case 'b':
                    addCart(cartId, itemsHashMap, totalCost);
                    break;
                case 'c':
                    addItemToCart();
                    break;
                case 'd':
                    totalCost();
                    break;
                case 'e':
                    System.exit(1);
                default:
                    System.out.println("Please choose a valid command");
                    break;
            }
        }while (option != 'e');
    }
}
