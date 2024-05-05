import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        Worker worker1 = new Worker("Krzysiu", 1, 5000, "14.01.2022", "Janitor");
        Worker worker2 = new Worker("Areczek", 2, 4500, "22.02.2021", "assistant");
        Worker worker3 = new Worker("Tomeczek", 2, 4300, "08.03.2023", "developer");
        Worker worker4 = new Worker("Michał",2,3800,"17.04.2024","Janitor");
        Manager manager = new Manager("Konrad", 7, 7500, "16.12.2020", "Manager");
        Manager manager2 = new Manager("Marek", 8,7000,"27.09.2021","manager");

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        
        for (Employee employee : employees){
            employee.work();

            System.out.println("-"+employee.getName()+ " has code: "+ employee.hashCode());
        }
        System.out.println("Porównywanie id:");
        
        System.out.println("worker3 "+worker3.getName()+ " equals worker1 "+worker1.getName()+": " + worker3.equals(worker1));
        System.out.println("worker3 "+worker3.getName()+ " quals worker2 "+worker2.getName()+": " + worker3.equals(worker2));
        System.out.println("worker3 "+worker3.getName()+ " equals manager "+manager.getName()+": " + worker3.equals(manager));

        double totalSalary = 0;
        for (Employee employee : employees){
            totalSalary += employee.getSalary();
        }
        System.out.println("Suma w");
    }
}
