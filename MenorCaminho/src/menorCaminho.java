import javax.swing.JOptionPane;

public class menorCaminho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[5][5];
		int aux = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (!(i == j)) {
					if ((matriz[i][j] == 0) && (matriz[j][i] == 0)) {
						matriz[i][j] = Integer
								.parseInt(JOptionPane.showInputDialog("Digite caminho do V" + (i+1) + " para o V" + (j+1)));
						matriz[j][i] = matriz[i][j];

					}
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (!(j == 4)) {
					System.out.print(matriz[i][j]+" |");
				} else {
					System.out.println(matriz[i][j]+" ");
				}

			}
			if(i==4) {
				System.out.println("\n-------");
			}

		}
						
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
						if (matriz[i][j] > matriz[i][j+1]) {
						aux = matriz[i][j+1] ;
						matriz[i][j+1] = matriz[i][j];						
						matriz[i][j] = aux;
						}
				}
			}
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (!(j == 4)) {
					System.out.print(matriz[i][j]+" |");
				} else {
					System.out.println(matriz[i][j]+" ");
				}

			}

		}
					
	
	
		
	}

}
