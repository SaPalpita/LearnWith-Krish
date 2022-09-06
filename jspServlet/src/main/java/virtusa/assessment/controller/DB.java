package virtusa.assessment.controller;

import virtusa.assessment.model.Student;

import java.util.HashMap;
import java.util.Map;

public class DB {
    private Map<String, Student> students=new HashMap<>();

    public String add(Student student){
        try {
           // boolean con=already(student.getEmail());
           students.put(student.getEmail(),student);
           return "Student Saved";
        }catch (Exception e){
           return "Exception";
        }
    }

    public boolean already(String email){
        if(students.containsKey("email")){
            return true;
        }else{
            return false;
        }
    }
}
