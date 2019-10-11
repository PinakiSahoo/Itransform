package com.java.itransform.asignment.inheritance;

public class Dateg {
     
	private int yyyy;
	private int mm;
	private int dd;
	private String date = +yyyy+"/"+mm+"/"+dd;
      public Dateg( ) {
    	  

      
      }
	public Dateg(int yyyy, int mm, int dd, String date) {
		super();
		this.yyyy = yyyy;
		this.mm = mm;
		this.dd = dd;
		this.date = date;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.yyyy = yyyy;
		this.mm=mm;
		this.dd=dd;
        this.date=date; 
	}
	@Override
	public String toString() {
		return  "Dateg [yyyy=" + yyyy + ", mm=" + mm + ", dd=" + dd + ", date=" + date + "]";
	}

	      
      
      
      
}
