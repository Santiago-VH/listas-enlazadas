package model;

public class Turn {
	
	private int number;
	private Turn next;
	private Turn previous;
	
	public Turn(int number) {
		this.number=number;
	}

	public Turn getNext() {
		return next;
	}

	public void setNext(Turn next) {
		this.next = next;
	}

	public Turn getPrevious() {
		return previous;
	}

	public void setPrevious(Turn previous) {
		this.previous = previous;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
