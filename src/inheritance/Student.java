/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author michaelkhanda
 */
public class Student extends Person{
private double grade;

Student(String name, String number, double grade)
{
super(name, number);
this.grade = grade;
}
public double  getgrade()
{
return grade;
}
public void setgrade()
{
this.grade = grade;
}
    
}
