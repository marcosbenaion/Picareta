package ufpa.br.picareta;

public class PicaretaDeDiamante extends Picareta{
	
	public PicaretaDeDiamante(int dia, int mes, int ano)
	{
		setEficiencia("Diamante");
		iniciarResistencia();
		Data dataCriacao = new Data(dia,mes,ano);
	}
	
	public void minerar(String material)
	{
		if (material == "Diamante")
		{
			if (resistenciaAtual < 20)
			{
				System.out.println("Sem resistencia suficiente da picareta. Ela irá quebrar. Repare primeiro a mesma.");
			}
			else
			{
				System.out.print("Minerando material.");
				decrementarResistencia(20);
			}
		}
		
		else
		{
			System.out.println("A picareta não é eficiente contra esse material. Escolha Diamante");
		}
	}
}
