package br.cesed.persist;

import br.cesed.reso.DadosCartao;
import br.cesed.reso.GatewayPagamento;
import br.cesed.reso.StatusTransacao;
import br.cesed.reso.ValidaCPF;

public class PaypalGateway implements GatewayPagamento {
	private double valorPedido;

	public StatusTransacao realizarPagamento(DadosCartao dados, double valor) {
		if (ValidaCPF.isCPF(dados.getCpf()) && dados.getSaldo() >= valorPedido) {
			return StatusTransacao.APROVADO;
		} else if (ValidaCPF.isCPF(dados.getCpf()) && dados.getSaldo() < valorPedido) {
			return StatusTransacao.SALDO_INSUFICIENTE;
		}
		return StatusTransacao.RECUSADO;
	}

}
