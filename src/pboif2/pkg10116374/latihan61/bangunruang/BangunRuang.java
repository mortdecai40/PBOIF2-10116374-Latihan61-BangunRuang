/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116374.latihan61.bangunruang;

/**
 *
 * @author Acromyrmex
 */
public abstract class BangunRuang {
    
    public final float PHI = (float) 22/7;
    private float r,t;
    

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    public abstract float hitungVolume();
}
