public class Lole{
public static void main(String [] args){

System.out.println("hello world");

int result = number(5);
System.out.println(result);
}

public static int number(int n){
    
for(int row = 1; row<=n; row++){
    for (int i = 1; i <=row; i++){
        System.out.print("*");
    }
    for (int i = row; i <=n; i++){
        System.out.print(" ");
    }

    for (int i = 1; i <=row; i++){
        System.out.print(" ");
    }
    
    for (int i = row; i<=n; i++){
        System.out.print("*");
}
    
    System.out.println();
}
return n;


    
    }




}
