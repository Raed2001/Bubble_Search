public class BubbleSearcher {


        private int temp;
public void bubleSearcher(Integer[]toSearch) {
    for (int i = toSearch.length; i >= 2; i--) {

        for (int j = 0; j < i - 1; j++) {
            if (toSearch[j] > toSearch[j + 1]) {
                temp = toSearch[j];
                toSearch[j] = toSearch[j + 1];
                toSearch[j + 1] = temp;
            }
        }

    }

    for (Integer i : toSearch) {
        System.out.println(i);
    }


}
}
