package model.exceptions;

public class AccountExceptions extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public AccountExceptions(String mensageError) {
		super(mensageError);
	}

}
