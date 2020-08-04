
package com.mycompany.designpattern;

public class run {
    
    public static void main(String []args){
    
        //creating object and passing values
       car c= new car(4,40,true); 
       
        //calling and storing values
       int w=c.set_num_of_wheels();
       int pas=c.set_num_of_passengers();
       boolean bu=c.has_gas();
       
       //print the result
       System.out.println("The number of wheel it has is " + w + " Number of passenger on car is "+ pas + " has gas is "+bu );
    
       
       plane p=new plane(3,100,false);
        boolean b=p.has_gas();
        int passenger=p.set_num_of_passengers();
        int wheels=p.set_num_of_wheels();
        System.out.println("The number of wheel it has is " + wheels + " Number of passenger on plane is "+ passenger + " has gas is "+b );
    
    }
    
}
