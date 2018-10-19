/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author I342039
 */
public class studentRegTest {
    
    @Test
     public void StudentReg_Test() {
        //create a course object
        Course ece = new Course("Electronic and Computer Engineering (ECE)", DateTime.parse("10/09/2018", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("10/05/2019", DateTimeFormat.forPattern("dd/MM/yyyy")));
        //uses getters to check basic details of course
        assertEquals(ece.getName(), "Electronic and Computer Engineering (ECE)");
        assertEquals(ece.getStartDate(),DateTime.parse("10/09/2018", DateTimeFormat.forPattern("dd/MM/yyyy")));
        assertEquals(ece.getEndDate(),DateTime.parse("10/05/2019", DateTimeFormat.forPattern("dd/MM/yyyy")));
        
        //create modules and check getters
        Module softEng = new Module("Software Engineering III", "CT417");
        assertEquals(softEng.getName(), "Software Engineering III");
        assertEquals(softEng.getId(), "CT417");
        
        Module ml = new Module("Machine Learning and Data Mining", "CT475");
        assertEquals(ml.getName(), "Machine Learning and Data Mining");
        assertEquals(ml.getId(), "CT475");
        
        Module fyp = new Module("Electronic and Computer Engineering Project", "CT434");
        assertEquals(fyp.getName(), "Electronic and Computer Engineering Project");
        assertEquals(fyp.getId(), "CT434");
        
        Module tele = new Module("Telecommunications Software Applications", "EE453");
        assertEquals(tele.getName(), "Telecommunications Software Applications");
        assertEquals(tele.getId(), "EE453");
        
        Module dsp = new Module("Digital Signal Processing", "EE445");
        assertEquals(dsp.getName(), "Digital Signal Processing");
        assertEquals(dsp.getId(), "EE445");
        
        Module soc = new Module("System on Chip Design I", "EE451");
        assertEquals(soc.getName(), "System on Chip Design I");
        assertEquals(soc.getId(), "EE451");
        
        //add all the modules to course
        ece.addModule(softEng);
        ece.addModule(ml);
        ece.addModule(fyp);
        ece.addModule(tele);
        ece.addModule(dsp);
        ece.addModule(soc);
        
        //create an array list of courses
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(ece);
        
        //create an arraylist of modules
        ArrayList<Module> eceModules = new ArrayList<Module>();
        eceModules.add(softEng);
        eceModules.add(ml);
        eceModules.add(fyp);
        eceModules.add(tele);
        eceModules.add(dsp);
        eceModules.add(soc);
        
        //check if getModules returns all the correct modules
        assertEquals(ece.getModules(), eceModules);
        //check if modules return all courses
        assertEquals(fyp.getCourses(), courses);
        assertEquals(tele.getCourses(), courses);
        assertEquals(dsp.getCourses(), courses);
        assertEquals(soc.getCourses(), courses);
        
        //create students
        Student student1 = new Student("Paddy Smith", 21, DateTime.parse("25/05/1997", DateTimeFormat.forPattern("dd/MM/yyyy")), "154789");
        Student student2 = new Student("Joe Lo Trgulio", 20, DateTime.parse("17/12/1997", DateTimeFormat.forPattern("dd/MM/yyyy")), "132654");
        Student student3 = new Student("Andy Samberg", 25, DateTime.parse("12/01/1993", DateTimeFormat.forPattern("dd/MM/yyyy")), "198745");
        Student student4 = new Student("Terry Crewes", 22, DateTime.parse("30/11/1995", DateTimeFormat.forPattern("dd/MM/yyyy")), "741423");
        Student student5 = new Student("Amy Santiago", 21, DateTime.parse("02/02/1997", DateTimeFormat.forPattern("dd/MM/yyyy")), "715845");
        Student student6 = new Student("Rosa Diaz", 29, DateTime.parse("09/06/1989", DateTimeFormat.forPattern("dd/MM/yyyy")), "012753");
        Student student7 = new Student("Chelsea Peretti", 24, DateTime.parse("20/04/1994", DateTimeFormat.forPattern("dd/MM/yyyy")), "354126");
        Student student8 = new Student("Melissa Fumero", 22, DateTime.parse("27/03/1996", DateTimeFormat.forPattern("dd/MM/yyyy")), "485269");
        Student student9 = new Student("Stephanie Beatriz", 20, DateTime.parse("01/01/1998", DateTimeFormat.forPattern("dd/MM/yyyy")), "785435");
        Student student10 = new Student("Raymond Holt", 23, DateTime.parse("18/07/1995", DateTimeFormat.forPattern("dd/MM/yyyy")), "455164");
        
        //check all the basic getters of the students
        assertEquals(student1.getName(), "Paddy Smith");
        assertEquals(student1.getAge(), 21);
        assertEquals(student1.getDOB(), DateTime.parse("25/05/1997", DateTimeFormat.forPattern("dd/MM/yyyy")));
        assertEquals(student1.getId(), "154789");
        assertEquals(student1.getUsername(), "Paddy Smith 21");
        
        //register students to ECE
        ece.addStudent(student6);
        ece.addStudent(student7);
        ece.addStudent(student8);
        ece.addStudent(student9);
        ece.addStudent(student10);
        
        //create a second course
        Course csit = new Course("Computer Science and Information Technology (CS&IT)", DateTime.parse("10/09/2018", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("10/05/2019", DateTimeFormat.forPattern("dd/MM/yyyy")));
        //register half the students to csit
        csit.addStudent(student1);
        csit.addStudent(student2);
        csit.addStudent(student3);
        csit.addStudent(student4);
        csit.addStudent(student5);
        //add two modules to csit
        csit.addModule(softEng);
        csit.addModule(ml);
        
        //create an arraylist of csit students
        ArrayList<Student> csitStudents = new ArrayList<Student>();
        csitStudents.add(student1);
        csitStudents.add(student2);
        csitStudents.add(student3);
        csitStudents.add(student4);
        csitStudents.add(student5);
        
        //create an array list of ece students
        ArrayList<Student> eceStudents = new ArrayList<Student>();
        eceStudents.add(student6);
        eceStudents.add(student7);
        eceStudents.add(student8);
        eceStudents.add(student9);
        eceStudents.add(student10);
        
        //create an arraylist of courses
        ArrayList<Course> st1Course = new ArrayList<Course>();
        st1Course.add(csit);
        
        //create an array list of modules
        ArrayList<Module> st1Module = new ArrayList<Module>();
        st1Module.add(softEng);
        st1Module.add(ml);
        
        //check if csit has all 5 students
        assertEquals(csit.getStudents(), csitStudents);
        //check if student has the correct courses and modules
        assertEquals(student1.getCourses(), st1Course);
        assertEquals(student1.getModules(), st1Module);
        
        //add csit to courses
        courses.add(csit);
        //check if softEng and ml are assigned to both ece and csit
        assertEquals(softEng.getCourses(), courses);
        assertEquals(ml.getCourses(), courses);
        
        //create an array list of all students
        ArrayList<Student> allStudents = new ArrayList<Student>();
        //add ece students and csit students to this array
        allStudents.addAll(eceStudents);
        allStudents.addAll(csitStudents);
        //check if all modules return the correct students
        assertEquals(ml.getStudents(), allStudents);
        assertEquals(softEng.getStudents(), allStudents);
        assertEquals(fyp.getStudents(), eceStudents);
        assertEquals(dsp.getStudents(), eceStudents);
        assertEquals(soc.getStudents(), eceStudents);
        assertEquals(tele.getStudents(), eceStudents);
     }
}
