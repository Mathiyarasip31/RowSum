import java.util.Scanner;
public class RowSum {
    static void Sum(int array[][],int n,int m)
    {
        int sum[]=new int[m];
        for(int j = 0; j < m; j++) {
            for (int i=0;i < n; i++) {
                sum[i]+=array[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(sum[i]+" ");

        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=scanner.nextInt();
        System.out.println("Enter number of columns");
        int m=scanner.nextInt();
        System.out.println("Enter elements");
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Sum(array,n,m);
    }
}