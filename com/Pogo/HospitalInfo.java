package com.Pogo;

import java.util.Scanner;

public class HospitalInfo {
	public static void main(String[] args) {
		System.err.println("Hospital Details..!");
		Scanner sc = new Scanner(System.in);
		
		Hospital h = new Hospital();
		
		System.out.println("Enter Hospital Name");
		h.setHospitalName(sc.nextLine());

		System.out.println("Enter No. of doctors");
		h.setTotaldoctors(sc.nextInt());

		System.out.println("Enter No. of nurse");
		h.setTotalnurse(sc.nextInt());

		System.out.println("Enter No. of ICU wards");
		h.setTotalICUWards(sc.nextInt());

		System.out.println("Enter No. of general wards");
		h.setTotalGeneralWards(sc.nextInt());

		System.out.println("Hospital Name "  + h.getHospitalName());
		System.out.println(" Total Doctors " + h.getTotaldoctors());
		System.out.println(" Total Nurse" + h.getTotalnurse());
		System.out.println(" TotalICU wards" + h.getTotalICUWards());
		System.out.println(" Total General Wards" + h.getTotalGeneralWards());

	}

}
