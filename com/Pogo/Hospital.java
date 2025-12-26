package com.Pogo;

public class Hospital {
	String HospitalName;
	int totaldoctors;
	int totalnurse;
	int totalICUWards;
	int totalGeneralWards;

	public Hospital() {
		

	}

	public Hospital(String hospitalName, int totaldoctors, int totalnurse, int totalICUWards, int totalGeneralWards) {
		this.totaldoctors = totaldoctors;
		this.totalnurse = totalnurse;
		this.totalICUWards = totalICUWards;
		this.totalGeneralWards = totalGeneralWards;
	}

	public String getHospitalName() {
		return HospitalName;
	}

	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}

	public int getTotaldoctors() {
		return totaldoctors;
	}

	public void setTotaldoctors(int totaldoctors) {
		this.totaldoctors = totaldoctors;
	}

	public int getTotalnurse() {
		return totalnurse;
	}

	public void setTotalnurse(int totalnurse) {
		this.totalnurse = totalnurse;
	}

	public int getTotalICUWards() {
		return totalICUWards;
	}

	public void setTotalICUWards(int totalICUWards) {
		this.totalICUWards = totalICUWards;
	}

	public int getTotalGeneralWards() {
		return totalGeneralWards;
	}

	public void setTotalGeneralWards(int totalGeneralWards) {
		this.totalGeneralWards = totalGeneralWards;
	}

	@Override
	public String toString() {
		return "Hospital [HospitalName=" + HospitalName + ", totaldoctors=" + totaldoctors + ", totalnurse="
				+ totalnurse + ", totalICUWards=" + totalICUWards + ", totalGeneralWards=" + totalGeneralWards + "]";
	}

}
