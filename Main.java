import java.util.*;

public class Main {
    public static void main(String[] args) {
        SupermarketClass supermarket = new SupermarketClass();
        Scanner scan = new Scanner(System.in);
        char opt01;

        do {
            System.out.println("Select an option");
            System.out.println("a) Create cart");
            System.out.println("b) Create item");
            System.out.println("c) Add item to cart");
            System.out.println("d) Pay");
            System.out.println("e) Exit");
            System.out.println("\n");
            opt01 = scan.next().charAt(0);

            switch (opt01) {
                case 'a':
                    cart(scan, supermarket);
                    break;
                case 'b':
                    item(scan, supermarket);
                    break;
                case 'c':
                    add(scan, supermarket);
                    break;
                case 'd':
                    pay(scan, supermarket);
                    break;
                case 'e':
                    break;
                default:
                    break;

            }
        }while(opt01 != 'e');
    }

    private static void cart(Scanner scan, SupermarketClass supermarket){
        int cartId = scan.nextInt();
        supermarket.cart(cartId);
    }
    private static void item(Scanner scan, SupermarketClass supermarket){
        int itemId = scan.nextInt();
        float itemPrice = scan.nextFloat();
        supermarket.item(itemId, itemPrice);
    }
    private static void add(Scanner scan, SupermarketClass supermarket){
        int cartId = scan.nextInt();
        int itemId = scan.nextInt();
        supermarket.add(cartId, itemId);
    }
    private static void pay(Scanner scan, SupermarketClass supermarket){
        int cartId = scan.nextInt();
        supermarket.pay(cartId);
    }
}


/*
INTERFACE -> Blueprint de uma classe.
 */