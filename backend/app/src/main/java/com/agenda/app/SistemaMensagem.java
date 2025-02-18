package com.agenda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner { 

    @Autowired
    private Curriculo curriculo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Nome " + curriculo.getNome()+ " Email " + curriculo.getEmail() + " Telefone " + curriculo.getTelefone() + " Endereço " + curriculo.getEndereco() + " Formação " + curriculo.getFormacao() + " Experiência " + curriculo.getExperiencia());
    }
    
}
