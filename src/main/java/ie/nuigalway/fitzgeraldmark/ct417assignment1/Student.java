/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1;
import java.util.ArrayList;
import org.joda.time.DateTime;
/**
 *
 * @author Mark Fitzgerald, NUI Galway
 */
public class Student {
    
    private String name;
    private int age;
    private DateTime DOB;
    private String id;
    private ArrayList<Module> modules;
    private ArrayList<Course> courses;
    
    public Student(String name, int age, DateTime dateOfBirth, String id){
        //call setter methods for passed in values
        this.setName(name);
        this.setAge(age);
        this.setDOB(dateOfBirth);
        this.setId(id);
        //initialize the arraylists
        modules = new ArrayList<Module>();
        courses = new ArrayList<Course>();
    }
    
    //getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //getter and setter for DOB
    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime dateOfBirth) {
        this.DOB = dateOfBirth;
    }

    //getter and setter for Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    //getter for username. Return name and age
    public String getUsername(){
        return this.name + " " + this.age;
    }
    
    //adds a module to the arraylist
    public void addModule(Module module) {
        this.modules.add(module);
    }

    //adds a course to the arraylist
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    
    //returns the course arraylist
    public ArrayList getCourses() {
        return this.courses;
    }
    
    //returns the module arraylist
    public ArrayList getModules() {
        return this.modules;
    }
}
