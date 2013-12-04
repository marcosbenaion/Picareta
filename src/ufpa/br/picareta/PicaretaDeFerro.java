package ufpa.br.picareta;

public class PicaretaDeFerro extends Picareta {
	
	public PicaretaDeFerro(int dia, int mes, int ano)
	{
		setEficiencia("Ferro");
		iniciarResistencia();
		Data dataCriacao = new Data(dia,mes,ano);
	}
	
	public void minerar(String material)
	{
		if (material == "Ferro")
		{
			if (resistenciaAtual < 10)
			{
				System.out.println("Sem resistencia suficiente da picareta. Ela ir� quebrar. Repare primeiro a mesma.");
			}
			else
			{
				System.out.print("Minerando material.");
				decrementarResistencia(10);
			}
		}
		
		else
		{
			System.out.println("A picareta n�o � eficiente contra esse material. Escolha Ferro");
		}
	}

}
