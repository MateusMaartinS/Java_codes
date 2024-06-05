package br.unipar.programacaoweb.trabalhoconjunto.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {

    @GetMapping("/FiltroVendas")
    public String vendasFiltro(){
        return "FiltroVendas";
    }

}
