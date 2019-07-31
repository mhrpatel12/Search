
package com.mihir.googlesearch.model.SearchResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spelling implements Parcelable
{

    @SerializedName("correctedQuery")
    @Expose
    private String correctedQuery;
    @SerializedName("htmlCorrectedQuery")
    @Expose
    private String htmlCorrectedQuery;
    public final static Creator<Spelling> CREATOR = new Creator<Spelling>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Spelling createFromParcel(Parcel in) {
            return new Spelling(in);
        }

        public Spelling[] newArray(int size) {
            return (new Spelling[size]);
        }

    }
    ;

    protected Spelling(Parcel in) {
        this.correctedQuery = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlCorrectedQuery = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Spelling() {
    }

    public String getCorrectedQuery() {
        return correctedQuery;
    }

    public void setCorrectedQuery(String correctedQuery) {
        this.correctedQuery = correctedQuery;
    }

    public String getHtmlCorrectedQuery() {
        return htmlCorrectedQuery;
    }

    public void setHtmlCorrectedQuery(String htmlCorrectedQuery) {
        this.htmlCorrectedQuery = htmlCorrectedQuery;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(correctedQuery);
        dest.writeValue(htmlCorrectedQuery);
    }

    public int describeContents() {
        return  0;
    }

}
