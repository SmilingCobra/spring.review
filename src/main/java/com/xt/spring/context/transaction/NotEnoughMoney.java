package com.xt.spring.context.transaction;

public class NotEnoughMoney extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1620034175331883731L;

	public NotEnoughMoney() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotEnoughMoney(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughMoney(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughMoney(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughMoney(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
