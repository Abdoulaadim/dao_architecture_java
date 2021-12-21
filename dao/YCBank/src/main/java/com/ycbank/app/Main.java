package com.ycbank.app;

import com.ycbank.config.Config;
import com.ycbank.dao.DAO;
import com.ycbank.dao.DAOFactory;
import com.ycbank.enumeration.AssuranceType;
import com.ycbank.enumeration.CountryType;
import com.ycbank.interfaces.IDAO;
import com.ycbank.model.Employee;
import com.ycbank.model.Student;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
    	
    	
    	
        // by abstract ------------------------------------------------------------------|

        DAO<Student> studentOp = DAOFactory.getStudentImpl();

        Student student1 = new Student(22123456L,"kamal","bhf","HH222222","bhfkamal@gmail.com",
                "11,bloc 1 Hay Anass", CountryType.MA,152415L, AssuranceType.SAHAM,1000);

        Student student2 = new Student(20997812L,"med","bhf2","HH333333","bhfkamal@gmail.com",
                "11,bloc 1 Hay Anass", CountryType.DZ,152415L, AssuranceType.SAHAM,1500);

        Student student3 = new Student(75367220L,"Imane","bhf 4","HH444444","bhfkamal@gmail.com",
                "11,bloc 1 Hay Anass", CountryType.EG,152415L, AssuranceType.SAHAM,1200);
        
        Student student4 = new Student(121123220L,"Ahmed","benhado","HH1212","Ahmed@gmail.com",
                "11,bloc Hay Riyad", CountryType.MA,152415L, AssuranceType.ATLANTA,1200);
        
        Student student5 = new Student(394271L,"morad","wiskiya","AA54312","morad@gmail.com",
                "12,bloc Hay Riyad", CountryType.MA,3213415L, AssuranceType.ATLANTA,5000);


        student1 = studentOp.create(student1);
        student2 = studentOp.create(student2);
        student3 = studentOp.create(student3);
        student4 = studentOp.create(student4);
        student5 = studentOp.create(student5);

        if(!Objects.isNull(student1))
            System.out.println("Bonjour "+student1.getFirstname()+" "+student1.getLastname());
        
        if(!Objects.isNull(student2))
            System.out.println("Good by "+student2.getFirstname()+" "+student2.getLastname());

        // --------------- CRUD OP -----------------|
        //student1.setFirstname("Ahmed");     //    |
        //student1 = studentOp.update(student1); // |
        //studentOp.delete(student1);         //    |
        // -----------------------------------------|
        
      
        DAO<Employee> employee = DAOFactory.getEmployeeImpl();
        
        Employee employee1 = new Employee(121112112L,"Ahmed", "Mohamed","HH1212","dacia@gmail.Com", "RUe 5 Paris",CountryType.EG,321543L,AssuranceType.CNSS,400L);

        Employee employee2 = new Employee(1122134L,"morad","benbrahim","AA312","ahah@gmail.com","Rue 5 N °6 Paris",CountryType.CO,21122L,AssuranceType.CNSS,4433321L);
        
        Employee employee3 = new Employee(13232211L,"hafssa","monamir","EE321","Hafssa@gmail.com","Rue 5 N °6 LILLE",CountryType.EG,41212321L,AssuranceType.AXA,44332L);
        
        employee1 = employee.create(employee1);
        employee2 = employee.create(employee2);
        employee3 = employee.create(employee3);
        
        
        if(!Objects.isNull(employee1))
            System.out.println("le nom d'employée "+employee1.getFirstname()+"  "+employee1.getLastname());
        
        if(!Objects.isNull(employee2))
            System.out.println("le nom d'employé "+employee1.getFirstname()+" "+employee2.getLastname());



















        // by interface ------------------------------------------------------------------|
        //IDAO<Student> studentOp2 = DAOFactory.getIStudentImpl();
        //Student student2 = studentOp2.create(new Student(3L,"kamal 2","bouhfid","HH255555","bhfkamal@mail.com","11,bloc 1 Hay Anass", CountryType.MA,152415L, AssuranceType.SAHAM,225673));
        //if(!Objects.isNull(student2))
        //    System.out.println("Bonjour "+student2.getFirstname()+" "+student2.getLastname());

        //Student student = studentOp.update(new Student(2L,"kamal","bouhfid edited 2","HH252222","bhfkamal@mail.com","11,bloc 1 Hay Anass", CountryType.MA,152415L, AssuranceType.SAHAM,88));

        //studentOp.delete(new Student(2L,"kamal","bouhfid edited 2","HH222211","bhfkamal@mail.com","11,bloc 1 Hay Anass", CountryType.MA,152415L, AssuranceType.SAHAM,88));
    }
}
