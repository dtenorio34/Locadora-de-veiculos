/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controla;


import code.Aluguel;
import code.Cliente;
import java.io.IOException;
import java.util.Scanner;
import view.TelaMenu;
import view.TelaCadastrar;

/**
 *
 * @author Davi Tenorio
 */
public class Locadora {
    int op;
     public static void main(String args[]) throws IOException {
         
          TelaMenu menu = new TelaMenu();
            
            
     Locadora l = new Locadora();   
     Clientes novocliente = new Clientes();
     Aluguel  escolha = new Aluguel();
   //  TelaCadastrar tc = new  TelaCadastrar();
     Frota frota = new Frota();
     frota.frotaInicial();
     Scanner in = new Scanner(System.in);      
     frota.frotaInicial();
 
    int op;
    String n,e, login , senha;
    String c,id,verificaCPF, s;
    String verificaNome ;
 
    do{                                                                         
               menu.setVisible(true); 
            System.out.println("1 CADASTRAR USUARIO \n"                                 
                    +"2 CHECK-IN \n" 
                    +"3 CHECK-OUT \n" 
                    +"4 VISUALIZAR PLANOS \n"
                    +"5 VISUALIZAR CARROS\n"
                    +"6 ADMINISTRADOR\n"
                    +"7 SAIR");                                                 
            
          
          op = in.nextInt();   
            
    
        switch (op) {
            case 1:
                {
                   
                    System.out.println("Digite o nome");
                    n = in.next();
                    System.out.println("Digite seu E-mail");
                    e = in.next();
                    System.out.println("Digite seu CPF");
                    c = in.next();
                    novocliente.VerificaUsuario(c);
                    System.out.println("Digite sua Idade");
                    id = in.next();
                    System.out.println("Digite seu Sexo ('M' ou 'F')");
                    s = in.next();
                    novocliente.adcionaUsuario(new Cliente( n,e,c,id,s));
                    break;
                }
            case 2:
                {
                    
                   
                    System.out.println("Digite o NOME e CPF para a verificação do cadastro \n");
                    System.out.println("Nome: "    );
                    verificaNome = in.next();
                    System.out.println("CPF: "    );
                    verificaCPF = in.next();
                    
                   novocliente.VerificaCadastro(verificaNome, verificaCPF);
                if(novocliente.isOk() == false) {
                   break; 
                }   
                do{ escolha.escolhaPlano();
                  }while (escolha.isOk() == false);    
                
                do{escolha.escolhaSeguro();
                 }while (escolha.isOk() == false);     
                    
                do{escolha.escolhaDias();
                 }while (escolha.isOk() == false);
                
                    
           break;
                }
                  case 3:              
            {
                
                
                
             break;  
              }
            case 4:
            {
                 escolha.mostraPlanos();
                 escolha.setVD2(escolha.vD2);
                 escolha.mostraPlanos();
            } 
                break;
            case 5:    
            {
                frota.imprimeFrota();
                 novocliente.mostraClientes();
            } 
                  break;
              case 6:
              {
                    System.out.println("Digite o LOGIN e SENHA do ADM \n");
                    System.out.println("LOGIN: "    );
                    login = in.next();
                    System.out.println("SENHA: "    );
                    senha = in.next();
                    
                   novocliente.VerificaADM(login, senha);
                if(novocliente.isOk() == false) {
                   break;}
              //   staff.Configuracao();
                
                  novocliente.mostraClientes();
                  
                 break;  
              }
            default:
                break;
        }    

    }while (op!=7);   
      
}
     
  
          
}