package oops.Polymorphism;

public class Methodoverloading {

    void addmarks(int marks1, int marks2) {
        int total = marks1 + marks2;
        System.out.println("Total Marks (2 subjects): " + total);
    }

    void addmarks(int marks1, int marks2, int marks3) {
        int total = marks1 + marks2 + marks3;
        System.out.println("Total Marks (3 subjects): " + total);
    }
    public static void main(String[] args) {
        Methodoverloading p = new Methodoverloading();
        p.addmarks(85, 90); // Calls the method with 2 parameters
        p.addmarks(80, 75, 95); // Calls the method with 3 parameters
    }
}
