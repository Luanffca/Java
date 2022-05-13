import java.time.Instant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Corrente extends Conta{

    
	List<Historico> historicos = new ArrayList<>();

    // public Corrente(String agencia, String numero, float saldo) {
    //     super(agencia, numero, saldo);
    // }

    public void depositar(float valor) {
		if (valor < 0) {
			System.out.println("** Depósito: Operação inválida");
		} else {
			setSaldo(valor);
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

}
