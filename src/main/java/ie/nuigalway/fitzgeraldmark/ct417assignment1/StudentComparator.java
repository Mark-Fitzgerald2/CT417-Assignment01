/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1;

import java.util.Comparator;

/**
 *
 * @author Mark Fitzgerald, NUI Galway
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}