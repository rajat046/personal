import java.util.Scanner;

public class TwoDarray{
    public static void main(String args[])
    {
        int[][] arr = new int[3][3];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}