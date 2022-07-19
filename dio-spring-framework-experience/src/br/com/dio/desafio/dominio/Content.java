package br.com.dio.desafio.dominio;

public abstract class Content {
	
	protected static final double XP_PADRAO = 10d;
	
	private String title;
	private String description;
	private String local;
	private String lang;
	
	public abstract double calcXp();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}

}
