package company.abstracts;
import company.interfaces.Employable;

public abstract class Employee implements Employable{
    private String name;
    private double salary;
    private int id;
    private String hireDate;
    private String Position;

    public Employee(String name, int id, double salary, String hireDate, String Position){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.hireDate = hireDate;
        this.Position = Position;
    }

    public void work(){
        System.out.println("Rozpoczecie pracy");
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee otherEmployee =(Employee) obj;
        return this.id == otherEmployee.id;
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int hashCode(){
        return id;
    }
    public String getHireDate(){
        return hireDate;
    }
    public String getPosition(){
        return Position;
    }
    
}
