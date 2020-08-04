
package com.mycompany.differentdesignpatterns;

public class FactoryDesignPattern {
    
    int w,p;
    boolean g;
    String str2;
    public FactoryDesignPattern(int x,int y,boolean b,String str) {
        
        w=x;
        p=y;
        g=b;
        str2=str;
    }


    public Vehicle getC(String str){
    
        if (str.equals("car"))
            return getIntanceC();
        else
            return getIntanceP();
    
    }
    
    public Vehicle getIntanceC(){
        car c=new car(w,p,g);
        
        System.out.println("The number of wheel it has is " + c.set_num_of_wheels() + " Number of passenger on " + str2 + " is "+ c.set_num_of_passengers() + " has gas is "+c.has_gas() );
        
        return c;
    }
    
    public Vehicle getIntanceP(){
        plane l=new plane(w,p,g);
        
        System.out.println("The number of wheel it has is " + l.set_num_of_wheels() + " Number of passenger on " + str2 + " is "+ l.set_num_of_passengers() + " has gas is "+l.has_gas() );
        return l;
    }
}