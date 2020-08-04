/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.differentdesignpatterns;

/**
 *
 * @author NaHiD
 */
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