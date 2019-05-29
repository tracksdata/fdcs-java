package com;

public class Bank implements Customer, Manager,Cleark {

	@Override
	public void deposit() {
		System.out.println("Depositing");

	}

	@Override
	public void withDraw() {
		System.out.println("Withdrawing");

	}

	@Override
	public void openAccount() {
		System.out.println("Open Account");

	}

	@Override
	public void closeAcoount() {
		System.out.println("Close Account");

	}

	@Override
	public void clearkOperations() {
		System.out.println("-- Cleark Operation");
		
	}

}
