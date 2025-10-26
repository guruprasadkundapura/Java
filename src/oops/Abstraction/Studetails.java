package oops.Abstraction;

public class Studetails extends Guru{
    @Override
    void addMarks(int a, int b) {
        System.out.println("Total Marks: " + (a + b));
    }
}
