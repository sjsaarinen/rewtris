/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package peli;

/**
 * Luokka mallintaa pelin Z-palikkaa, Luokassa on tieto palikan muodosta eri asennoissa.
 * 
 * @author sjsaarin
 */
public class PalikkaZ extends Palikka {
    
    private final int koko = 3;
    private final int tyyppi = 7;
    private final boolean asennot[][][] = {
        {
            { true, true, false },
            { false, true, true },
            { false, false, false }       
        },
        {
            { false, false, true },
            { false, true, true },
            { false, true, false }
        },
        {
            { false, false, false },
            { true, true, false },
            { false, true, true }
        },
        {
            { false, true, false },
            { true, true, false },
            { true, false, false }
        }
    };
    
    public PalikkaZ(){
        this.asento = 0;
        super.koko = this.koko;
        super.asennot = this.asennot;
        super.tyyppi = this.tyyppi;
    }

}
