public class Lavar extends Consumo {
	@Override
	public int calcular(int min) {
		setTotalL(min * 7);
		return getTotalL();
	}

	public Lavar() {
	}
}