package falah.relasiclass.tugas;

public class Order {
    private Customer customer;
    private Cashier cashier;
    private Product[] products;
    private int[] quantities;
    private int itemCount;

    public Order(Customer customer, Cashier cashier, int capacity) {
        this.customer = customer;
        this.cashier = cashier;
        this.products = new Product[capacity];
        this.quantities = new int[capacity];
        this.itemCount = 0;
    }

    public void setProducts(Product product, int quantity) {
        if (itemCount < products.length) {
            products[itemCount] = product;
            quantities[itemCount] = quantity;
            itemCount++;
            System.out.println(product.getName() + "(s) added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }
    public void receipt() {
        double total = 0;
        System.out.println("------- Receipt -------");
        System.out.println("Cashier: " + cashier.getName());
        System.out.println("-----------------------");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items:");
        for (int i = 0; i < itemCount; i++) {
            Product product = products[i];
            int quantity = quantities[i];
            double itemTotal = product.getPrice() * quantity;
            System.out.println(product.getName() + " x " + quantity + ": $" + product.getPrice());
            total += itemTotal;
        }
        System.out.println("-----------------------");
        System.out.println("Total: $" + total + 0);
        System.out.println("-----------------------");
    }
}
