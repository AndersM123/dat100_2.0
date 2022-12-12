package del3;

public abstract class Sensor {

	private String navn;
	private int id;
	
	Sensor(String navn, int id) {
		this.navn = navn;
		this.id=id;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn=navn;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	
}
