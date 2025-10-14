public class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Object creation and calling constructor
        Student s1 = new Student("Riya", 20);
        Student s2 = new Student("Arjun", 22);

        // Displaying details
        s1.display();
        s2.display();
    }
}
