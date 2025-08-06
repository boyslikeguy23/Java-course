import java.util.Scanner;

import static java.sql.DriverManager.println;

public class RockPaperScissors_Ex09 {
    public int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hành động: ");
        char res = sc.next().charAt(0);
//        sc.close(); // Không nên đóng Scanner nếu nó sẽ được sử dụng nhiều lần bởi vì System.in được gọi toàn cục
        return res;
    }
    public void playGame(){
        System.out.println("Chơi trò chơi: Kéo, Búa, Bao.");
        System.out.println("Kéo = K, Búa = B, Bao = G");
        System.out.println("Người chơi 1, nhập hành động của bạn: ");
        char firstPlayerChoice = (char) input();
        System.out.println("Người chơi 2, nhập hành động của bạn: ");
        char secondPlayerChoice = (char) input();
        switch(firstPlayerChoice){
            case 'K':
                if(secondPlayerChoice =='B'){
                    System.out.println("Người chơi 2 thắng!");
                }
                else if(secondPlayerChoice == 'K'){
                    System.out.println("Hoà!");
                }
                else if(secondPlayerChoice == 'G'){
                    System.out.println("Người chơi 1 thắng!");
                }
                break;

            case 'B':
                if(secondPlayerChoice == 'G'){
                    System.out.println("Người chơi 2 thắng!");
                }
                else if(secondPlayerChoice == 'B'){
                    System.out.println("Hoà!");
                }
                else if(secondPlayerChoice == 'K'){
                    System.out.println("Người chơi 1 thắng!");
                }
                break;
            case 'G':
                if(secondPlayerChoice == 'K'){
                    System.out.println("Người chơi 2 thắng!");
                }
                else if(secondPlayerChoice == 'G'){
                    System.out.println("Hoà!");
                }
                else if(secondPlayerChoice == 'B'){
                    System.out.println("Người chơi 1 thắng!");
                }
                break;
            default:
                System.out.println("Hành động không hợp lệ! Vui lòng nhập K, B hoặc G.");
                break;
        }
    }
    public static void main(String[] args) {
        RockPaperScissors_Ex09 game = new RockPaperScissors_Ex09();
        game.playGame();
    }
}
