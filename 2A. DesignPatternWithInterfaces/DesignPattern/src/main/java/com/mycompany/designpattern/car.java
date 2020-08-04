package com.mycompany.designpattern;

public class car implements Vehicle{
    int w,p;
    boolean g;
    
    public car(int x,int y,boolean b) {
        
        w=x;
        p=y;
        g=b;
    }
    @Override
    public int set_num_of_wheels() {
     return w;
        
    }

    @Override
    public int set_num_of_passengers() {
        return p; 
    }

    @Override
    public boolean has_gas() {
        return g;
    }
 
}
