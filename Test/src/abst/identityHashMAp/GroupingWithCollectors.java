package abst.identityHashMAp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingWithCollectors {
    static List<Employe> employeeList = Arrays.asList(
            new Employe("Tom Jones", 45, 12000.00,Department.MARKETING),
            new Employe("Harry Major", 26, 20000.00, Department.LEGAL),
            new Employe("Ethan Hardy", 65, 30000.00, Department.LEGAL),
            new Employe("Nancy Smith", 22, 15000.00, Department.MARKETING),
            new Employe("Catherine Jones", 21, 18000.00, Department.HR),
            new Employe("James Elliot", 58, 24000.00, Department.OPERATIONS),
            new Employe("Frank Anthony", 55, 32000.00, Department.MARKETING),
            new Employe("Michael Reeves", 40, 45000.00, Department.OPERATIONS));
        public static void main(String args[]){
          Map<Department,List<Employe>> employeeMap
              = employeeList.stream().collect(Collectors.groupingBy(Employe::getDepartment));
          System.out.println("Employees grouped by department");
          employeeMap.forEach((Department key, List<Employe> empList) -> System.out.println(key +" -> "+empList));
          
          List<Employe> employeeListTest =employeeMap.get(Department.MARKETING);
          System.out.println(employeeListTest);
       ///   employeeMap.g
          }
      }
      //Employee.java - POJO Class
   
       class Employe {
        private String name;
        private Integer age;
        private Double salary;
        private Department department;
       public Employe() {
    }
        public Employe(String name, Integer age, Double salary, Department department) {
          this.name = name;
          this.age = age;
          this.salary = salary;
          this.department = department;
        }
        
       
        // Setters/Getters for name,age,salary,department go here
       
        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }


        public Integer getAge() {
            return age;
        }


        public void setAge(Integer age) {
            this.age = age;
        }


        public Double getSalary() {
            return salary;
        }


        public void setSalary(Double salary) {
            this.salary = salary;
        }


        public Department getDepartment() {
            return department;
        }


        public void setDepartment(Department department) {
            this.department = department;
        }


        public String toString(){
          return "Employe Name:"+this.name;
        }
       
        //Standard equals and hashcode implementations go here
       
      }
      //Enum Department.java
   
       enum Department {
        HR, OPERATIONS, LEGAL, MARKETING
      }
