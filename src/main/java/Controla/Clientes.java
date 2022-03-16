package Controla;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import code.Cliente;
import javax.swing.JOptionPane;
import view.TelaAluguel;
import view.TelaCadastrar;
import view.TelaMenu;

public class Clientes {
   
    private ArrayList<Cliente> adc;
    private boolean ok;
    private String admin = "admin";
    private String senha = "admin";
    
       
    public Clientes() {

        this.adc = new ArrayList<Cliente>();
        
    }
    
    int contCliente = 0;
 int op;

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
    Scanner in = new Scanner(System.in);

    public void VerificaUsuario(String verificaCPF) {
             
        for (int i = 0; i < adc.size(); i++) {
            if(adc.get(i).getCpf().equalsIgnoreCase(verificaCPF)){
               
             //adc.contains(verificaCPF);
               this.op=1;
           
            }
  
        }
      
    }

    public void VerificaCadastro(String verificaNome, String verificaCPF) {
           //JOptionPane.showMessageDialog(null, adc.isEmpty());
           // new TelaAluguel().setVisible(adc.contains(verificaCPF));  
               
        for (int i = 0; i < adc.size(); i++) {
            if (adc.get(i).getCpf().equalsIgnoreCase(verificaCPF)) {
                this.op=1;
               
            } else {
                
               this.op=0;
            }
        }

    }

    @Override
    public String toString() {
        return "Cliente{" + "adc=" + adc + '}';
    }

    public void VerificaADM(String admin, String senha) {
        if ((this.getAdmin().equalsIgnoreCase(admin)) && (this.getSenha().equalsIgnoreCase(senha))) {

            JOptionPane.showMessageDialog(null, " BEM-VINDO ");
            this.setOk(true);

        } else {
            JOptionPane.showMessageDialog(null, " LOGIN ou SENHA Inválida ");
            this.setOk(false);
        }
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void adcionaUsuario(Cliente x) {

        this.adc.add(x);

    }

     public void mostraLista(){
     for (Cliente v: adc){
         System.out.println(v.toString() ); 
     }
     }
     
    public ArrayList<Cliente> mostraClientes() {

        return adc;

    }

}
