/// This program should implement a console program
/// that draws ASCII art - a rocket.
/// The size of rocket is determined by a constant
/// defined as SIZE at top of the file.
/// Output format should match what is shown in the sample
/// run in the Assignment 2 Handout.


public class Rocket{

    // This constant determines rocket size.
    public static final int SIZE = 3;
    public static void main(String[] args){   
        build_head();
        build_belt();
        build_upper();
        build_lower();
        build_belt();
        build_head();
    }

    public static void build_head(){
        
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE-i; j++){
                // 3 to 2 to 1
                System.out.print(" ");
            }
            for (int j=0; j<i+1; j++){
                // 1 to 2 to 3
                System.out.print("/");
            }       

            for (int j=0; j<i+1; j++){
                System.out.print("\\");
            }
            System.out.println("");         
        }
    }

    public static void build_belt(){

        System.out.print("+");

        for (int i=0; i<SIZE*2; i++){
        System.out.print("=");
        }

        System.out.print("+");
        System.out.println(" ");
    }

    public static void build_upper(){

        for (int i=0; i<SIZE; i++){
            System.out.print("|"); 
            for (int j=0; j<SIZE-i-1; j++){
                // 2 to 1 to 0
                System.out.print(".");
            }
            for (int j=0; j<i+1; j++){
                // 1 to 2 to 3
                System.out.print("/");
                System.out.print("\\");
            }      
            for (int j=0; j<SIZE-i-1; j++){
                System.out.print(".");
            }
            System.out.print("|"); 
            System.out.println("");         
        }
    }

    public static void build_lower(){

        for (int i=0; i<SIZE; i++){
            System.out.print("|"); 

            for (int j=0; j<i; j++){
                // 0 to 1 to 2
                System.out.print(".");
            }
            for (int j=0; j<SIZE-i; j++){
                // 3 to 2 to 1
                System.out.print("\\");
                System.out.print("/");
            }      
            for (int j=0; j<i; j++){
                System.out.print(".");
            }
            System.out.print("|"); 
            System.out.println("");         
        }
    }
}