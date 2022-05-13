import java.time.Instant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conta {

	public String agencia;
	public String numero;
	private float saldo;

	List<Historico> historicos = new ArrayList<>();

	// public Conta(String agencia, String numero, float saldo){
	// 	this.agencia = agencia;
	// 	this.numero = numero;
	// 	this.saldo = saldo;
	// }

	public void clienteConta() {
		Scanner cliente = new Scanner(System.in);
		System.out.println("Bem vindo a sua conta.");
		System.out.println("Digite o nome de sua conta.");
		String lua = cliente.next();
		int opcao = 0;

	}

	public void depositar(float valor) {
		if (valor < 0) {
			System.out.println("** Depósito: Operação inválida");
		} else {
			saldo = saldo + valor;
			System.out.println("** Depósito: Operação realizada com sucessor!");
			Historico h = new Historico();
			h.operacao = "Depósito";
			float depositor = valor;
			h.detalhes = "Valor do depósito: " + depositor;
			h.data = Instant.now().toString();
			historicos.add(h);
		}	
		
	}

	public void sacar(float valor) {
		if (valor > saldo || valor < 0) {
			System.out.println("** Saque: Saldo insuficiente");
			
		} else {
			saldo = saldo - valor;
			System.out.println("** Saque: Operação realizada com sucessor");
			Historico h = new Historico();
			h.operacao = "Saque";
			float sacar = valor;
			h.detalhes = "Valor do saque: " + sacar;
			h.data = Instant.now().toString();
			historicos.add(h);
		}
		
	}

	public void verExtrato() {
		System.out.println("-------------------------");
		for (int i = 0; i < historicos.size(); i++) {
			System.out.println(historicos.get(i).operacao);
			System.out.println(historicos.get(i).detalhes);
			System.out.println(historicos.get(i).data);
		}
		System.out.println("-------------------------");
		System.out.println("Saldo: " + saldo);
		System.out.println("-------------------------");
	}

	public float getSaldo(){
		return this.saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	public String getAgencia(){
		return this.agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;

	}
	public String getNumero(){
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
