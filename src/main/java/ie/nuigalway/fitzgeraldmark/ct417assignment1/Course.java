/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1;
/**
 *
 * @author Mark Fitzgerald, NUI Galway
 */
import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
    private DateTime startDate;
    private String name;
    private DateTime endDate;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    
    public Course(String name, DateTime startDate, DateTime endDate){
        //call setters for passed in variables
        this.setName(name);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        //initialize arraylists
        modules = new ArrayList<Module>();
        students = new ArrayList<Student>();
    }
    
    //getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter and setter for start date
    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
    
    //getter and setter for end date
    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    //adds a module to array list
    public void addModule(Module module){
        this.modules.add(module); //add module
        module.addCourse(this); //adds this course to module object
        for(Student s : students) { 
            //if there are already students enrolled to this course
            //register the students in module
            module.addStudent(s);
            //given the student the new module
            s.addModule(module);
        }
    }
    
    //adds a student to array list
    public void addStudent(Student student) {
        this.students.add(student); //add student
        student.addCourse(this); //adds this course to student object
        for(Module m : modules) {
            //if there are already modules for this course
            //give the students these modules
            m.addStudent(student);
            //give the module the new student
            student.addModule(m);
        }
    }
    
    //returns the arraylist of students
    public ArrayList getStudents() {
        return this.students;
    }
    
    //returns the arraylist of modules
    public ArrayList getModules() {
        return this.modules;
    }
}
