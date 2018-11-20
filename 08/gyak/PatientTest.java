package gyak;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertNull;

public class PatientTest {
	
	private final String doctor = "Dr. Drake Ramore";
	private Patient p;
	
	
	@Before
	public void createPatient() {
		p = new Patient(doctor);
	}
	
	@Test
	public void create() {
		Assert.assertEquals("Patient should always remain with the same doctor "+
			"he was assigned to at the beginning.", 
			doctor, p.getDoctor());
	}
	
	@Test
	public void illnessIsNotKnownAtCreation() {
		assertNull("We don't know illness in the creation time", p.getIllness());
	}
	
	@Test
	public void getBloodPressure() {
		Assert.assertEquals(120L, p.getBloodPressure());
	}
	
	@Test(expected=PatientIsNotReadyException.class)
	public void print() {
		p.print();
	}
}