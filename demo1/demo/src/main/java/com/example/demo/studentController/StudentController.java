package com.example.demo.studentController;
import com.example.demo.studentrepo.studentrepo;
import com.example.demo.studentdatamodel;
import java.util.Map;
import java.util.HashMap;
public class StudentController{
       Map<String ,studentmodel >IdtoStudent=new HashMap<>();
       Map<String, studentmodel>UnitoStudent=new HashMap<>();
       @PostMapping("/addstudent")
       public String addStudent(@RequestBody String name,@RequestBody int age,@RequestBody String aadhar,@RequestBody String university){
             String id=UUID.randomUUID.toString();
             studentmodel student=new studentmodel(id,name,age,aadhar,university);
             IdtoStudent(id, studentmodel);
             List<String>arr=UnitoStudent(university.getOrDefault(new ArrayList<>();
       }
       public List<String> getallstudents(String university){
         return UnitoStudent.get(university);
       }
       public studentmodel IdtoStudent(String id){
         return IdtoStudent.get(id);
         } 
       
}
