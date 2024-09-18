package br.unipar.programacaointernet.servicecep.projetoframework.controller;

import br.unipar.programacaointernet.servicecep.projetoframework.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("senha") String senha,
                        @RequestParam("pagina") String pagina,
                        Model model) {
        boolean autenticado = loginService.autenticar(email, senha);
        if (autenticado) {
            model.addAttribute("usuario", email);
            if ("pagBoot".equals(pagina)) {
                return "redirect:/pagBoot";
            } else if ("pagPure".equals(pagina)) {
                return "redirect:/pagPure";
            }
        }
        model.addAttribute("erro", "Usuário ou senha inválidos");
        return "login";
    }
    @GetMapping("/pagBoot")
    public String showPageWithFramework1() {
        return "pagBoot";
    }

    @GetMapping("/pagPure")
    public String showPageWithFramework2() {
        return "pagPure";
    }
}
