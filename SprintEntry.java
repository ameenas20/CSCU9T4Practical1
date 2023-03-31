/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stir.cscu9t4practical1;
class SprintEntry extends Entry {
    private int Repetitions;
     private int Recovery;
     
 public SprintEntry( String n, int d , int m, int y, int h , int min ,int s, float dist, int r ,int z )
 { super (n, d,m,y,h,min,s,dist);
  Repetitions= r ; 
 Recovery = z;
 }
 public  int getRepetitions(){ 
  return Repetitions;}
 
 public int getRecovery(){ return Recovery; }
  

 public String getEntry (){  String result = getName() + " sprinted " + getRepetitions() + "x" + getDistance() + "m in "
                + getHour() + ":" + getMin() + ":" + getSec() +  " with "
                + getRecovery() + " minutes recovery on "
                + getDay() + "/" + getMonth() + "/" + getYear() +"\n";
        return result;
 }
}
/**
 *
 * @author Ameena
 */
