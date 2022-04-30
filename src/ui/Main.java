package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Link;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Link link = new Link();
		int option=0;
		
		do {
		System.out.println("Inserte la opción que quiere realizar\n\n"
						+ "1. Dar turno\n"
						+ "2. Mostrar turno\n"
						+ "3. Pasar turno\n"
						+ "4. Eliminar turno actual\n"
						+ "0. Salir del programa");
		option =Integer.parseInt(br.readLine());
		
		switch(option) {
		
		case 1: link.giveTurn(option);
		break;
		
		case 2: link.showTurn();
		break;
		
		case 3: link.passTurn();
		break;
		
		case 4: link.deleteActualTurn();
		break;
		
		}
			
			
			
			
		}while(option!=0);
		
		
	
			
		
		
	}
}

