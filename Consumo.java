public class Consumo implements Calcular {
	private int totalB;
	private int totalD;
	private int totalL;

	public int getTotalB() {
		return totalB;
	}

	public void setTotalB(int totalB) {
		this.totalB = totalB;
	}

	public int getTotalD() {
		return totalD;
	}

	public void setTotalD(int totalD) {
		this.totalD = totalD;
	}

	public int getTotalL() {
		return totalL;
	}

	public void setTotalL(int totalL) {
		this.totalL = totalL;
	}

	@Override
	public int calcular(int total) {
		return total;
	}

	@Override
	public int somar(int i, int o, int p) {
		return i + o + p;
	}
}