package Lambda;

public class MethodLambda02 {

    public static void printWithSpace(Object o){
        System.out.print(o+" ");
    }
    public static boolean IsCiftNum(int x){
      return  x%2==0;
    }
    public static boolean IsTekNum(int x){
        return x%2!=0;
    }
    public static Integer getSquare(int x){
        return x*x;
    }
    public static Integer getTriple(int x){
        return x*x*x;
    }
    public static int sumNum(int x){
        int sum=0;
        while (x!=0){
            sum=sum+x;
        }
        return sum;
    }
    public static int multiplyNum(int x){
        int mult = 1;
        while(x!=1){
            mult=mult*x;
        }
        return mult;
    }





}
