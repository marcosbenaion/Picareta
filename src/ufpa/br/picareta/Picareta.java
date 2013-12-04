package ufpa.br.picareta;

public class Picareta extends Item{
	protected int resistenciaAtual;
	protected static int resistenciaMax = 100;
	private String eficiencia;
	private Data dataCriacao;
	protected int preco = 100 * (resistenciaAtual/100);
	
	public String getEficiencia() {
		return eficiencia;
	}
	
	public void setEficiencia(final String eficiencia) {
		this.eficiencia = eficiencia;
	}
	
	public void decrementarResistencia(int valor)
	{
		resistenciaAtual = resistenciaAtual - valor;
	}
	
	public void iniciarResistencia()
	{
		resistenciaAtual = resistenciaMax;
	}
	
	public void mostrarPreco()
	{
		System.out.println("Preço da picareta é: "+preco);
	}
	
	public void verificarResistencia()
	{
		System.out.println("Resistencia atual: "+resistenciaAtual);
	}
	
	public void reparar()
	{
		resistenciaAtual = resistenciaMax;
		System.out.println("Nova Resistencia atual: "+ resistenciaAtual);
	}

}
