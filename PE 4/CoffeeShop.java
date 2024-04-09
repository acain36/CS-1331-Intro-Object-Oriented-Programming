import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to your local coffee shop! What does the rush look like today?");

        String orders = myScanner.next();

        Order[] orderArray = createOrderArray(orders);

        computeOrderMakeTime(orderArray, 1);
        computeOrderMakeTime(orderArray, 2);
        computeOrderMakeTime(orderArray, 3);
    }

    public static Order[] createOrderArray(String theRush) {
        Order[] myOrderArray = new Order[theRush.length()];

        for (int i = 0; i < theRush.length(); i++) {
            if (theRush.charAt(i) == 'L') {
                myOrderArray[i] = Order.LATTE;
            } else if (theRush.charAt(i) == 'C') {
                myOrderArray[i] = Order.COFFEE;
            } else if (theRush.charAt(i) == 'I') {
                myOrderArray[i] = Order.ICED_COFFEE;
            } else if (theRush.charAt(i) == 'F') {
                myOrderArray[i] = Order.FRAPPE;
            } else if (theRush.charAt(i) == 'P') {
                myOrderArray[i] = Order.PASTRY;
            }
        }

        return myOrderArray;
    }

    public static double lookupMakeTime(Order order) {
        String theItem = order.toString();

        switch (theItem) {
        case "LATTE":
            return 3.0;
        case "COFFEE":
            return 0.5;
        case "ICED_COFFEE":
            return 2.0;
        case "FRAPPE":
            return 6.0;
        case "PASTRY":
            return 3.0;
        default:
            return 0.0;
        }
    }

    public static void computeOrderMakeTime(Order[] theOrders, int numBaristas) {
        double numOrders = 0;
        double totalMakeTime = 0;
        double actualTime = 0;
        for (int i = 0; i < theOrders.length; i++) {
            totalMakeTime += lookupMakeTime(theOrders[i]);
            numOrders++;
        }

        actualTime = (totalMakeTime / numBaristas) + (numOrders % numBaristas);

        System.out.println("It will take " + actualTime + " minutes for "
            + numBaristas + " baristas to make these orders.");
    }

}