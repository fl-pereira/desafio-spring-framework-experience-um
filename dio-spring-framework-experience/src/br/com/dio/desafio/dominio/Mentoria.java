package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Content {

	private LocalDate date;
		
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
		
	@Override
	public double calcXp() {
		return XP_PADRAO + 20d;
	}		
	
	@Override
	public String toString() {
		return "Mentoria [Nome: "
							+ getTitle()
							+ ", Descrição: "
							+ getDescription()
							+ ", Data: "
							+ date
							+ "]";
	}	
	
}
