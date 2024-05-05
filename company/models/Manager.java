package company.models;
import company.abstracts.*;

public class Manager extends Employee {
    public Manager(String name, int id, double salary, String hireDate, String Position){
        super(name, id, salary, hireDate, Position);
    }
    public void work(){
        System.out.println("Manager "+ getName() +" is managing...");
    }
    
}
