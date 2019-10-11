package com.training.myapp;

//import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.training.myapp.model.Patient;
import com.training.myapp.model.PatientManager;
//import com.training.myapp.model.PatientStausComparator;

public class MyPatient {
	public static void main(String[] args) {
		Patient p=new Patient();
		
//		PatientStausComparator c=new PatientStausComparator();
		
		
		
		
		PriorityQueue<Patient> patients=new PriorityQueue<Patient>(new Patient.PatientSatusCmparator());
		patients.add(new Patient("Sundharam",4));
		patients.add(new Patient("Minion",2));
		patients.add(new Patient("Agni",3));
		patients.add(new Patient("Lenovo",1));
		patients.add(new Patient("Camlin",5));
		patients.add(new Patient("Vivo",1));
//		for(Patient patient:patients)
//			System.out.println(patient);
		
//		System.out.println(patients.size());
//		for(int i = 0; i < patients.size(); i++) {
//			System.out.println(i); 
//			System.out.println(patients.poll());
//		}
		PatientManager pm=new PatientManager();
		pm.start();
		
		PriorityQueue<Patient>waitingList=new PriorityQueue<Patient>();
		int n;
		System.out.println("Enter the number from the menu");
		Scanner input=new Scanner(System.in);
		
		n=input.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("Enter Name Of The patient");
		String newPatient=input.next();
		System.out.println("Enter Patient Status");
		int n1=input.nextInt();
		
		patients.add(new Patient(newPatient,n1));
		System.out.println("Patient is added to waiting list");
		
		
			break;
			
			
			
			
		case 2:
			System.out.println("patient is treated "+patients.poll());
//			Iterator iterator = patients.iterator(); 
//			if(iterator.hasNext()) 
//	            System.out.print("Next Patient is "+iterator.next() + " ");
			
			
			break;
		case 3:
			while(!patients.isEmpty()) {
				System.out.println(patients.poll());
			}
			//System.out.println(patients.peek());
			break;
		case 4:
			System.out.print("End of the program");
		break;
						

		default:
			System.out.println("Entered wrong choice");
			
		}
		
		input.close();
	
		
	}

}
