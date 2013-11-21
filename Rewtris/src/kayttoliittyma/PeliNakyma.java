/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kayttoliittyma;

import peli.Kentta;
import peli.Palikka;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Luokka vastaa pelitilanteen piirtämisestä näkymään
 * 
 * @author sjsaarin
 */
public class PeliNakyma extends JPanel {
    
    private Palikka palikka;
    private Kentta kentta;
    private final int width = 30;
    private final int height = 30;
    
    public PeliNakyma(Kentta kentta, Palikka palikka){
        this.palikka = palikka;
        this.kentta = kentta;
        setBackground(Color.WHITE);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        //g.drawRect(50, 50, width, height);
        //g.drawRect(55, 50, width, height);
        int x = palikka.getX()*width;
        int y = 600 - (palikka.getY()*height) + height;
        //palikka.kaannaPalikkaa();
        boolean[][] koordinaatit = palikka.getSolut();
        for (int i = 0; i < palikka.getKoko(); i++){
            for (int j = 0; j < palikka.getKoko(); j++){
                if (koordinaatit[i][j]){
                    g.drawRect(x, y, width, height);
                }
                x += width;
            }
            x = palikka.getX()*width;
            y -= height;
        }
        y = 0; 
        //(kentta.getKorkeus())* height;
        x = 0;
        boolean[][] kentanSolut = kentta.getSolut();
        for (int i = kentta.getKorkeus()-1; i >= 0; i--){
            for (int j = 0; j < kentta.getLeveys(); j++){
                if (kentanSolut[i][j]){
                    g.drawRect(x, y, width, height);
                }
                x += width;
            }
            x = 0;
            y += height;
        }
    }
}