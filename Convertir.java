package com.Coversion.Numeros;

public class Convertir {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hexadecimal converter = new Hexadecimal () ;
		
		String hexNumber = "8A9F";
		int decimalNumber = converter.converterToDecimal(hexNumber);
		
		System.out.println("el numero hexadecimal "+ hexNumber + " en decimal es: " +	decimalNumber);
		
	}

}
