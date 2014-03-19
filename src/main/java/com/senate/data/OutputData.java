package com.senate.data;

public class OutputData {
	private Object data;

	public OutputData() {
		this.data = new Object[] {};
	}

	public OutputData(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
