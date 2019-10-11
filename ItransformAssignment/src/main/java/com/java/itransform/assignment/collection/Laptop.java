package com.java.itransform.assignment.collection;

import java.util.Objects;

public class Laptop {
	String company;
	int model;
	String operatingSystem;
    String processor;
   
    
    public Laptop()
    {
    	
    }


	public Laptop(String company, int model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getModel() {
		return model;
	}


	public void setModel(int model) {
		this.model = model;
	}


	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public String getProcessor() {
		return processor;
	}


	public void setProcessor(String processor) {
		this.processor = processor;
	}


	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}


	


	@Override
	public boolean equals(Object obj) {
		if (this == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		if (obj==this)
			return true;
		Laptop ol = (Laptop) obj;
		if (company == null) {
			if(this.company == ol.company  && this.model == ol.model)
				return true;
		}
			return false;
	
			}

	@Override
	public int hashCode() {
		
		return Objects.hash(model,company);
	}

	
     public int compareTo(Laptop ol)
     {
    	 return Integer.compare(this.model,ol.model);
     }
     }
     

