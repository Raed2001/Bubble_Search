public class GUI {



    public static void main(String[] args) {
        Integer[] toSearch={13,19,9,5,12,8,7,4,21,2,6,11};
        Partition partition=new Partition();
        BubbleSearcher bubbleSearcher=new BubbleSearcher();
        Quicksort quicksort=new Quicksort();
        System.out.println("Partition:");
        System.out.println( partition.partitioniere(toSearch,0,8));
        System.out.println("Bubble Search:");
  bubbleSearcher.bubleSearcher(toSearch);
  System.out.println("Quicksort:");
  quicksort.quickSort(toSearch,0,toSearch.length);
    }


}
