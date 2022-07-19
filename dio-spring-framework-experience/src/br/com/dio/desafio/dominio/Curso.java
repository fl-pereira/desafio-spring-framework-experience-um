package br.com.dio.desafio.dominio;

public class Curso extends Content {
	
	private int duration;
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public double calcXp() {
		return XP_PADRAO * duration ;
	}	
	
	@Override
	public String toString() {
		return "Curso [Nome: "
						+ getTitle()
						+ ", Descrição: "
						+ getDescription()
						+ ", Duração: "
						+ duration
						+ ", Local: "
						+ getLocal()
						+", Idioma: "
						+ getLang()
						+ "]";
	}
		
}
