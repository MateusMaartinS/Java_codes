package br.unipar.programacaointernet.servicecep.projetoframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ProjetoFrameWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoFrameWorkApplication.class, args);
    }

}
