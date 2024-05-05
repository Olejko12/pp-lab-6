import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Worker("Krzysiu", 1, 5000,"14.01.2022", "Janitor"));
        employees.add(new Worker("Areczek", 2, 4500, "22.02.2021", "assistant"));
        employees.add(new Worker("Tomeczek", 3, 4300,"08.03.2023","developer"));
        employees.add(new Worker("Jasiu", 4, 4800,"03.02.2023","IT-service"));
        employees.add(new Manager("Konrad", 7, 7500,"16.12.2020","Manager"));

        
        for (Employee employee : employees){
            employee.work();

            System.out.println("-"+employee.getName()+ ", (ID:"+employee.hashCode()+")"+", Position: "+ employee.getPosition()+", Hire date: "+employee.getHireDate()+", Salary: "+employee.getSalary());
        }
    }
}
