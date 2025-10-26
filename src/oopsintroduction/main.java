package oopsintroduction;

public class main {
    public static void main(String[] args) {
        //store 5 roll no
        int[] numbers = new int[5];
        //store 5 names
        String[] names = new String[5];
        //data of 5 students : {rollno , name , marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];

    }

    //create a class Student with attributes rollno , name , marks
    class Student {
        int rollno;
        String name;
        float marks;
    }
}
