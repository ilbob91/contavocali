package it.dstech.formazione.service;

import java.util.Arrays;
import java.util.List;

public class Service {

	private String testo;

	public Service(String testo) {
		this.testo = testo;
	}

	public int contaVocaboli() {
		String[] parole = testo.split(" ");
		return parole.length;
	}

	public int contaVocali() {
		String tutto = testo.toLowerCase().replaceAll(" ", "");
		List<Character> vocali = Arrays.asList('a', 'e', 'i', 'o', 'u');
		int contatore = 0;
		for (int i = 0; i < tutto.length(); i++) {
			if (vocali.contains(tutto.charAt(i))) {
				contatore++;
			}
		}
		return contatore;
	}

	public int contaConsonanti() {
		String tutto = testo.toLowerCase().replaceAll(" ", "");
		List<Character> vocali = Arrays.asList('a', 'e', 'i', 'o', 'u');
		int contatore = 0;
		for (int i = 0; i < tutto.length(); i++) {
			if (!vocali.contains(tutto.charAt(i))) {
				contatore++;
			}
		}
		return contatore;
	}

}
