import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        Scanner scan = new Scanner(System.in);
        char opt01 = ' ';
        int optCartId;
        int optItemId;
        float optItemPrice;

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
                    System.out.println("************************************************************");
                    System.out.println("You are creating a cart, please insert your cart id.");
                    System.out.println("************************************************************");
                    optCartId = scan.nextInt();
                    supermarket.cart(optCartId);
                    break;
                case 'b':
                    System.out.println("************************************************************");
                    System.out.println("You are creating an item, please insert your item id and your item price.");
                    System.out.println("************************************************************");
                    optItemId = scan.nextInt();
                    optItemPrice = scan.nextFloat();
                    supermarket.item(optItemId, optItemPrice);
                    break;
                case 'c':
                    System.out.println("************************************************************");
                    System.out.println("You are adding a item to a cart, please type the cart, item id and the price.");
                    System.out.println("************************************************************");
                    optCartId = scan.nextInt();
                    optItemId = scan.nextInt();
                    optItemPrice = scan.nextFloat();
                    Item item01 = new Item(optItemId, optItemPrice);
                    Cart cart = new Cart(optCartId);
                    cart.addItem(item01);
                    break;
                case 'd':
                    System.out.println("************************************************************");
                    System.out.println("Please input you cart id to pay.");
                    System.out.println("************************************************************");
                    optCartId = scan.nextInt();
                    supermarket.pay(optCartId);
                    break;
                case 'e':
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }while(opt01 != 'e');
    }
}
