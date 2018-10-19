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
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<Module>();
        students = new ArrayList<Student>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
    
    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    public void addModule(Module module){
        this.modules.add(module);
        if(students.size() > 0){
            for(Student s : students) {
                module.addStudent(s);
                s.addModule(module);
            }
        }
    }
    
    public void addStudent(Student student) {
        this.students.add(student);
        for(Module m : modules) {
            m.addStudent(student);
        }
    }
}
