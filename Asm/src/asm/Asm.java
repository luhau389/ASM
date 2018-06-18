/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author PS07501
 */
public class Asm implements Serializable{

    public String code, name, email,sex,pic;
    public double salary;
    public int age;

    public Asm() {
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email)  {
         
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws Error404 {
        if (salary<0) {
        throw new Error404("Lương >0");
        }
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Error404{
        if (age<0) {
        throw new Error404("Tuổi >0");
        }
        
        this.age = age;
    }

 

  

    

}
