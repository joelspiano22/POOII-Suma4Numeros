/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example01semana01;

/**
 *
 * @author Root
 */
public class Operaciones 
{
   //Variables miembro
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    
    //Constructor
    public Operaciones()
    {
        
    }
    
    public Operaciones(double n1,double nx2,double n3,double n4)
    {
       this.n1 = n1; 
       n2 = nx2;
       this.n3 = n3;
       this.n4 = n4;
    }
    
   /**Set y Get*/
    public void setN1(double n1)
    {
        this.n1 = n1;
    }
    public void setN2(double n2)
    {
        this.n2 = n2;
    }
    public void setN3(double n3)
    {
        this.n3 = n3;
    }
    public void setN4(double n4)
    {
        this.n4 = n4;
    }
    
    public double getN1()
    {
        return this.n1;
    }
    public double getN2()
    {
        return this.n2;
    }
    public double getN3()
    {
        return this.n3;
    }
    public double getN4()
    {
        return this.n4;
    }  
    
    public double getSuma()
    {
        return n1 + n2 + n3 + n4;
    }    
} 