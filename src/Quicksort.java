public class Quicksort {

Partition partition=new Partition();

public Integer[] quickSort(Integer[] toSort,int p,int r ){

    if (r>p){
        int q =partition.partitioniere(toSort,0,toSort.length);
        quickSort(toSort,p,--q);
        quickSort(toSort,++q,r);
    }


    return toSort;
    }




}
