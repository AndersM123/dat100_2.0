package del_3;

public class WebDokument {

	private String url;
	private String[] ord;
	
	public WebDokument(String url, String innhold) {
		this.url = url;
		this.ord = delOpp(innhold);
	}
	
	public boolean finnes(String sokeord) {
		boolean finnes = false;
		String[] tab = ord;
		
		for(int i=0; i < tab.length; i++) {
			if(tab[i].equals(sokeord)) {
				finnes = true;
			}
		}
		return finnes;
	}
	
	
	public int frekvens(String sokeord) {
		int i = 0;
		
		for(String ord : ord) {
			if(ord.equals(sokeord)) {
			i++;
		}
		}
		
		return i;
	}
	
	
	
	private String[] delOpp(String innhold) {}
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String[] getOrd() {
		return ord;
	}

	public void setOrd(String[] ord) {
		this.ord = ord;
	}

}
