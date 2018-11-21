package proxy.teoria;

public class ConcreteInstance implements OperazioniDaEseguire{

	public ConcreteInstance () {
		printSomething();

	}

	@Override
	public void printSomething() {
		System.out.println("Concrete");
	}
}
