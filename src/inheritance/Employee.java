/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author michaelkhanda
 */
public class Employee extends Person{
private double salary;

Employee(String name, String number, double salary)
{
super(name, number);
this.salary = salary;
}
public double  getsalary(int i)
{
return salary;
}
public void setsalary()
{
this.salary = salary;
}
    
}
