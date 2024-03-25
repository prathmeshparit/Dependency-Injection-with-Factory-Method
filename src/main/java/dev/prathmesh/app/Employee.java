package dev.prathmesh.app;

public class Employee
{
  private static   final Employee e = new Employee();
    public static Employee getA()
    {
        return e;
    }

    public void show()
    {
        System.out.println("Employee class");
    }

}
