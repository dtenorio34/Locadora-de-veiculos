/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Davi Tenorio
 */

public class Carro {
      Scanner in = new Scanner(System.in); 
      
      public String placa, cor, modelo;
      public LocalDateTime dtHoraChegada, dtHoraSaida;
      public double Checkin , Checkout, km, tanque, kmInicial; 
      
      public Carro(String placa, String cor, String modelo){
          this.cor = cor;
          this.modelo = modelo;
          this.placa = placa;
          this.dtHoraSaida = null;
      }
      
      
      public Carro(String placa, String cor, String modelo, LocalDateTime entrada){
          this.cor = cor;
          this.modelo = modelo;
          this.placa = placa;
          this.dtHoraChegada = entrada;
          this.dtHoraSaida = null;
      }
      
         
   
   public void nivelTanqueCheckin(){
          tanque = 100;
       System.out.println("Digite o km inicial: ");   
       kmInicial= in.nextDouble();
       this.setKm(kmInicial);
   } 

    
   
   public  void nivelTanqueCheckout(double tanque){
       if (tanque==100){
        System.out.println("Tanque cheio");    
       }else{
        System.out.println("Tanque vazio");    
       }
   
   } 
    
   public void KmRodado( double kmAtual){
       km =( kmAtual - kmInicial );
       System.out.println("km percorrido: " + this.getKm());  
   } 
   
 public double getKm() {
        return km;}
 public void setKm(double km) {
        this.km = km;}  
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDateTime getDtHoraChegada() {
        return dtHoraChegada;
    }
    public void setDtHoraChegada(LocalDateTime dtHoraChegada) {
        this.dtHoraChegada = dtHoraChegada;
    }
    
    public void setDtHoraChegada(int dia, int mes, int ano, int hh, int mm){
        this.dtHoraChegada = LocalDateTime.of(ano, mes, dia, hh, mm);
    }
    public LocalDateTime getDtHoraSaida() {
        return dtHoraSaida;
    }

    public void setDtHoraSaida(LocalDateTime dtHoraSaida) {
        this.dtHoraSaida = dtHoraSaida;
    }
      
    public double getTempoPermanencia(){
         Duration d;  
         if (this.dtHoraSaida == null){
             LocalDateTime aux = LocalDateTime.now();
             d = Duration.between(this.dtHoraChegada, aux);
         }else{
             d = Duration.between(this.dtHoraChegada, this.dtHoraSaida);
         }
         long minutos =  d.toMinutes();
         double tempoEmHoras = minutos/60.0;
         return tempoEmHoras;     
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.placa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return true;
    }
      
    
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataEntrada = this.dtHoraChegada.format(formatter);
        String dataSaida = "";
        if (this.dtHoraSaida == null)
            dataSaida = "parado";
        else    
            this.dtHoraChegada.format(formatter);
        
        return (" Placa: "+this.placa + " Entrada: "+dataEntrada+
               " Saida: " +dataSaida); 
                
    }
      
}
