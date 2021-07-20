package com.springwk5.appwk5;

public class Payment {


    public Payment() {
        System.out.println("In Constructor....");
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	@Override
	public String toString() {
		return "Payment [message=" + " India " + "]";
	}
    
    
}