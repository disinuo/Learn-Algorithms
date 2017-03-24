/**
 * Created by disinuo on 17/3/24.
 */
public class Outer{
    public static int[] input={3,56,7,47,1,12,34,93,18,5};
    public static void main( String[]argv ) {
        int len=input.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                int a=input[j];
                int b=input[j+1];
                if(a>b){
                    input[j]=b;
                    input[j+1]=a;
                }
            }
        }
        for(int x:input){
            System.out.print(x+" ");
        }
    }
}
