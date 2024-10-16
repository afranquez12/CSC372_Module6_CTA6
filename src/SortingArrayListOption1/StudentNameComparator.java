package SortingArrayListOption1;

/*
 * 
 * Description: This comparator class is used to compare two Student objects based on their names. 
 *              It implements the Comparator interface and overrides the compare() method 
 *              to sort students by their names in lexicographical order.
 */

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);  // Compare based on names (lexicographically)
    }
}
