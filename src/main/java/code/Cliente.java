/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Davi Tenorio
 */
public class Cliente  {                                   // --------------------------------------------------
    
    private String nome, email, cpf , idade , sexo;
 

   
    public Cliente (String nome, String email, String cpf, String idade, String sexo){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
       
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo( String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuarios cadastrados{" + "nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

   
   
    
    
}   
