package Problems.Chapter17_DetailsAboutContainers.c_;

/**
 * @author SashaKhyzhun on 4/27/17.
 */
public class PermutationModel {

    private SwapListModel beforeSwapListModel;
    private SwapListModel afterSwapListModel;
    private SortedPermutationList sortedPermutationList;

    public PermutationModel(SwapListModel beforeSwapListModel,
                            SwapListModel afterSwapListModel,
                            SortedPermutationList sortedPermutationList) {
        this.beforeSwapListModel = beforeSwapListModel;
        this.afterSwapListModel = afterSwapListModel;
        this.sortedPermutationList = sortedPermutationList;
    }

    public SwapListModel getBeforeSwapListModel() {
        return beforeSwapListModel;
    }

    public void setBeforeSwapListModel(SwapListModel beforeSwapListModel) {
        this.beforeSwapListModel = beforeSwapListModel;
    }

    public SwapListModel getAfterSwapListModel() {
        return afterSwapListModel;
    }

    public void setAfterSwapListModel(SwapListModel afterSwapListModel) {
        this.afterSwapListModel = afterSwapListModel;
    }

    public SortedPermutationList getSortedPermutationList() {
        return sortedPermutationList;
    }

    public void setSortedPermutationList(SortedPermutationList sortedPermutationList) {
        this.sortedPermutationList = sortedPermutationList;
    }
}
