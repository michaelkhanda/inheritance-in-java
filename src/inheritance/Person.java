/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author michaelkhanda
 */
public class Person {
private String name, number;
Person(String name, String number)
{
this.name = name;
this.number = number;
}
protected final String getname()
{
return name;
}
public String getnumber()
{
return number;
}
public void setname(String name)
{
this.name = name;
}
public void setnumber(String number)
{
this.number = number;
}

    
}
