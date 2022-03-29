
package AtividadeIntegradora;

//Importando classes
import java.util.Scanner;
import java.util.Random;

/*** @author Luccas Torres ***/
public class Script {
    public static void main (String[] args) 
    {
        //Iniciando o Scanner
        Scanner input = new Scanner(System.in);

        //Iniciando Random
        Random random = new Random();
        
        //Criando variáveis 
        int jogada_usuario, jogada_computador, placar_usuario, placar_computador;
        placar_computador = 0;
        placar_usuario = 0;
        
        System.out.println("***Bem vindo ao Pedra-papel-tesoura***");
        System.out.println("Você jogará contra o computador...");
        System.out.println("\n");
        System.out.println("---------------------------------------------------------------------------");
        
        while((placar_usuario + placar_computador) < 3) {
            
            System.out.println("*********Placar*********");
            System.out.println("Jogador: " + placar_usuario + " Computador: " + placar_computador);
            System.out.println("************************");
            
            //Interação com o usuário
            System.out.println("\n");
            System.out.println("Escolha sua jogada:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("Sua jogada: ");
            
            //Armazenando a jogada do usuário
            jogada_usuario = input.nextInt();
                        
               System.out.println("\n");
            
            //Criando jogada aleatória do computador 
            jogada_computador = random.nextInt(3) +1;
            
            //Apresentado as jogadas
            //Jogada usuário
            switch (jogada_usuario){
                case 1:
                    System.out.println("Você escolheu pedra.");
                    break;
                case 2:
                    System.out.println("Você escolheu papel.");
                    break;
                case 3:
                    System.out.println("Você escolheu tesoura.");
                    break;
                default:
                    System.out.println("Opção inválida...");
                    input.close();
            }
            
            //Jogada computador
            switch (jogada_computador){
                case 1:
                    System.out.println("Computador escolheu pedra. \n");
                    break;
                case 2:
                    System.out.println("Computador escolheu papel. \n");
                    break;
                case 3:
                    System.out.println("Computador escolheu tesoura. \n");
                    break;
            }
            
            //Em caso de empate
            if (jogada_usuario == jogada_computador) {
                System.out.println("\n");
                System.out.println("Empate... (っ＾▿＾)۶🍸🌟🍺٩(˘◡˘ )");
                 System.out.println("\n");
                System.out.println("---------------------------------------------------------------------------");
            }
            //Caso contrátio
            else {
                //Caso o jogador vença a rodada
                if ((jogada_usuario == 1 && jogada_computador == 3) || (jogada_usuario == 2 && jogada_computador == 1) || 
                        (jogada_usuario == 3 && jogada_computador == 2)) {
                    //Usuário é o vencedor
                    System.out.println("Você venceu! (っ＾▿＾)💨");
                     System.out.println("\n");
                    System.out.println("---------------------------------------------------------------------------");
                    
                    //Acrescentando vitória ao usuário
                    placar_usuario++;
                }
                else {
                    //Computador vencedor
                    System.out.println("\n");
                    System.out.println("O computador venceu!");
                    System.out.println("\n");
                    System.out.println("---------------------------------------------------------------------------");
                    
                    //Acrescentando vitória ao computador
                    placar_computador++;
                } 
            }
            if (placar_usuario >= 3 || placar_usuario >= 3) {
            
            }
        }
        
        System.out.println("\n");
        System.out.println("********Fim de jogo!********");
        //Verificando o vencedor
        if (placar_usuario > placar_computador) {
            System.out.println("♛Você é o vencedor!!♛");
            System.out.println("\n");
        }
        else {
            System.out.println("O computador é o vencedor!!♛");
            System.out.println("\n");
        }
        System.out.println("*********Placar*********");
        System.out.println("Jogador: " + placar_usuario + " Computador: " + placar_computador);
        System.out.println("************************");
            
        input.close();
    }
}
