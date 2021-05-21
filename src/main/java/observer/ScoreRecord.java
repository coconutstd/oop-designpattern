package observer;

import java.util.*;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<Integer>();
    private DataSheetView dataSheetView;
    private MinMaxView minMaxView;

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }

    public void addScore(int score) {
        scores.add(score);
        //dataSheetView.update();
        minMaxView.update();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}

