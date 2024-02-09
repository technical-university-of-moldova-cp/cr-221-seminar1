import java.util.Scanner;

public class Main {

    static int getCoordonates(char player)
    {
        int x;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Insert " + player +  " :");
            x = scanner.nextInt();
            if(x>= 1 && x<=3){
                return x;
            }
        }
    }
    static  void PrintArray(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char [][]board=new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        PrintArray(board);
        char player='x';
        for (int i = 0; i <9 ; i++) {
            if (player=='x' ){
                player='o';
            } else{
                player='x';
            }

            int x = getCoordonates('X');
            int y = getCoordonates('Y');
            board[x - 1][y - 1] = player;

            PrintArray(board);
        }



    }
}