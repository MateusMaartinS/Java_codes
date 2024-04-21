/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app_os;

import com.mycompany.app_os.Model.Cliente;
import com.mycompany.app_os.Model.Servico;
import com.mycompany.app_os.Model.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Controller {
    
    private static Controller instancia;
    public static ArrayList<Cliente> listaCliente;
    public static ArrayList<Servico> listaProduto;
    public static ArrayList<Veiculo> listaVeiculo;

    public static Controller getInstance(){
        if(instancia == null){
            return instancia = new Controller();
        }else{
            return instancia;
        }
    }

    private Controller(){
        listaCliente = new ArrayList<>();
        listaProduto = new ArrayList<>();
        listaVeiculo = new ArrayList<>();
    }

    public void salvarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }
    public ArrayList<Cliente> retornarCliente(){
        return listaCliente;
    }

    public void salvarProduto (Servico produto){
        listaProduto.add(produto);
    }

    public ArrayList<Servico> retornarProduto(){
        return listaProduto;
    }
}