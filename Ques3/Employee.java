package Ass6.ques3;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String Department;
    private double Salary;

    public Employee(int id,String name,String Department,double Salary)
    {
     this.id = id;
     this.name=name;
     this.Department=Department;
     this.Salary = Salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
