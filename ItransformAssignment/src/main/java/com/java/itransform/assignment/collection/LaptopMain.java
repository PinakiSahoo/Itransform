package com.java.itransform.assignment.collection;
import java.util.HashSet;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Laptop> l=new HashSet<>();
		l.add(new Laptop("Lenovo",760,"Windows","corei3"));
		l.add(new Laptop("Dell",700,"Windows","corei5"));
		l.add(new Laptop("Acer",500,"Linux","corei7"));
		l.add(new Laptop("HP",960,"Windows","corei3"));
		l.add(new Laptop("Lenovo",760,"Windows","corei3"));
		for(Laptop laptop:l)
		{
			System.out.println(laptop);
		}

	}

}
