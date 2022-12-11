package del_2;

public abstract class Billett {

	private int soner;
	private Status status;
	private int soneaktivert;
	
	public Billett(int soner) {
		this.soner = soner;
		status = Status.DEAKTIVERT;
		soneaktivert = 0;
	}
	
	public void deaktiver() {
		status = getStatus().DEAKTIVERT;
	}
	
	public abstract boolean aktiver(int sone);
	
	public boolean erGyldig(int sone) {
		if (soner == sone) {
			status = Status.AKTIV;
			return true;
		} else {			
			return false;
		}
	}
	
	public int getSoner() {
		return soner;
	}
	
	public void setSoner(int soner) {
		this.soner = soner;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public int getSoneaktivert() {
		return soneaktivert;
	}
	
	public void setSoneaktivert(int soneaktivert) {
		this.soneaktivert = soneaktivert;
	}
	
	
	
}
