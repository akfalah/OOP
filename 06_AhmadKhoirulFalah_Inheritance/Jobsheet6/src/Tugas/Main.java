package Tugas;

public class Main {
    public static void main(String[] args) {
        Komputer komputer = new Komputer("Asus", 3200, 16, "AMD Ryzen 5");
        PC pc = new PC("MSI", 3000, 8, "Intel Core i5", 24);
        Laptop laptop = new Laptop("Axioo", 2500, 4, "AMD Ryzen 3", "6-cell");
        Mac mac = new Mac("MacBook", 2800, 8, "M1", "8-cell", "Face ID");
        Windows windows = new Windows("Dell", 2700, 12, "Intel Core i5", "4-cell", "Touchscreen");

        pc.tampilPC();
        System.out.println();
        laptop.tampilLaptop();
        System.out.println();
        mac.tampilMac();
        System.out.println();
        windows.tampilWindows();
    }
}
