package Problems.Chapter17_DetailsAboutContainers.c_;

import java.util.ArrayList;

/**
 * @author SashaKhyzhun on 4/27/17.
 */
public class SwapListModel {

    private ArrayList<Integer> arrayList;
    private int firstSwapPosition;
    private int secondSwapPosition;

    public SwapListModel(ArrayList<Integer> arrayList, int firstSwapPosition, int secondSwapPosition) {
        this.arrayList = arrayList;
        this.firstSwapPosition = firstSwapPosition;
        this.secondSwapPosition = secondSwapPosition;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getFirstSwapPosition() {
        return firstSwapPosition;
    }

    public void setFirstSwapPosition(int firstSwapPosition) {
        this.firstSwapPosition = firstSwapPosition;
    }

    public int getSecondSwapPosition() {
        return secondSwapPosition;
    }

    public void setSecondSwapPosition(int secondSwapPosition) {
        this.secondSwapPosition = secondSwapPosition;
    }

    @Override
    public String toString() {
        return "SwapListModel{" +
                "arrayList=" + arrayList +
                ", firstSwapPosition=" + firstSwapPosition +
                ", secondSwapPosition=" + secondSwapPosition +
                '}';
    }
}