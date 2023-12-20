class FibonacciSeries{

    /*Fibonacci Series(without recursion):-
        2 3 5 ....upto 20terms */

   public static void main(String[] args){
    int a=2;
    int b=3;
    //int count=20;
    int c;
     
     System.out.print(a+" "+b); //first two nos. print
    
    for(int i=1;i<=18;i++){
       c=a+b;
       System.out.print(" "+c);
     /* we use swapping concept for upcoming no.*/
       a=b;  //3 ... ...
       b=c;  //8 ... ...

      }
     

   }

}