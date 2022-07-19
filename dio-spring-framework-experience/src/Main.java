import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso cursoA = new Curso();
		
		cursoA.setTitle("Artes Visuais");
		cursoA.setDescription("Artes Visuais com Ênfase em Multimídia.");
		cursoA.setDuration(36);
		
		Curso cursoB = new Curso();
		
		cursoB.setTitle("Análise e Desenvolvimento de Sistemas");
		cursoB.setDescription("Formação em T.I. voltada para back-end.");
		cursoB.setDuration(24);
		
		Mentoria mentoriaA = new Mentoria();
		
		mentoriaA.setTitle("Mentoria - Artes Visuais");
		mentoriaA.setDescription("Mentoria para graduandos em Artes Visuais");
		mentoriaA.setDate(LocalDate.now());
		
		System.out.println(cursoA);
		System.out.println(cursoB);
		System.out.println(mentoriaA);

	}

}
