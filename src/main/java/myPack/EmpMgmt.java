package myPack;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Scanner;
import java.util.*;

class Employee
{
 private int empno;
 private String ename;
 private int salary;

 Employee(int empno , String ename , int salary)
 {
     this.empno = empno;
     this.ename = ename;
     this.salary = salary;
 }

 public int getEmpno() {
     return empno;
 }

 public void setEmpno(int empno) {
     this.empno = empno;
 }

 public String getEname() {
     return ename;
 }

 public void setEname(String ename) {
     this.ename = ename;
 }

 public int getSalary() {
     return salary;
 }

 public void setSalary(int salary) {
     this.salary = salary;
 }

 public String toString()
 {
     return empno+" "+ename+" "+salary;
 }
}

class EmpMgmt
{
 public static void main(String[] args) 
 {
     List<Employee> c = new ArrayList<Employee>();
     int ch;
     Scanner sc = new Scanner(System.in);
     Scanner sc1 = new Scanner(System.in);
     do{
         System.out.println("1.INSERT");
         System.out.println("2.DISPLAy");
         System.out.println("3.SEARCH");
         System.out.println("4.DELETE");
         System.out.println("5.UPDATE");
         System.out.println("Enter your choice : ");
         ch = sc.nextInt();
     
         switch(ch){
             case 1 :
                 System.out.print( "Enter Empno :");
                 int eno = sc.nextInt();
                 System.out.print("Enter Employee name : ");
                 String ename = sc1.nextLine();
                 System.out.print("Enter Employee Salary : ");
                 int salary = sc.nextInt();
                 System.out.println();
                 c.add(new Employee(eno,ename,salary));
                 break;

            case 2:
                 System.out.println("------------------------------");
                 Iterator<Employee> i = c.iterator();
                 while(i.hasNext())
                 {
                     Employee e = i.next();
                     System.out.println(e);
                 }
                 System.out.println("------------------------------"); 
                 break; 
                 
             
            case 3:
                 boolean found = false;
                 System.out.println("Enter Employee number to search");
                 eno = sc.nextInt();
                 System.out.println("------------------------------"); 
     
                 i = c.iterator();
                 while(i.hasNext())
                 {
                      Employee e = i.next();
                      if(e.getEmpno() == eno)
                      {
                      System.out.println(e);
                      found = true;
                      }
                  }

                 if(!found)
                 {
                      System.out.println("Record Not Found");
                 }
                  System.out.println("------------------------------"); 
                  break;     

            case 4:
                 found = false;
                 System.out.println("Enter Employee number to search");
                 eno = sc.nextInt();
                 System.out.println("------------------------------"); 

                  i = c.iterator();
                  while(i.hasNext())
                  {
                    Employee e = i.next();
                    if(e.getEmpno() == eno)
                     {
                         i.remove();
                         found = true;
                     }
                  }

                  if(!found)
                  {
                  System.out.println("Record Not Found");
                  }else{
                  System.out.println("Record deleted successfully"); 
                 }
                  
                  System.out.println("------------------------------");
                   i = c.iterator();
                  while(i.hasNext())
                  {
                      Employee e = i.next();
                      System.out.println(e);
                  }
                  System.out.println("------------------------------"); 
                
                  break;     
 
                  
          case 5:
                  found = false;
                  System.out.println("Enter Employee number to Update");
                  eno = sc.nextInt();
                  System.out.println("------------------------------"); 
                  ListIterator<Employee>li = c.listIterator();
                   while(li.hasNext())
                   {
                     Employee e = li.next();
                     if(e.getEmpno() == eno)
                      {
                          System.out.println("Enter new Name : ");
                          ename = sc1.nextLine();

                          System.out.println("Enter new Salary : ");
                          salary = sc.nextInt();
                          li.set(new Employee(eno, ename, salary));
                          found = true;
                      }
                   }

                   if(!found)
                   {
                   System.out.println("Record Not Found");
                   System.out.println("------------------------------");
                   i = c.iterator();
                  while(i.hasNext())
                  {
                      Employee e = i.next();
                      System.out.println(e);
                  }
                  System.out.println("------------------------------"); 
                   }else{
                   System.out.println("Record updated successfully"); 
                  }
                   break;   
  
                       }
    
                 }while(ch!=0);
                }
         }


     
     
     
     
 