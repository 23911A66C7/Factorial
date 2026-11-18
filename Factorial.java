import java.util.Scanner;
class Factorial{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a psitive number: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Please enter a positive integer.");
        } else if(n==0){
            System.out.println("The Factorial of zero is 1");
        } else{
            int ans=1;
            for(int i=1;i<n;i++){
                ans*=i;
            }
            System.out.println("The factorial of "+n+" is "+ans);
        }
    }
}
