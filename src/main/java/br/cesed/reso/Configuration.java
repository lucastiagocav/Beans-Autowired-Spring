package br.cesed.reso;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;

import br.cesed.persist.PagSeguroGateway;


@org.springframework.context.annotation.Configuration
//@ComponentScan(value={"br.cesed.reso"})
public class Configuration {
 
    @Bean
    public GatewayPagamento getInstitutoBancario(){
        return new PagSeguroGateway();
    }
}
