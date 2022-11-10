/**
 * Created by learn on 10/11/22.
 */
public class EMPLOYEEES {
    private  String name;
    private  double salary;
    public EMPLOYEEES (String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public EMPLOYEEES(){
        this("",0);}
    public  String getName()
    {return  name;}
    public  double getSalary()
    {return  salary;}
    public void  raiseSalary(double byPercent)
    {
        salary=salary+salary*(byPercent/100);
    }
}
