
package com.mihir.googlesearch.model.SearchResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("reviewcount")
    @Expose
    private String reviewcount;
    public final static Creator<Product> CREATOR = new Creator<Product>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        public Product[] newArray(int size) {
            return (new Product[size]);
        }

    }
    ;

    protected Product(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.reviewcount = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReviewcount() {
        return reviewcount;
    }

    public void setReviewcount(String reviewcount) {
        this.reviewcount = reviewcount;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(reviewcount);
    }

    public int describeContents() {
        return  0;
    }

}
