package desafio3Teste;

import java.util.Arrays;
import java.util.List;

import desafio3Infra.InfraA;

public class TesteAnagrams {
	
	public static void main(String[] args) {
		
		List<String> wordAnalizer = Arrays.asList("aacjv","aacvj","aajcv","aajvc",
				"aavcj","aavjc","acajv","acavj","acjav","acjva","acvaj","acvja","ajacv",
				"ajavc","ajcav","ajcva","ajvac","ajvca","avacj","avajc","avcaj","avcja",
				"avjac", "avjca", "caajv","caavj", "cajav","cajva","cavaj","cavja",
				"cjaav","cjava","cjvaa","cvaaj","cvaja","cvjaa","jaacv","jaavc","jacav",
				"jacva","javac","javca","jcaav","jcava","jcvaa","jvaac","jvaca","jvcaa",
				"vaacj","vaajc","vacaj","vacja","vajac","vajca","vcaaj","vcaja","vcjaa",
				"vjaac","vjaca","vjcaa", "PeDRo", "Erdnaxela", "alexandre", "Casa", 
				"PODER", "asac", "paralelepipedo", "odepipelelarap", "CASAR", "SaCaR",
				"sarac", "java", "Python", "NOHTYP", "htypon", "c#", "#c");
		
		List<List<String>> wordAnalizerFinal = InfraA.AnagramsList(wordAnalizer);
		
		InfraA.view(wordAnalizerFinal);
		
	}
}
