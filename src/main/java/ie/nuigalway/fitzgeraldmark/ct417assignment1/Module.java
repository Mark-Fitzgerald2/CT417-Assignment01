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
    
    public Module(String name, String id){
        this.name = name;
        this.id = id;
        students = new ArrayList<Student>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void addStudent(Student student){
        this.students.add(student);
    }
    
    public ArrayList getStudents() {
        return this.students;
    }
}

