package oops;

public class Classandobjects {
    public static void main(String[] args) {
        class Student {
            int id = 101;

            void display() {
                System.out.println("ID: " + id);
            }
        } // end of Student
        Student s1 = new Student();
        s1.display();
        System.out.println("Hello OOPs");
    }
} // Output: Hello OOPs
