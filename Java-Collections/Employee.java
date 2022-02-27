import java.util.*;

// creating the employee detail class
class Employee_details implements Comparable<Employee_details>{
    int age,id;
    String name,department;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    @Override  
    public String toString() {  
        return "Employee [emp_id = " + id + ", name = " + name + ", department = " + department + ", age = " + age + "]";  
    }  

    public int compareTo(Employee_details compareEmployee_details){
        return 
    }

}


public class Employee {
    public static void main(String[] args) {
        Employee_details emp = new Employee_details();
        emp.setAge(12);
        emp.setDepartment("CE");
        emp.setId(231);
        emp.setName("Ram");

    }
    
}
