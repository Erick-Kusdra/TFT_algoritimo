package tft;
import java.util.Scanner;

public class Team_fight_tatics {

		public static void main(String[] args) {
			
			int round = 1, ouro = 0, vida = 100, streak = 0, adicional = 0, exp = 0; 
			Scanner teclado  = new Scanner(System.in);
			
			while (vida > 0){
				System.out.println("vida: " + vida +" round: " + round + " ouro: " + ouro +" streak: " + streak + "Exp: " + exp);
				System.out.println("Você venceu?(1) ou perdeu?(2)");
				
				int vitoria = teclado.nextInt();
					if(vitoria == 1) { //caso vença
						System.out.println("ganhou");
						if(streak >= 0) {
							streak = streak + 1;} //quando aprender função, vc substitui por uma
						else {
							streak = 0;
						}
					}
					if(vitoria == 2) { //caso perca
						System.out.println("perdeu");
						if(streak <= 0) {
							streak = streak - 1;}
						else {
							streak = 0;
							vida = vida - 10;
								}
						}
					//A seguir entrega de ouro
						
						//calculo da streak positiva
							if(streak >= 2 && streak <= 4) {
								adicional = adicional + 1;
							}
							if(streak >= 5 && streak <= 7) {
								adicional = adicional + 2;
							}
							if(streak > 7) {
								adicional = adicional + 3;
							}
							
						// calculo da streak negativa
							if(streak >= -2 && streak <= -4) {
								adicional = adicional - 1;
							}
							if(streak >= -5 && streak <= -7) {
								adicional = adicional - 2;
							}
							if(streak < 7) {
								adicional = adicional - 3;
							}
							
						if(ouro > 50) {
							adicional = 5;
						}
						
						int dezenabonus = ouro;
						while (dezenabonus >= 10) {
							dezenabonus /= 10;
						}
						adicional = Math.min(dezenabonus ,5);
					ouro = ouro + 5 + Math.abs(adicional)  + streak;
					round = round + 1; //adicionar o sub round (1-2, 2-5, 3-7)
					exp = exp + 2;
					
					
						//Rodada de compra
						System.out.println("O que deseja fazer?");
						if(teclado.nextLine() == "a") {
							//Função de atualizar a loja
						if(teclado.nextLine() == "e");
							exp = exp + 4;
							ouro = ouro - 4;
						}
					}
			
			}
		

	}


