import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        Scanner scan = new Scanner(System.in);
        char opt01 = ' ';
        int opt02;
        float opt03;

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
                    opt02 = scan.nextInt();
                    supermarket.cart(opt02);
                    break;
                case 'b':
                    System.out.println("************************************************************");
                    System.out.println("You are creating an item, please insert your item id and your item price.");
                    System.out.println("************************************************************");
                    opt02 = scan.nextInt();
                    opt03 = scan.nextFloat();
                    supermarket.item(opt02, opt03);
                    break;
                case 'c':
                    System.out.println("************************************************************");
                    System.out.println("You are adding a item to a cart, please type the cart id, item id and price.");
                    System.out.println("************************************************************");
                    opt02 = scan.nextInt();
                    int opt04 = scan.nextInt();
                    Cart cart = new Cart(opt02);
                    cart.addItem();

                    break;
                case 'd':
                    System.out.println("************************************************************");
                    System.out.println("Please input you cart id to pay.");
                    System.out.println("************************************************************");
                    opt02 = scan.nextInt();
                    supermarket.pay(opt02);
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
