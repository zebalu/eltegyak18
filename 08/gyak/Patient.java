package gyak;

public class Patient {
	
	private final String doctor;
	private String illness;
	
	public Patient(String doctor) {
		this.doctor=doctor;
	}
	
	public String getDoctor() {
		return doctor;
	}
	
	public void setIllness(String illness) {
		this.illness=illness;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public int getBloodPressure() {
		return 120;
	}
	
	public String print() {
		if(illness == null) {
			throw new PatientIsNotReadyException();
		}
		return "patient was diagnosed with "+illness;
	}
}