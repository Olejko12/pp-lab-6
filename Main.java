import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args){
        Worker worker1 = new Worker("Krzysiu", 1,5000);
        Worker worker2 = new Worker("Areczek", 2,4500);
        Worker worker3 = new Worker("Tomeczek", 3,4300);
        Worker worker4 = new Worker("Jasiu", 4,4800);
        
        Manager manager = new Manager("Konrad",7,7500);

        System.out.println("Wynagrodzenie pracownika "+ worker1.getName()+" wynosi: "+ worker1.getSalary());
        worker1.work();
        System.out.println("Wynagrodzenie pracownika "+ worker2.getName()+" wynosi: "+ worker2.getSalary());
        worker2.work();
        System.out.println("Wynagrodzenie pracownika "+ worker3.getName()+" wynosi: "+ worker3.getSalary());
        worker3.work();
        System.out.println("Wynagrodzenie pracownika "+ worker4.getName()+" wynosi: "+ worker4.getSalary());
        worker4.work();
        System.out.println("Wynagrodzenie menadżera "+ manager.getName()+" wynosi: "+ manager.getSalary());
        manager.work();
        
    }
}
