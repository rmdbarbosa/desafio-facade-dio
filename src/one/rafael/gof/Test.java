package one.rafael.gof;

import one.rafael.gof.facade.Facade;

public class Test {
    public static void main(String[] args) {
        // Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Rafael", "12587468");
	}

}

