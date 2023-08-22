package br.com.alura.dovecrud.controller;


import br.com.alura.dovecrud.domain.filme.DadosCadastroFilme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping
    public String carregaPaginaFormulario(){
        return "filmes/formulario";
    }

    @PostMapping
    public String CadastroFilme(DadosCadastroFilme dados) {
        System.out.println();
        return "filmes/formulario";
    }
}

