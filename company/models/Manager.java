package company.models;
import company.abstracts.*;

public class Manager extends Employee {
    public Manager(String name, int id, double salary){
        super(name, id, salary);
    }
    public void work(){
        System.out.println("Manager "+ getName() +" is managing...");
    }
    
}
