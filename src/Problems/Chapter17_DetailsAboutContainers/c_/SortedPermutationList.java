package Problems.Chapter17_DetailsAboutContainers.c_;

import java.util.ArrayList;

/**
 * @author SashaKhyzhun on 4/27/17.
 */
public class SortedPermutationList {
    private ArrayList<Integer> sortedPermutationList;
    private int sortedFromPosition;

    public SortedPermutationList(ArrayList<Integer> sortedPermutationList, int sortedFromPosition) {
        this.sortedPermutationList = sortedPermutationList;
        this.sortedFromPosition = sortedFromPosition;
    }

    public ArrayList<Integer> getSortedPermutationList() {
        return sortedPermutationList;
    }

    public void setSortedPermutationList(ArrayList<Integer> sortedPermutationList) {
        this.sortedPermutationList = sortedPermutationList;
    }

    public int getSortedFromPosition() {
        return sortedFromPosition;
    }

    public void setSortedFromPosition(int sortedFromPosition) {
        this.sortedFromPosition = sortedFromPosition;
    }
}

