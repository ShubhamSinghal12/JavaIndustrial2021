import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        spiral(arr,m,n);
        
       
     }

     public static void spiral(int[][] arr,int n,int m){
    	 int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=m-1;
        int totalele=m*n;
        int count=0;

        while(count<totalele){
            for(int col=col_start;col<=col_end && count < totalele;col++){
//                System.out.println(row_start+" "+col+" "+count);
                System.out.print(arr[row_start][col]+", ");
                count++;
            }
            
            row_start++;
            if(count>= totalele)
            {
            	break;
            }
            
            for(int row=row_start;row<=row_end;row++){
                System.out.print(arr[row][col_end]+", ");
                count++;
            }
            col_end--;

            for(int col=col_end;col>=col_start;col--){
                System.out.print(arr[row_end][col]+", ");
                count++;
            }
            row_end--;
            for(int row=row_end;row>=row_start;row--){
                System.out.print(arr[row][col_start]+", ");
                count++;
            }
            col_start++;
        }

        System.out.print("END");
     }

}