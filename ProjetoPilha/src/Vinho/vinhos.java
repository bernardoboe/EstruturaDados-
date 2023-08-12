package Vinho;

public class vinhos {

	private String produto;
	private int safra;
	

	public vinhos (String produto, int safra) {

		this.produto = produto;
		this.safra = safra;
	}
	@Override
	public String toString() {
		return produto + "\n" + safra + "\n";
		
	}
  }

