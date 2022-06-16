public class Dentes extends Consumo {
	@Override
	public int calcular(int min) {
		setTotalD(min * 2);
		return getTotalD();
	}

	public Dentes() {
	}
}