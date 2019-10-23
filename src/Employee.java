import java.util.*;
public class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    public int salary;
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int compareTo(Employee em) {                      //salary basis
        if (salary==em.salary){
            return 0;
        }
        else if (salary>em.salary){
            return 1;
        }
        else{
            return -1;
        }
    }
}
class Sorting{
    void fun() {
        List<Employee> ls = new ArrayList<Employee>();
        ls.add(new Employee(1, "abhishek", 560000));
        ls.add(new Employee(2, "abhinav", 1500515));
        ls.add(new Employee(3, "vivek", 151515));
        Collections.sort(ls);

        for (Employee ot : ls) {
            System.out.println(ot.name);
            //System.out.println(ot.salary);
        }
    }

    public static void main(String[] args) {
        Sorting obj=new Sorting();
        obj.fun();
    }
}