package javamethod;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation bank = new Encapsulation();
		bank.setActbal(5500);
		double bal = bank.getActbal();
		System.out.println(bal);

	}

}
