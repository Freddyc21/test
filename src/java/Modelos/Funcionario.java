package Modelos;

public class Funcionario {
    int Id;
    String Nombre;
    String Email;
    String Celular;
    
    public Funcionario(){ }
    
    public int getId(){
        return Id;
    }
    public void setId(int id){
        Id = id;
    }
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        Email = email;
    }
    
    public String getCelular(){
        return Celular;
    }
    
    public void setCelular(String celular){
        Celular = celular;
    }
    
    
    
}
