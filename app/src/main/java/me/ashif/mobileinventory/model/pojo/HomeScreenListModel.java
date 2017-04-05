package me.ashif.mobileinventory.model.pojo;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

public class HomeScreenListModel {
    String headerText;
    String detailText;
    int thumbImage;

    public HomeScreenListModel(String headerText, String detailText, int thumbImage) {
        this.headerText = headerText;
        this.detailText = detailText;
        this.thumbImage = thumbImage;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getDetailText() {
        return detailText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }

    public int getThumbImage() {
        return thumbImage;
    }

    public void setThumbImage(int thumbImage) {
        this.thumbImage = thumbImage;
    }
}
