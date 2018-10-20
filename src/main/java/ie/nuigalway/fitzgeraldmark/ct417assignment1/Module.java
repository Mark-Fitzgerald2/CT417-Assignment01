/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1;

import java.util.ArrayList;

/**
 *
 * @author Mark Fitzgerald, NUI Galway
 */
public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    
    public Module(String name, String id){
        //call setters for variables
        this.setName(name);
        this.setId(id);
        //initialize arraylists
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }
    
    //getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter and setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    //add a student to the array list
    public void addStudent(Student student){
        this.students.add(student);
    }
    
    //add a course to the array list
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    
    //return the arraylist of students registered
    public ArrayList getStudents() {
        return this.students;
    }
    
    //return the arraylist of courses with this module
    public ArrayList getCourses() {
        return this.courses;
    }
}

