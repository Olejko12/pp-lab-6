package company.models;
import company.abstracts.Employee;

public final class Worker extends Employee{
    public Worker(String name, int id, double salary){
        super(name, id, salary);
    }
    public void work(){
        System.out.println("Worker"+getName()+"is working...");
    }
}
