package SortingArrayListOption1;

/*
 * 
 * Description: This class demonstrates the use of the Student class, the comparator classes, 
 *              and the selection sort method. It creates an ArrayList of Student objects, 
 *              sorts them by name and by roll number, and prints the results.
 */

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        // Create an ArrayList of students
        ArrayList<Student> students = new ArrayList<>();

        // Adding 10 student objects
        students.add(new Student(5, "Alice", "123 Main St"));
        students.add(new Student(2, "Bob", "456 Oak St"));
        students.add(new Student(10, "Charlie", "789 Pine St"));
        students.add(new Student(3, "David", "101 Maple St"));
        students.add(new Student(1, "Eve", "202 Elm St"));
        students.add(new Student(7, "Frank", "303 Cedar St"));
        students.add(new Student(9, "Grace", "404 Birch St"));
        students.add(new Student(6, "Hannah", "505 Spruce St"));
        students.add(new Student(4, "Ian", "606 Willow St"));
        students.add(new Student(8, "Jill", "707 Cypress St"));

        // Print the list before sorting
        System.out.println("Students list before sorting:");
        printStudents(students);

        // Sort by name using selection sort
        System.out.println("\nSorting students by name:");
        SelectionSort.selectionSort(students, new StudentNameComparator());
        printStudents(students);

        // Sort by roll number using selection sort
        System.out.println("\nSorting students by roll number:");
        SelectionSort.selectionSort(students, new StudentRollnoComparator());
        printStudents(students);
    }

    // Helper method to print the students
    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
