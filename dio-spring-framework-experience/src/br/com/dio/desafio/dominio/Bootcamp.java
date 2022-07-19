package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String name;
	private String description;
	private final LocalDate dateI = LocalDate.now();
	private final LocalDate dateF = dateI.plusDays(45);	
	private Set<Dev> devSubscribed = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Dev> getDevSubscribed() {
		return devSubscribed;
	}
	public void setDevSubscribed(Set<Dev> devSubscribed) {
		this.devSubscribed = devSubscribed;
	}
	public Set<Content> getContents() {
		return contents;
	}
	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
	public LocalDate getDateI() {
		return dateI;
	}
	public LocalDate getDateF() {
		return dateF;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contents, dateF, dateI, description, devSubscribed, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(dateF, other.dateF)
				&& Objects.equals(dateI, other.dateI) && Objects.equals(description, other.description)
				&& Objects.equals(devSubscribed, other.devSubscribed) && Objects.equals(name, other.name);
	}
	
	
	
}
