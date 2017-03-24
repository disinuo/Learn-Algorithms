public void insertSort(){
    for(int i=1;i<length;i++){
        int x=array[i];
        int j=i-1;
        for(;j>=0;j--){
            if(array[j]>x){
                array[j+1]=array[j];
            }else {
                break;
            }
        }
        array[j+1]=x;
    }
}
