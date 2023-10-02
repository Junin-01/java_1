
public class TestaBanco {
    public static void main(String[] args) {
		
    	Cliente Júnior = new Cliente();
    	Júnior.nome = "Júnior Costa";
    	Júnior.cpf = "222.333.444-21";
    	Júnior.profissão = "programador";
    	
    	Conta contaDoJúnior = new Conta();
    	contaDoJúnior.deposita(100);
    	
    	contaDoJúnior.titular = Júnior;
    	System.out.println(contaDoJúnior.titular.nome);
	}
}
