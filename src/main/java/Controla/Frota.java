/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controla;

import code.Carro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi Tenorio
 */
public class Frota {

    private ArrayList<Carro> adcFrota;

    public Frota() {

        this.adcFrota = new ArrayList<Carro>();
    }

    public void adcionaCarro(Carro x) {
        this.adcFrota.add(x);
    }

    public ArrayList<Carro> getAdcFrota() {
        return adcFrota;
    }
     
    public void frotaInicial() {

        adcFrota.add(new Carro("AUJ-5033", "Preto", "Onix"));
        adcFrota.add(new Carro("HWY-0940", "Vermelho", "HB20"));
        adcFrota.add(new Carro("NEK-4746", "Branco", "Strada"));
        adcFrota.add(new Carro("KET-9765", "Vermelho", "Gol"));
        adcFrota.add(new Carro("MXV-6026", "Preto", "Ka"));
        adcFrota.add(new Carro("HZK-3472", "Vermelho", "Argo"));
        adcFrota.add(new Carro("MXN-0362", "Branco", "T-Cross"));
        adcFrota.add(new Carro("JUM-7599", "Azul", "Renegade"));
        adcFrota.add(new Carro("JZJ-5053", "Branco", "Toro"));
        adcFrota.add(new Carro("LXS-4762", "Vermelho", "Compass"));
        adcFrota.add(new Carro("HVP-5511", "Branco", "Kwid"));
        adcFrota.add(new Carro("MXZ-2927", "Preto", "Tracker"));
        adcFrota.add(new Carro("JER-4855", "Branco", "Creta"));
        adcFrota.add(new Carro("GOI-3938", "Preto", "Mobi"));

        // placa, String cor, String modelo
    }

    public void imprimeFrota() {

        for (Carro p : adcFrota) {
            System.out.println(p.toString());

        }

    }

    public ArrayList<Carro> read() {
        return adcFrota;
    }

    @Override
    public String toString() {
        return "Frota{" + "adcFrota=" + adcFrota + '}';
    }

    int op;

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
   public void VerificaPlaca(String verificaPlaca) {
        System.out.println(adcFrota.isEmpty());
          
        
       for (int i = 0; i < adcFrota.size(); i++) {
          if(adcFrota.get(i).placa.equalsIgnoreCase(verificaPlaca)){
              
              adcFrota.contains(verificaPlaca);
             this.op=1;
           
          }
  
        }
      
    } 
    
    
    
    
}

//--------------------------------------------------------------------------------

