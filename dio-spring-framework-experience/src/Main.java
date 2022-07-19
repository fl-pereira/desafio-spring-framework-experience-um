import java.time.LocalDate;
import java.util.Locale;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Locale localeData = Locale.getDefault();
		String localeCountry = localeData.getDisplayCountry();
		String localeLang = localeData.getDisplayLanguage();
		
		
		Curso cursoA = new Curso();
		
		cursoA.setTitle("Artes Visuais");
		cursoA.setDescription("Artes Visuais com Ênfase em Multimídia.");
		cursoA.setLocal("Londrina");
		cursoA.setDuration(36);
		cursoA.setLocal(localeCountry);
		cursoA.setLang(localeLang);
		
		Curso cursoB = new Curso();
		
		cursoB.setTitle("Análise e Desenvolvimento de Sistemas");
		cursoB.setDescription("Formação em T.I. voltada para back-end.");
		cursoB.setDuration(24);
		cursoB.setLocal(localeCountry);
		cursoB.setLang(localeLang);
		
		Mentoria mentoriaA = new Mentoria();
		
		mentoriaA.setTitle("Mentoria - Artes Visuais");
		mentoriaA.setDescription("Mentoria para graduandos em Artes Visuais");
		mentoriaA.setDate(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setName("Bootcamp Sortido");
		bootcamp.setDescription("Bootcamp sortido para sua diversão.");
		bootcamp.getContents().add(cursoA);
		bootcamp.getContents().add(cursoB);
		bootcamp.getContents().add(mentoriaA);
		
		// DEV FELIPE
		
		Dev felipe = new Dev();
		felipe.setName("Felipe Pereira");
		felipe.subscribeBootcamp(bootcamp);
		
		System.out.println("Conteúdos inscritos de "
				+ felipe.getName() 
				+ ": "
				+ felipe.getContentSubscribed());
		
		felipe.progression();
		felipe.progression();
		felipe.progression();
		
		System.out.println("----");
		
		System.out.println("Conteúdos inscritos de "
				+ felipe.getName() 
				+ ": "
				+ felipe.getContentSubscribed());
		
		System.out.println("Conteúdos concluídos de "
				+ felipe.getName() 
				+ ": "
				+ felipe.getContentComplete());
		
		System.out.println("XP: " + felipe.calcXp());
		
		System.out.println("---- // ---- // ----");
		
		// DEV DAPH
		
		Dev daph = new Dev();
		daph.setName("Daphne Reis");
		daph.subscribeBootcamp(bootcamp);		
		
		System.out.println("Conteúdos inscritos de "
							+ daph.getName()
							+ ": "
							+ daph.getContentSubscribed());
		
		daph.progression();
		System.out.println("----");
		
		System.out.println("Conteúdos inscritos de "
							+ daph.getName()
							+ ": "
							+ daph.getContentSubscribed());
		
		System.out.println("Conteúdos concluídos de "
							+ daph.getName()
							+ ": "
							+ daph.getContentComplete());

		

	}

}
