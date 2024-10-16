package SortingArrayListOption1;

/*
 * 
 * Description: This comparator class is used to compare two Student objects based on their roll numbers. 
 *              It implements the Comparator interface and overrides the compare() method 
 *              to sort students by their roll numbers in ascending order.
 */

import java.util.Comparator;

public class StudentRollnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollno, s2.rollno);  // Compare based on roll number (numeric)
    }
}
