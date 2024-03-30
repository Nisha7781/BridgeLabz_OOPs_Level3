class Employee
{
    String name;

    Employee(String name)
    {
        this.name = name;
    }

    String getname()
    {
     return name;
    }
}
public class SwapEmployee
{
    static void Swap(Employee emp1, Employee emp2)
    {
        String temp = emp1.getname();
        emp1.name = emp2.getname();
        emp2.name = temp;
    }
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Nisha");
        Employee emp2 = new Employee("Gauri");

        System.out.println("Before swapping: ");
        System.out.println("Employee 1 is: " + emp1.getname());
        System.out.println("Employee 2 is: " + emp2.getname());

        Swap(emp1,emp2);

        System.out.println("After swapping: ");
        System.out.println("Employee 1 is: " + emp1.getname());
        System.out.println("Employee 2 is: " + emp2.getname());

    }
}
