package ufpa.br.picareta;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data( int dia, int mes, int ano)
	{
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public Data()
	{
		setDia(1);
		setMes(1);
		setAno(1990);
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(final int ano) {
		if ((ano >= 1990) && (ano <= 2013))
			this.ano = ano;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(final int mes) {
		if ((mes >=1) && (mes <= 12))
			this.mes = mes;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(final int dia) {
		if ((dia >= 1) && (dia <= 31))
			this.dia = dia;
	}
	
	

}
