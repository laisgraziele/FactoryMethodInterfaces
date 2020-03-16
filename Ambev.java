package FactoryWithInterfaces;

public class Ambev implements FabricaDeCerveja {

	@Override
	public Cerveja criarCerveja(String nome) {
		
		if (nome == null) {
			
			return null;
		}
		
		if (nome.equalsIgnoreCase("Budweiser")) {
			
			return new Budweiser();
			
		} else if (nome.equalsIgnoreCase("Corona")) {
			
			return new Corona();
		}
		
		return null;
		
		
		
	}



	

}
