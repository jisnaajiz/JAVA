import java.util.Scanner;
class MatrixAddition
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows: ");
int rows = sc.nextInt();
System.out.print("Enter the number of columns: ");
int cols = sc.nextInt();
int[][] matrix1 = new int[rows][cols];
int[][] matrix2 = new int[rows][cols];
int[][] result = new int[rows][cols];
System.out.println("Enter elements for matrix 1:");
for (int i = 0; i < rows; i++) 
{
for (int j = 0; j < cols; j++) 
{
matrix1[i][j] = sc.nextInt();
}
}
System.out.println("Enter elements for matrix 2:");
for (int i = 0; i < rows; i++) 
{
for (int j = 0; j < cols; j++) 
{
matrix2[i][j] = sc.nextInt();
}
}
for (int i = 0; i < rows; i++) 
{
for (int j = 0; j < cols; j++) 
{
result[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
System.out.println("sum of matrix addition:");
for (int i = 0; i < rows; i++) 
{
for (int j = 0; j < cols; j++) 
{
System.out.print(result[i][j] + " ");
}
System.out.println();
}
sc.close();
}
}
