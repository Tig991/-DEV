package cest.edu.br.ParImpar;

import javax.swing.JOptionPane;

public class ParImpar {

public static void main(String[] args) {
		int number = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Enter one number"));
		
		if(number % 2 ==0) {
			System.out.println("O n�mero % � par!"); 
			
		} else {
				System.out.println("O n�mero % � �mpar");
				
		}		
	}
}