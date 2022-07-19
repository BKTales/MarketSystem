import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cart extends CartStock{

    Scanner scan = new Scanner(System.in);
    public int thisCartId;
    public Map<Integer, Float> itemsHashMap;
    public float totalCost;
    public Cart(int thisCartId, Map itemsHashMap) {  //Cart Constructor
        this.thisCartId = thisCartId;
        this.itemsHashMap = itemsHashMap;
    }

    public void createItem(){
        System.out.println("Input itemId and itemCost: \n");
        itemsHashMap.put(scan.nextInt(), scan.nextFloat());
    }
    public void addItemToCart(){
        System.out.println("Input itemId, price and cartId");
        //cartId = scan.nextInt();
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
                    createItem(); //Working 100%
                    System.out.println(itemsHashMap);
                    break;
                case 'b':
                    System.out.println("Input the cartId: "); //To fix
                    thisCartId = scan.nextInt();
                    itemsHashMap.put(0, 0f);
                    addCart(thisCartId, itemsHashMap);;
                    break;
                case 'c':
                    addItemToCart(); //Not tested
                    break;
                case 'd':
                    totalCost(); //Prob not working
                    break;
                case 'e':
                    System.exit(0); //Working
                case 't':
                    System.out.println(cartsArray);
                    break;
                default:
                    System.out.println("Please choose a valid command"); //Working
                    break;
            }
        }while (option != 'e');
        System.exit(0); //Working
    }
}
