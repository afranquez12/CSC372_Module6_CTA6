package SortingArrayListOption1;

/*
 * 
 * Description: This class represents the Student object, which contains 
 *              a roll number, name, and address. The Student objects will 
 *              be used in an ArrayList for sorting using custom comparators 
 *              and selection sort.
 */

public class Student {
    int rollno;
    String name;
    String address;

    // Constructor to initialize student object
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method to return a string representation of a student object
    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Address: " + address;
    }
}
