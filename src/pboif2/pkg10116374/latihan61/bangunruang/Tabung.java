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
public class Tabung extends BangunRuang{

    @Override
    public float hitungVolume() {
        return (PHI*getR()*getR())* getT();    }
    
}

