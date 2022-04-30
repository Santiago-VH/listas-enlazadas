package model;

public class Link {
	private Turn firstLink;
	private Turn actualLink;
	
	public Link() {
		
	}
	
	public void giveTurn(int turn) {
		Turn newLink = new Turn(turn); 
		turn=1;
		if(firstLink == null) {
			firstLink =newLink;
			System.out.println("Turn number 1 added");
		}else{
			Turn currentLink = firstLink;
			
			int max=sizeOfList();
			int cont=1;
			
			if(cont<max) {
				currentLink.setNext(newLink);
				currentLink=currentLink.getNext();
				
				cont++;
				turn++;
				System.out.println("se pasa por el while");
			}
			currentLink.setNext(newLink);
			newLink.setPrevious(currentLink);
			
			System.out.println("Terminado completamente");
		}	
	}
	
	public void showTurn() {
		if(actualLink==null) {
			System.out.println("There's no turns available, please add a turn.");
		}else {
			System.out.println("Actual turn: "+firstLink);
		}
	}
	
	public void passTurn() {
		
	}
	
	public void deleteActualTurn() {
		
	}
	
	public int sizeOfList(){
		Turn current = firstLink;
		int size = 1;
		
		while(current != null&&current!=firstLink) {
			size++;
			current = current.getNext();
		}
		return size;
	}
}









