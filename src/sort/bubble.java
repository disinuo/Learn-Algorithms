/**
 * Created by disinuo on 17/3/24.
 */
public void bubbleSort(){
    for(int i=0;i<length;i++){
        for(int j=0;j<length-i-1;j++){
            int a=input[j];
            int b=input[j+1];
            if(a>b){
                input[j]=b;
                input[j+1]=a;
            }
        }
    }
}
