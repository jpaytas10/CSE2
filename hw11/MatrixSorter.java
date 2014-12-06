//////////////////////////
//Jake Paytas
//CSE2
//HW 11 Pt II: Matrix Sorter Java Program
//Created to practice sorting multidimensional arrays
//December 5th, 2014

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }//end of main method
   
   public static int[][][] buildMat3d(){
       
       int [][][]array = new int [3][7][9];
       
       for (int s = 0; s<array.length; s++){ //filling the arrays with random numbers
           for (int i = 0; i<3+2*s; i++){
               for (int j = 0; j<s+i+1; j++){
                   
                  array [s][i][j] = (int)(Math.random()*100); //random numbers from 0 to 99, must be casted to cut off decimals
                   
               }
           }
       }//end of for loops
       
       return array;
       
   }//end of buildMat method, matrix is built
   
   public static void show(int [][][] array){
       
       for (int i = 0; i<3; i++){
           System.out.println("--------------------- Slab "+(i+1));
                for (int j = 0; j<3+2*i; j++){
                    for (int k = 0; k<j+i+1; k++){
                        
                        System.out.print(+array[i][j][k]+ " ");
                    }
                    System.out.println(); //return after printing out a line
                }
            System.out.println(); //return after printing out a group
       }//end of for loops
       
       System.out.println("-----------------------------");
       
   }//end of show method
   
   public static int findMin(int [][][] array){
       int minimum = array[0][0][0];
       
       for (int i = 0; i<array.length; i++){
           for (int j = 0; j<3+2*i; j++){
               for (int k = 0; k<j+i+1; k++){ //searches all levels of the array
                   
                   if (array[i][j][k] < minimum){
                       minimum = array[i][j][k]; //if anything is lower than the previous minimum, it becomes the new minimum
                   }//end of if
               }
           }
       }//end of for loops
       
       return minimum;
   }//end of findMin method
   
   public static void sort (int [][] array1){
       
   }//of of sort method
   
}//end of class
