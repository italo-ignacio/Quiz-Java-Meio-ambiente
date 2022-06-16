public class Banho extends Consumo {
	@Override
	public int calcular(int min) {
		setTotalB(min * 9);
		return getTotalB();
	}

	public Banho() {
	}
}