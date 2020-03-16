package FactoryWithInterfaces;

public class Petropolis implements FabricaDeCerveja {

	
	public Cerveja criarCerveja(String nome) {
		
		if (nome == null) {
			
			return null;
		}
		
		if (nome.equalsIgnoreCase("Petra")) {
			
			return new Petra();
			
		} else if (nome.equalsIgnoreCase("Black Princess")) {
			
			return new BlackPrincess();
		}
		
		return null;
		
		
		
	}
	

}
