package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static OrderStatus valeuOf(int code) {
		for(OrderStatus valeu : OrderStatus.values()) {
			if(valeu.getCode()==code) {
				return valeu;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
