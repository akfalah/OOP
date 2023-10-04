package Tugas;

public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newNama) {
        this.name = newNama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 18 && newAge <= 30) {
            age = newAge;
        } else {
            System.out.println("Min 18 years old and max 30 years old");
        }
    }
}
