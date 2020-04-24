package exceptions;



public class MultipleChoiseExceptions extends Exception {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
// Constructor with standard message 	
	public MultipleChoiseExceptions() {
		super("Please follow the menu guidelines and select a number between 1 to 7.");
	}
//	Constructor with custom message String parameter
	public MultipleChoiseExceptions(String text) {
		super(text);
	}
}
