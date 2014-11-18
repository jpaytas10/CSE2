public class test2{
    
    public static String A(String a){
        return "  " + a + "aa";
    }
    
    public static void main(String [] args){
        
        int i = 0;
        String word = "A";
        for (i=0; i<4; i++){
            word = A( word );
            System.out.println("v: " +word);
        }
        
        
        
    }
}