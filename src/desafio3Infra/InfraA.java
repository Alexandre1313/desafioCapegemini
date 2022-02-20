package desafio3Infra;

import java.util.ArrayList;
import java.util.List;

public class InfraA {
	
	public static List<List<String>> AnagramsList(List<String> list) {
		List<List<String>> resul = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>(); 
		int cont = 1;
		for (int i = 0; i < (list.size() - 1); i++) {
			InfraAObject wordOne = new InfraAObject(list.get(i));
			if(!list1.contains(wordOne.getWord())) {
				for (int j = cont; j < list.size(); j++) {
					InfraAObject wordTwo = new InfraAObject(list.get(j));
					if(wordOne.equals(wordTwo)) {
						if(!list1.contains(wordOne.getWord())){
							list1.add(wordOne.getWord());
							list2.add(wordOne.getWord());
						}
						if(!list1.contains(wordTwo.getWord())){
							list1.add(wordTwo.getWord());
							list2.add(wordTwo.getWord());
						}
					}		
				}
				
			}
			if(list2.size() > 0) {
				resul.add( new ArrayList<String>(list2));
			}
			cont ++;
			list2.clear();
		}
		list1.clear();
		return resul;
	}

	public static void view(List<List<String>> resul) {
		System.out.println("\n--Análise da lista de Strings--\n");
		if(resul.size() != 0) {
			if(resul.size() == 1) {
				System.out.println("Foi encontrada, " + resul.size() + " classe de "
						+ "anagrama na lista passada como parâmetro, como segue abaixo:");
			}
			if(resul.size() > 1) {
				System.out.println("Foram encontradas, " + resul.size() + " classes de "
						+ "anagramas na lista passada como parâmetro, são elas:");
			}
			int cont = 1;
			for(List<String> l: resul) {
				System.out.println("\nClasse de anagramas " + cont + "\n"
						+ "Comtendo " + l.size() + " palavras:\n");
				for(String w: l) {
					System.out.println("  ==> " + w );
				}
				cont ++;
			}
		}else {
			System.out.println("Não foi encontrada nenhuma classe "
					+ "de anagrama na lista passada como parâmetro!");
		}
	}
}
