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
public class Person {
  private String name;
  private int age;
  private String country;

    public Person() {
    }

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if(name == null || name.trim().isEmpty()){
            System.out.println("ten khong hop le");
            return false;
        }
        this.name = name;
        return true;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if(age <= 0 || age >= 100){
            System.out.println("tuoi khogn hop le");
            return false;
        }
        this.age = age;
        return true;
    }

    public String getCountry() {
        return country;
    }

    public boolean setCountry(String country) {
        if(country == null || country.trim().isEmpty()){
            System.out.println("ten khong hop le");
            return false;
        }
        this.country = country;
        return true;
    }
  
}
   
