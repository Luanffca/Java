import java.text.SimpleDateFormat;
import java.util.Date;

public class UserdProduto extends Produto{
    private static final SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;


    public UserdProduto(String nome, double preco, Date manufactureDate) {
        super(nome, preco);
        this.manufactureDate = manufactureDate;
    }

    public Date getDate(){
        return manufactureDate;
    }

    public void setDate(Date manufactureDate){
        this.manufactureDate = manufactureDate;
    }
    
    
    @Override
    public String priceTag() {
        return "(Produtos Usados) \n Nome " + getNome()
				         + " R$ " 
				         + String.format("%.2f", getPreco())
				         + " (Data de Fabricação: "
				         + data.format(manufactureDate)
				         + ")";
    }
}