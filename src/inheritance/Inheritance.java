/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author michaelkhanda
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Employee e1 = new Employee("Michael", "662903", 500000);
System.out.println("Employee details are: " + "\n" + e1.getname() + "\n" + e1.getnumber() + "\n" + e1.getsalary(1));

Employee e2 = new Inherit_from_employee("Michael", "662903", 500000, 700000);
System.out.println("Employee details are: " + "\n" + e2.getname() + "\n" + e2.getnumber() + "\n" + e2.getsalary(2));
    }
    
}
