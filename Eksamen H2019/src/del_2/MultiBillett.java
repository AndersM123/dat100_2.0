package del_2;

public abstract class MultiBillett extends Billett {

	private int antall;

	public MultiBillett(int antall, int soner) {
		super(soner);
		this.antall = antall;
	}

	public boolean aktiver(int sone) {

		boolean aktiv = false;

		if (super.getStatus() != Status.DEAKTIVERT && antall > 0) {
			super.setSoneaktivert(sone);
			super.setStatus(Status.AKTIV);
			aktiv = true;
			antall--;
		} else {
			aktiv = false;
		}

		return aktiv;
	}

	public EnkeltBillett[] konverter() {
		
		EnkeltBillett[] billetter = new EnkeltBillett[antall];

		for (int i = 0; i < billetter.length; i++) {
			
			billetter[i] = new EnkeltBillett(super.getSoner());
		}

		antall = 0;
		return billetter;
	}

}
