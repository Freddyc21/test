package Interfaces;

import Modelos.Funcionario;
import java.util.List;

public interface funcionarioCRUD {
    public List listarfuncionario();
    public boolean agregar(Funcionario f);
    public Funcionario listarunfuncionario(int id);
    public boolean actualizar(Funcionario f);
    public boolean borrar(int id);
    
    //Nuestro metodo Abstracto Consultar Esos datos
}
