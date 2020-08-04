/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anagram;

/**
 *
 * @author NAHID HOSSAiN
 */
import java.io.*;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.*;
public class anagram {
    
    public static boolean ifAnagram(char[] str1,char[] str2){
    
    int n1 =str1.length;
    int n2=str2.length;
    
    if(n1!=n2)
        return false;
    
    Arrays.sort(str1);
    Arrays.sort(str2);
    
    for (int i=0;i<n1;i++)
        if(str1[i]!=str2[i])
            return false;
    
    return true;
    

    }
    
    public static void main (String args[]){
    
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the first word");
        String str=sc.nextLine();
        char str1[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
        str1[i]=str.charAt(i);
        }
         
       System.out.println("Enter the Second Word");
       String txt=sc.nextLine();
       char str2[]=new char[txt.length()];
       for (int i=0;i<txt.length();i++){
       str2[i]=txt.charAt(i);
        }
       
       if (ifAnagram(str1,str2)){
       System.out.println("Words are Anagram");
       }
       else
           System.out.println("Words are NOt Anagram");
           
       
    }
    
}
