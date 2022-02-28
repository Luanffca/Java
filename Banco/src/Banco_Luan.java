public class Banco_Luan {
	public int agencia;
	public int numconta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	//private String getNumConta;
	public int senha;

	//Métodos Personalizados
	public void saldoVer() {
		System.out.println("----------------------");
		System.out.println("Conta: " + this.getNumconta());
		System.out.println("Tipo: "+ this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Status: " + getStatus());
	}
		
	public void imprime() {
		System.out.println("Agencia: " + agencia);
		System.out.println("Número da Conta: " + numconta );
		System.out.println("Operação: " + tipo);
        System.out.println("Senha: " + senha);
		System.out.println("Nome: " + dono);
	}

    public void senhaValida(int seguranca){
        senha = seguranca;
        System.out.println("Verificando a senha");
        if(senha == seguranca){
            System.out.println("Senha valida");
        }
        else{
            System.out.println("Senha invalida");
        }
    }

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "CC") {
			System.out.println("Conta corrente aberta com sucesso!!!");
			this.setSaldo(50);
		}
		else if (t == "CP") {
			System.out.println("Conta poupança aberta com sucesso!!!");
			this.setSaldo(150);
		}
		else{
			System.out.println("Opção inválida!");
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo()> 0) {
			System.out.println("Conta com dnheiro, retirio para que possa feicha-lá");
			}
			else if (this.getSaldo() < 0) {
				System.out.println("Conta não pode ser feichada pois tem Dépito");
			}
			else {
				this.setStatus(false);
				System.out.println("Conta feichada com sucesso!!!");
			}
		
	}
	
	public void depositar(int senhateste,float v) {
        if(senhateste == senha){
            System.out.println("Senha válida!");
            if (this.getStatus()) {
                this.setSaldo(this.getSaldo() + v);
                System.out.println("Deposito realisado na conta " +  this.getDono ());
                }
                else {
                    System.out.println("Impossível fazer deposito com conta fechada");
                }
        }
        else{
            System.out.println("Senha inválida!");
        }
		
	}
	
	public void sacar(int senhateste, float v) {
		if(senhateste == senha){
            System.out.println("Senha válida!");
			if (this.getStatus()) {
				if (this.getSaldo() >= v) {
					this.setSaldo(this.getSaldo() - v);
					System.out.println("Saque realizado na conta de " +  this.getDono ());
				}
				else { 
					System.out.println("Saldo insufiente para sague.");
				}
			}
			else { 
					System.out.println("Impossível sacar em conta fechada.");
			}
		}
        else{
            System.out.println("Senha inválida!");
        }
	}

	public void pagarConta (int senhateste, float pagar) {
		if(senhateste == senha){
            System.out.println("Senha válida!");
			if(this.getStatus()) {
				this.setSaldo(this.getSaldo() - pagar);
				System.out.println("Conta paga com secesso por " + this.getDono()); 		
				}
			
			else {
				System.out.println("Impossível pagar uma conta");
			}
		}
        else{
            System.out.println("Senha inválida!");
        }
	}

	void Transferir(int nuConta, int senhaTeste, int agenciaTeste, float valor){
		if(nuConta == numconta && agenciaTeste == agencia && senhaTeste == senha){
			
		}
	}
	
	//Métodos Especiais
	public Banco_Luan( ) {
		this.saldo = 0;
		this.status = false;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumconta() {
		return numconta;
	}
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
    public int setNumCanto(int numconta) {
		return this.numconta = numconta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
    }
}

