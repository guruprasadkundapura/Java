package oops;

public class Encapsulation {

        int id;

        void display() {
            System.out.println("ID: " + id);
        }

 public static void main(String[] args) {
        Encapsulation s1 = new Encapsulation();
            s1.id = 101; // Setting the id
            s1.display(); // Output: ID: 101
        Encapsulation1 s2 = new Encapsulation1();
            s2.marks = 95; // Setting the marks
            s2.display(); // Output: Marks: 95
        }
    }

