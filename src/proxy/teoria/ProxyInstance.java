package proxy.teoria;

public class ProxyInstance implements OperazioniDaEseguire {

	ConcreteInstance instance ;

	public ProxyInstance() {
		if (instance == null )
	printSomething();
		try {
			Thread.sleep(1000);
			instance = new ConcreteInstance() ; 
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
	}
	@Override
	public void printSomething() {
		System.out.println("Proxy");
	} 
	
}
