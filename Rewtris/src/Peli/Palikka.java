/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Peli;

/**
 *
 * @author sjsaarin
 */
public abstract class Palikka implements PalikkaIf {
    
    int koko;
    int asento;
    boolean[][][] asennot;
    boolean[][] solut;
    
    /*
    /   Palikan vasemman yläkulma x ja y koordinaatit
    */
    private int sijaintiX;
    private int sijaintiY;

    @Override
    public int getKoko() {
         return koko;
    }
    
    @Override
    public boolean[][] getSolut() {
        return this.asennot[asento];
    }

    @Override
    public void kaannaPalikkaa() {
        if (asento < 3){
            asento++;
        } else {
            asento = 0;
        }
    }
    
    public void setX(int x){
        this.sijaintiX = x;
    }
    
    public int getX(){
        return this.sijaintiX;
    }
    
    public void setY(int y){
        this.sijaintiY = y;
    }
    
    public int getY(){
        return this.sijaintiY;
    }
    
    @Override
    public String toString(){
        String mjono = "";
        
        int indeksi = 0;
        for (int i = 0; i < koko; i++){ 
                for (int j = 0; j < koko; j++){
                    if (solut[i][j]){
                        mjono += "X";
                    } else {
                        mjono += " ";
                    }
                    indeksi++;
                }
                mjono += "\n";
            }
        return mjono;
    }
    
}
