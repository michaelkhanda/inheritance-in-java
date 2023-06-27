/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author michaelkhanda
 */
public class Inherit_from_employee extends Employee {

private double sales, commission;
Inherit_from_employee(String name, String number, double salary, double sales)
{
super(name, number, salary);
this.sales = sales;
}
private void Commission_Calculator()
{
if (sales > 50000)
{
commission = sales * 0.05;
}
else
{
commission = 0;
}
}
@Override
public double getsalary(int i)
{
Commission_Calculator();
if(i==1)
{
return super.getsalary(1);
}
else{
return commission;
}
}
    
}
