package code;
import java.io.IOException;
import java.util.*; 
import javax.swing.JOptionPane;


public class Aluguel {
    
   Scanner in = new Scanner(System.in); 

   public int  seg;
   public double seguro,valorDiaria, vD1,vD2,vD3, vS;
   public boolean ok;
   public float dias; // PODE SER COBRADO A METADE DO DIA
   

 public double getVD1() {
        return vD1;}
 public void setVD1(double vD1) {
        this.vD1 = vD1; }

 public double getVD2() {
        return vD2; }
 public void setVD2(double vD2) {
        this.vD2 = vD2; }

 public double getVD3() {
        return vD3; }
 public void setVD3(double vD3) {
        this.vD3 = vD3;}
  
 public boolean isOk() {
        return ok;}
 public void setOk(boolean ok) {
        this.ok = ok;}
    
 public float getDias(){ 
        return dias; }
 public void setDias( float dias ){
        this.dias = dias;}
    
 public double getSeguro(){ 
        return seguro; }
 public void setSeguro( double seguro ){
        this.seguro = seguro;} 
 
 public double getVS() {
        return vS;
    }
 public void setVS(double vS) {
        this.vS = vS;
    }
   

    public void escolhaPlano(){  // o valor do plano está relacionado com a diaria     
  
  System.out.println("Escolha o plano:\n 1- Basico\n 2- Intermediario\n 3- Vip");   
         int  p = in.nextInt();        
        if(p==1){
            valorDiaria = this.vD1 ;
            this.setOk(true);
        }else if (p==2){
            valorDiaria = this.vD2 ;
            this.setOk(true);
        }else if (p==3){
            valorDiaria = this.vD3 ;
            this.setOk(true);
        } else{
        JOptionPane.showMessageDialog(null,"PLANO INVÁLIDO");
            this.setOk(false); 
        }        
     
} 
 public void mostraPlanos(){ 
   System.out.println("VALORES DOS PLANOS:\n 1- Basico "+this.getVD1()+ "\n 2- Intermediario "+this.getVD2()+ "\n 3- Vip "+this.getVD3()); 
   System.out.println("VALOR DO SEGURO: " + this.getVS());   
    }

   public void escolhaSeguro() throws IOException{
   System.out.println("Deseja fazer o seguro?\nSIM = 1\nNÃO = 0 " );  
   
   seg = in.nextInt();
    if(seg==0){
     seguro = 0.0;
    this.setSeguro(seguro);
     this.setOk(true);
    }
    else if (seg==1){
      seguro = vS; 
     this.setSeguro(seguro);
      this.setOk(true);
    }
    else{
        System.out.println("OPCÇÃO INVÁLIDA"); 
         this.setOk(false);
    }

   }  
    
    
   public void escolhaDias(){ 

   System.out.println("Deseja alugar por quantos dias" );  
          dias = in.nextFloat();
          if(dias <=0){
           System.out.println("NÚMERO INVÁLIDO"); 
             this.setOk(false);
          }
          this.setDias(dias);
          this.setOk(true);
   }    
   
   
   public void escolhaCarro(){ 
      // Frota f = new Frota();
      System.out.println(" Deseja buscar por: \n"
                            + " 1 Modelo\n"
                            + " 2 Cor \n");
 
        
   }
   
  

   
 }
//---------------------------------------------------------------------------------------

 class Pagamento {
  
   private String TipoPagamento ;
    
     Scanner in = new Scanner(System.in); 
   
 public String HoraSaida, LocalSaida   ;   
 public float plano ;
 public float PrecoTotal,DiasAluguel ;
 public float PreçoSeguro = 200; 


        
   
    public void calculapreço( int SeguroCarro){
        Aluguel busca = new Aluguel();
         
          
      if (SeguroCarro == 0){
        PrecoTotal =   busca.getDias() ;
       // PrecoTotal = ((float)DiasAluguel * plano);
         System.out.println("TOTAL A PAGAR SEM O SEGURO: " +PrecoTotal); 
          System.out.println("TOTAL A PAGAR SEM O SEGURO: "+ busca.getDias());  
      }
    
      else if(SeguroCarro == 1){
         PrecoTotal  = ((float)DiasAluguel * plano + PreçoSeguro); 
         System.out.println("TOTAL A PAGAR COM SEGURO: " +PrecoTotal); 
      }
    } 

   
    
   
}
