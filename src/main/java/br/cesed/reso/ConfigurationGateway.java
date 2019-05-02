package br.cesed.reso;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import br.cesed.persist.*;

@org.springframework.context.annotation.Configuration
//@ComponentScan(value={"br.cesed.reso"})
public class ConfigurationGateway {
 
    @Bean (name="MercadoPago")
    public GatewayPagamento getMercadoPagoGateway(){
        return new MercadoPagoGateway();
    }
    @Bean (name="PagSeguro")
    public GatewayPagamento getPagSeguroGateway() {
    	return new PagSeguroGateway();
    }
    
    @Bean (name="Paypal")
    public GatewayPagamento getPaypalGateway() {
    	return new PaypalGateway();
    }
}
