package company.abstracts;
import company.interfaces.Employable;

public abstract class Employee implements Employable{
    private String name;
    private double salary;
    private int id;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Rozpoczecie pracy");
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    
}
