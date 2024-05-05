package company.models;
import company.abstracts.Employee;

public final class Worker extends Employee{
    public Worker(String name, int id, double salary, String hireDate, String Position){
        super(name, id, salary, hireDate, Position);
    }
    public void work(){
        System.out.println("Worker "+getName()+" is working...");
    }
}
