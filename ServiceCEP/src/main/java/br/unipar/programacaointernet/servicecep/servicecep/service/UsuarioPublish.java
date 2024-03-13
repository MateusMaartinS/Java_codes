package br.unipar.programacaointernet.servicecep.servicecep.service;

import jakarta.xml.ws.Endpoint;

public class UsuarioPublish {
    public static void main (String[] args){
        Endpoint.publish("http://localhost:8080/usuario",
                new UsuarioSIB());

        System.out.println("Usuário Endpoint publicado com sucesso!");
    }
}
