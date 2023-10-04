package falah.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 800);
        Product phone = new Product("Smartphone", 500);

        Cashier cashier = new Cashier("Mike");
        Customer customer = new Customer("Alice");
        Order order = new Order(customer, cashier, 2);

        order.setProducts(laptop, 1);
        order.setProducts(phone, 2);
        System.out.println();

        order.receipt();
    }
}
