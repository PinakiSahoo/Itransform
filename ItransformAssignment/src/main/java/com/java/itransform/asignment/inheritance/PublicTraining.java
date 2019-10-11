package com.java.itransform.asignment.inheritance;

public class PublicTraining extends Training {
	int participant;
	double orderValue;
	
	PublicTraining(){
		
	}

	public PublicTraining(int participant, double orderValue) {
		super();
		this.participant = participant;
		this.orderValue = orderValue;
	}

	public int getParticipant() {
		return participant;
	}

	public void setParticipant(int participant) {
		this.participant = participant;
	}

	public double getOrderValue() {
		
		return fees*participant;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	@Override
	public String toString() {
		return "PublicTraining [participant=" + participant + ", orderValue=" + orderValue + "]";
	}

}
