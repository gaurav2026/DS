package com.dlh.zambas.vending.machine;

public class VendingMachineFactory {
	public static VendingMachine createVendingMachine() {
		return new VendingMachineImpl();
	}

}
