package tft;
import java.util.List;


public class Personagem {
		public String nome;
		public int quantidade;
		public int custo; //diretamente relacionado a raridade
		public List<String> caracteristicas;
		
			public Personagem(String nome, int quantidade, int custo, List<String> caracteristicas) {
			this.nome = nome;
			this.quantidade = quantidade;
			this.custo = custo;
			this.caracteristicas = caracteristicas;
				}
			
			Personagem Poppy = new Personagem("Poppy",39,1, List.of("Cyberboos", "bastion"));
			Personagem Jhin = new Personagem("Jhin",26,2, List.of("Exotech, Dynamo, Marksman"));
			Personagem Draven = new Personagem("Draven",21,3, List.of("Cyfer, Rapidfire"));
			Personagem Chogath = new Personagem("Chogath",13,4, List.of("Boombot, Bruiser"));
			Personagem Garen = new Personagem("Garen",10,5, List.of("Godnet"));
			
			
				public String verRaridade() {
					return switch (custo) {
							case 1 ->"comum";
							case 2 ->"incomum";
							case 3 ->"raro";
							case 4 ->"epico";
							case 5 ->"lendaria";
							default -> "não existe";
					};
					
			}
				
}

