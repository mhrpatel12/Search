
package com.mihir.googlesearch.model.SearchResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CseImage implements Parcelable
{

    @SerializedName("src")
    @Expose
    private String src;
    public final static Creator<CseImage> CREATOR = new Creator<CseImage>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CseImage createFromParcel(Parcel in) {
            return new CseImage(in);
        }

        public CseImage[] newArray(int size) {
            return (new CseImage[size]);
        }

    }
    ;

    protected CseImage(Parcel in) {
        this.src = ((String) in.readValue((String.class.getClassLoader())));
    }

    public CseImage() {
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(src);
    }

    public int describeContents() {
        return  0;
    }

}
