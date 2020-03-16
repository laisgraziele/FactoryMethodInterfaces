package FactoryWithInterfaces;

public class Main {

	public static void main(String[] args) {
		
		FabricaDeCerveja fabricaAmbev = new Ambev();
		Cerveja cerveja1 = fabricaAmbev.criarCerveja("budweiser"); 
		cerveja1.informacoesCerveja();
		
		FabricaDeCerveja fabricaPetropolis = new Petropolis();
		Cerveja cerveja2 = fabricaPetropolis.criarCerveja("black princess"); 
		cerveja2.informacoesCerveja();
		
	}
}
