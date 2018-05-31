/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class day2test {
    
   
    
    
    public static void main(String[] args) {
        for (int a=0 ; a<5; a++){
            for(int b=0 ;b<5;b++){
                if (a>=1 && b>=1 && a<=3 && b<=3){
                    System.out.print(" ");
                    
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        
        
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
        for( int i =2;i<=5;i++)
        
        
        {
    for(int j=1; j<=i;j++)
    {
        System.out.print(j+"");
    }
            System.out.println();
} 
    }
}
