package br.cesed.processos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.cesed.reso.ConfigurationGateway;
import br.cesed.reso.DadosCartao;
import br.cesed.reso.GatewayPagamento;

public class Application {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationGateway.class);
		GatewayPagamento gp = (GatewayPagamento)context.getBean("MercadoPago");
		
		DadosCartao dados = new DadosCartao();
		dados.setAgencia(12345);
		dados.setConta(43210);
		dados.setCpf("2345234523");
		dados.setTitular("Lucas Tiago"); 
		dados.setSaldo(5000);
		System.out.println(dados);
		
		
		gp.realizarPagamento(dados, 4000.0);
		
		context.close();
	}
}
