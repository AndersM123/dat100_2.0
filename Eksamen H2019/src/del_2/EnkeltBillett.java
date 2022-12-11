package del_2;

public abstract class EnkeltBillett extends Billett {

	public EnkeltBillett(int soner) {
		super(soner);
	}

	public boolean aktiver(int sone) {
		boolean aktiv = false;

		if (super.getStatus() == Status.IKKEAKTIV) {
			super.setStatus(Status.AKTIV);
			super.setSoneaktivert(sone);
			aktiv = true;
		}
		return aktiv;

	}

}
