public class BubbleSearcher {

    public static void main(String[] args) {
        int temp;
        Integer[] toSearch={13,19,9,5,12,8,7,4,21,2,6,11};

        for (int i=toSearch.length;i>=2;i--){

for(int j=0;j<i-1;j++){
    if(toSearch[j]>toSearch[j+1]){
        temp=toSearch[j];
        toSearch[j]=toSearch[j+1];
        toSearch[j+1]=temp;
    }
}

        }

        for (Integer i:toSearch){
            System.out.println(i);
        }

    }

}
