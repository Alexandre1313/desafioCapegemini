package desafio1infra;

public class InfraE {
	
	public static void ladder(Integer size) {
		Integer sz = size + 1;
		Integer contE = sz - 1;
		Integer contA = 0;
		
		if(size >= 1) {
			for (int i = 0; i < sz; i++) {
				if(i == 0) {
					for (int j = 0; j < contE; j++) {
						System.out.print("  ");
					}
					for (int k = 0; k <= contA ; k++) {
						System.out.print("* ");
					}
					if(contE < 10) {
						System.out.print(" | Nível: 00" + contE + 
								" -> Topo da escada (" + (sz - size) + ")");
						System.out.println();
						contE --;
						contA ++;
					}else if(contE >= 10 && contE < 100) {
						System.out.print(" | Nível: 0" + contE + 
								" -> Topo da escada (" + (sz - size) + ")");
						System.out.println();
						contE --;
						contA ++;
					}else {
						System.out.print(" | Nível: " + contE + 
								" -> Topo da escada (" + (sz - size) + ")");
						System.out.println();
						contE --;
						contA ++;
					}
				}else if(i < sz - 2 && i > 0) {
					for (int j = 0; j < contE; j++) {
						System.out.print("  ");
					}
					for (int k = 0; k <= contA ; k++) {
						System.out.print("* ");
					}
					if(contE < 10) {
						System.out.print(" | Nível: 00" + contE);
						System.out.println();
						contE --;
						contA ++;
					}else if(contE >= 10 && contE < 100) {
						System.out.print(" | Nível: 0" + contE);
						System.out.println();
						contE --;
						contA ++;
					}else {
						System.out.print(" | Nível: " + contE);
						System.out.println();
						contE --;
						contA ++;
					}
				}else if(i == sz - 2){
					for (int j = 0; j < contE; j++) {
						System.out.print("  ");
					}
					for (int k = 0; k <= contA ; k++) {
						System.out.print("* ");
					}
					System.out.print(" | Nível: 00" + contE + 
							" -> Base da escada (" + size + ")");
					System.out.println();
					contE --;
					contA ++;
				}else if(i == sz - 1) {
					contA *= 2;
					for (int k = 0; k <= contA ; k++) {
						System.out.print("*");
					}
					System.out.println("  | Nível: 000 -> Terreno (Linha sem espaços)");
				}
			}
		}
	}
}
