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
    
    public Student(String name, int age, DateTime dateOfBirth, String id){
        this.name = name;
        this.age = age;
        this.DOB = dateOfBirth;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDateOfBirth() {
        return DOB;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.DOB = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getUsername(){
        return this.name + this.age;
    }
}
