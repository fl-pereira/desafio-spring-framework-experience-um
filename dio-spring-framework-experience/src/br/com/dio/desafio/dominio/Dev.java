package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String name;
	private Set<Content> contentSubscribed 	= new LinkedHashSet<>();
	private Set<Content> contentComplete 	= new LinkedHashSet<>();
	
	public void subscribeBootcamp(Bootcamp bootcamp) {
		this.contentSubscribed.addAll(bootcamp.getContents());
		bootcamp.getDevSubscribed().add(this);
	}
	
	public void progression() {
		Optional<Content> content = this.contentSubscribed.stream().findFirst();
		if(content.isPresent()) {
			this.contentComplete.add(content.get());
			this.contentSubscribed.remove(content.get());
		} else {
			System.out.println("Você não está inscrito em nenhum bootcamp :c");
		}
	}
	
	public double calcXp() {
		return this.contentComplete.stream().mapToDouble(Content::calcXp).sum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getContentSubscribed() {
		return contentSubscribed;
	}

	public void setContentSubscribed(Set<Content> contentSubscribed) {
		this.contentSubscribed = contentSubscribed;
	}

	public Set<Content> getContentComplete() {
		return contentComplete;
	}

	public void setContentComplete(Set<Content> contentComplete) {
		this.contentComplete = contentComplete;
	}
	
		@Override
	public int hashCode() {
		return Objects.hash(contentComplete, contentSubscribed, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(contentComplete, other.contentComplete)
				&& Objects.equals(contentSubscribed, other.contentSubscribed) && Objects.equals(name, other.name);
	}
	
	
	
}
