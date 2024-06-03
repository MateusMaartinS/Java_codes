/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dto.EnderecoDTO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import jdk.jshell.execution.Util;

/**
 *
 * @author aluno
 */
public class EnderecoService {
    
    private static String URLWEBSERVICE = "http://viacep.com.br/ws/";
    private static int SUCESSO = 200;
    
    public static EnderecoDTO buscaEndereco(String cep){
        String urlChamada = URLWEBSERVICE + cep + "/json";
        
        try{
            URL url = new URL(urlChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                    
            if(conexao.getResponseCode() != SUCESSO){
                throw new RuntimeException("Erro ao Conecatar: "+conexao.getResponseMessage());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String json = Util.converterJsonString(resposta);
            
            Gson gson = new Gson();
            EnderecoDTO dto = gson.fromJson(json,EnderecoDTO.class);
            
            return dto;
        }catch(Exception ex){
            throw new Exception("Erro ao retornar endereço: "+ex);
        }
        
        
    }
    
}
