/**
 * Created by learn on 10/11/22.
 */
import java.util.Scanner;
public class EMPLOYEES_TEST {
    public static void main(String[] args) {
        double salary,byPercent;
        String name;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name:");
        name=in.next();
        System.out.println("enter the salary:");
        salary=in.nextDouble();
        System.out.println("enter the  percent:");
        byPercent=in.nextDouble();
        EMPLOYEEES emp=new Employee(name,salary);
        emp.raiseSalary(byPercent);
        System.out.println("the name is : "+emp.getName());
        System.out.println("and salary= "+emp.getSalary());
    }
}
