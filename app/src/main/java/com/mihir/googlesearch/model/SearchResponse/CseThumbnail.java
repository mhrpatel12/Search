
package com.mihir.googlesearch.model.SearchResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CseThumbnail implements Parcelable
{

    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("src")
    @Expose
    private String src;
    public final static Creator<CseThumbnail> CREATOR = new Creator<CseThumbnail>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CseThumbnail createFromParcel(Parcel in) {
            return new CseThumbnail(in);
        }

        public CseThumbnail[] newArray(int size) {
            return (new CseThumbnail[size]);
        }

    }
    ;

    protected CseThumbnail(Parcel in) {
        this.width = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((String) in.readValue((String.class.getClassLoader())));
        this.src = ((String) in.readValue((String.class.getClassLoader())));
    }

    public CseThumbnail() {
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(src);
    }

    public int describeContents() {
        return  0;
    }

}
