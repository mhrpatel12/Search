
package com.mihir.googlesearch.model.SearchResponse;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagemap implements Parcelable
{

    @SerializedName("cse_thumbnail")
    @Expose
    private List<CseThumbnail> cseThumbnail = new ArrayList<CseThumbnail>();
    @SerializedName("metatags")
    @Expose
    private List<Metatag> metatags = new ArrayList<Metatag>();
    @SerializedName("cse_image")
    @Expose
    private List<CseImage> cseImage = new ArrayList<CseImage>();
    @SerializedName("website")
    @Expose
    private List<Website> website = new ArrayList<Website>();
    @SerializedName("product")
    @Expose
    private List<Product> product = new ArrayList<Product>();
    @SerializedName("hproduct")
    @Expose
    private List<Hproduct> hproduct = new ArrayList<Hproduct>();
    public final static Creator<Pagemap> CREATOR = new Creator<Pagemap>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pagemap createFromParcel(Parcel in) {
            return new Pagemap(in);
        }

        public Pagemap[] newArray(int size) {
            return (new Pagemap[size]);
        }

    }
    ;

    protected Pagemap(Parcel in) {
        in.readList(this.cseThumbnail, (CseThumbnail.class.getClassLoader()));
        in.readList(this.metatags, (Metatag.class.getClassLoader()));
        in.readList(this.cseImage, (CseImage.class.getClassLoader()));
        in.readList(this.website, (Website.class.getClassLoader()));
        in.readList(this.product, (Product.class.getClassLoader()));
        in.readList(this.hproduct, (Hproduct.class.getClassLoader()));
    }

    public Pagemap() {
    }

    public List<CseThumbnail> getCseThumbnail() {
        return cseThumbnail;
    }

    public void setCseThumbnail(List<CseThumbnail> cseThumbnail) {
        this.cseThumbnail = cseThumbnail;
    }

    public List<Metatag> getMetatags() {
        return metatags;
    }

    public void setMetatags(List<Metatag> metatags) {
        this.metatags = metatags;
    }

    public List<CseImage> getCseImage() {
        return cseImage;
    }

    public void setCseImage(List<CseImage> cseImage) {
        this.cseImage = cseImage;
    }

    public List<Website> getWebsite() {
        return website;
    }

    public void setWebsite(List<Website> website) {
        this.website = website;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public List<Hproduct> getHproduct() {
        return hproduct;
    }

    public void setHproduct(List<Hproduct> hproduct) {
        this.hproduct = hproduct;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(cseThumbnail);
        dest.writeList(metatags);
        dest.writeList(cseImage);
        dest.writeList(website);
        dest.writeList(product);
        dest.writeList(hproduct);
    }

    public int describeContents() {
        return  0;
    }

}
