package ufpa.br.picareta;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PicaretaDeFerro novo = new PicaretaDeFerro(4,12,2013);
		novo.verificarResistencia();
		novo.minerar("Ferro");
		novo.verificarResistencia();
		novo.reparar();
		
		System.out.println("Manuseando picareta 2: \n");
		PicaretaDeDiamante novo2 = new PicaretaDeDiamante(4,12,2013);
		novo2.verificarResistencia();
		novo2.minerar("Ferro");
		novo2.minerar("Diamante");
		novo2.verificarResistencia();
		novo.reparar();
	}

}
