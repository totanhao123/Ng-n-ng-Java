/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    Person s1 = new Person();

    
        while (true) {
            System.out.print("vui long nhap ten: ");
        String name = sc.nextLine();
        if (s1.setName(name)) {
            break;
        } 
    }
        while (true){
            System.out.print("Enter age: ");
            try {
                int age = Integer.parseInt(sc.nextLine());
                if(s1.setAge(age)){
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(" please enter a valid number !");
            }
        }
        while(true){
            System.out.print("Enter country: ");
            String country = sc.nextLine();
            if(s1.setCountry(country)){
                break;
            }
        }
        System.out.println("thong tin nguoi dung:");
        System.out.println("Name: " +s1.getName());
        System.out.println("Age: " +s1.getAge());
        System.out.println("country: " + s1.getCountry());
sc.close();
}
}
