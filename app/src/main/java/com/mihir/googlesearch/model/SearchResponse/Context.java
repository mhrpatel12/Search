
package com.mihir.googlesearch.model.SearchResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Context implements Parcelable {

    @SerializedName("title")
    @Expose
    private String title;
    public final static Creator<Context> CREATOR = new Creator<Context>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Context createFromParcel(Parcel in) {
            return new Context(in);
        }

        public Context[] newArray(int size) {
            return (new Context[size]);
        }

    };

    protected Context(Parcel in) {
        this.title = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Context() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
    }

    public int describeContents() {
        return 0;
    }

}
