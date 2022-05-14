import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] arg) {

        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 2.10;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.45;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 7.00;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 12.45;

        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 5.50;
        order1.ready = true;
        //order1.items.add(item1) ;
        
        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 7.45;
        order2.ready = false;
        order2.items.add(item1);

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 8.0;
        order3.ready = false;
        order3.items.add(item2);
        order3.total += item2.price;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 2.45;
        order4.ready = true;

        



        // item1.total + order2.total

        System.out.printf("Name1: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Is oder ready: %s\n", order1.ready);
        // System.out.printf("Item: %s\n", order1.items);

        System.out.printf("Name2: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Is oder ready: %s\n", order2.ready);
        System.out.printf("Item: %s\n", order2.items.get(0).name);

        System.out.printf("Name3: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Is oder ready: %s\n", order3.ready);
        System.out.printf("Item: %s\n", order2.items);

        // System.out.printf("Name: %s\n", item1.name);
        // System.out.printf("Total: %s\n", item1.price);


    }
}