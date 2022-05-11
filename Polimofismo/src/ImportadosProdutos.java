public class ImportadosProdutos extends Produto {
    private double customsFee;
    

    public ImportadosProdutos(String nome, double preco, double customsFee){
        super(nome,preco);
        this.customsFee = customsFee;
    }

    public double getcustomsFee() {
		return customsFee;
	}

	public void setcustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double precoTotal() {
		return getPreco() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return "Produtos Importados \n Nome" + getNome()
				         + "\n R$ " 
				         + String.format("%.2f", precoTotal())
				         + "\n (Customs fee: R$ " 
				         + String.format("%.2f ", customsFee)
			           	 + ")";
	}
    
}
