/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stir.cscu9t4practical1;

/**
 *
 * @author Ameena
 */
public class CycleEntry extends Entry{
    private String terrain;
    private String tempo;

    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String terra, String temp) {
        super(n, d, m, y, h, min, s, dist);
        terrain = terra;
        tempo = temp;
    }

    public String getTerrain () { return terrain;}

    public String getTempo () { return tempo;}


    public String getEntry () {
        String result = getName() + " cycled " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + " on "
                + getTerrain() + " at " + getTempo() + " tempo" + "\n";
        return result;
    }
}