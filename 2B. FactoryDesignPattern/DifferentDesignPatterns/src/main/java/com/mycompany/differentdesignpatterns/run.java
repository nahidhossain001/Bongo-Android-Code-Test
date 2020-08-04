/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.differentdesignpatterns;
import java.util.*;
/**
 *
 * @author NaHiD
 */
public class run {
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
         boolean z;
        
        System.out.println("In which you wanna travel, plane or car");
        
        String str2=sc.nextLine();
        
         System.out.println("Enter The number the Wheels it has");
         
         int a=sc.nextInt();
         
         System.out.println("Enter The number the passengers it has");
         
         int b=sc.nextInt();
         
         System.out.println("Do you it to have some gas?");
         System.out.println("1 for True OR 2 for False");
         
         
        int f=sc.nextInt();
        if(f==1)
            z=true;
        else 
            z=false;
      
    FactoryDesignPattern fdp=new FactoryDesignPattern(a,b,z,str2);
       
    Vehicle ve=fdp.getC(str2);
    
    
         
    }
}
    
