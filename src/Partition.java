public class Partition {

    public static void main(String[] args) {

        Integer[] toSearch={13,19,9,5,12,8,7,4,21,2,6,11};
System.out.println(partition(toSearch,0,5));

    }

    private static Integer partition(Integer[] toSearch,int p, int r){
        int xchange1;
        int xchange2;
        int x=toSearch[r];
        int i=p-1;
        for (int j=p;j<r-1;j++){
            if (toSearch[j]<=x){
                i++;
                xchange1=toSearch[i];
                xchange2=toSearch[j];
                toSearch[j]=xchange1;
                toSearch[i]=xchange2;
            }
        }
        xchange1=toSearch[++i];
        xchange2=toSearch[r];
        toSearch[r]=xchange1;
        toSearch[++i]=xchange2;


        return i+1;
    }
}
