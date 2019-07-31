
package com.mihir.googlesearch.model.SearchResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metatag implements Parcelable
{

    @SerializedName("viewport")
    @Expose
    private String viewport;
    @SerializedName("apple-itunes-app")
    @Expose
    private String appleItunesApp;
    @SerializedName("fb:app_id")
    @Expose
    private String fbAppId;
    @SerializedName("og:site_name")
    @Expose
    private String ogSiteName;
    @SerializedName("twitter:site")
    @Expose
    private String twitterSite;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("og:title")
    @Expose
    private String ogTitle;
    @SerializedName("og:image")
    @Expose
    private String ogImage;
    @SerializedName("og:updated_time")
    @Expose
    private String ogUpdatedTime;
    @SerializedName("og:url")
    @Expose
    private String ogUrl;
    @SerializedName("og:description")
    @Expose
    private String ogDescription;
    @SerializedName("og:type")
    @Expose
    private String ogType;
    @SerializedName("twitter:card")
    @Expose
    private String twitterCard;
    @SerializedName("twitter:title")
    @Expose
    private String twitterTitle;
    @SerializedName("twitter:description")
    @Expose
    private String twitterDescription;
    @SerializedName("twitter:image")
    @Expose
    private String twitterImage;
    @SerializedName("twitter:creator")
    @Expose
    private String twitterCreator;
    @SerializedName("article:publisher")
    @Expose
    private String articlePublisher;
    @SerializedName("article:author")
    @Expose
    private String articleAuthor;
    @SerializedName("article:section")
    @Expose
    private String articleSection;
    @SerializedName("article:section_url")
    @Expose
    private String articleSectionUrl;
    @SerializedName("article:id")
    @Expose
    private String articleId;
    @SerializedName("article:published")
    @Expose
    private String articlePublished;
    @SerializedName("article:modified")
    @Expose
    private String articleModified;
    @SerializedName("news_keywords")
    @Expose
    private String newsKeywords;
    @SerializedName("pinterest:url")
    @Expose
    private String pinterestUrl;
    @SerializedName("twitter:url")
    @Expose
    private String twitterUrl;
    @SerializedName("pinterest:description")
    @Expose
    private String pinterestDescription;
    @SerializedName("pinterest:media")
    @Expose
    private String pinterestMedia;
    @SerializedName("og:image:width")
    @Expose
    private String ogImageWidth;
    @SerializedName("og:image:height")
    @Expose
    private String ogImageHeight;
    @SerializedName("fb:pages")
    @Expose
    private String fbPages;
    @SerializedName("apple-mobile-web-app-title")
    @Expose
    private String appleMobileWebAppTitle;
    @SerializedName("article:published_time")
    @Expose
    private String articlePublishedTime;
    @SerializedName("article:modified_time")
    @Expose
    private String articleModifiedTime;
    @SerializedName("style-tools")
    @Expose
    private String styleTools;
    @SerializedName("msvalidate.01")
    @Expose
    private String msvalidate01;
    @SerializedName("ahrefs-site-verification")
    @Expose
    private String ahrefsSiteVerification;
    @SerializedName("og:image:alt")
    @Expose
    private String ogImageAlt;
    @SerializedName("twitter:image:alt")
    @Expose
    private String twitterImageAlt;
    @SerializedName("sailthru.title")
    @Expose
    private String sailthruTitle;
    @SerializedName("sailthru.tags")
    @Expose
    private String sailthruTags;
    @SerializedName("sailthru.description")
    @Expose
    private String sailthruDescription;
    @SerializedName("sailthru.date")
    @Expose
    private String sailthruDate;
    @SerializedName("sailthru.image.full")
    @Expose
    private String sailthruImageFull;
    @SerializedName("sailthru.image.thumb")
    @Expose
    private String sailthruImageThumb;
    @SerializedName("msapplication-tileimage")
    @Expose
    private String msapplicationTileimage;
    @SerializedName("msapplication-tilecolor")
    @Expose
    private String msapplicationTilecolor;
    @SerializedName("outbrainsection")
    @Expose
    private String outbrainsection;
    @SerializedName("referrer")
    @Expose
    private String referrer;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("music:creator")
    @Expose
    private String musicCreator;
    @SerializedName("twitter:image:src")
    @Expose
    private String twitterImageSrc;
    @SerializedName("format-detection")
    @Expose
    private String formatDetection;
    public final static Creator<Metatag> CREATOR = new Creator<Metatag>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Metatag createFromParcel(Parcel in) {
            return new Metatag(in);
        }

        public Metatag[] newArray(int size) {
            return (new Metatag[size]);
        }

    }
    ;

    protected Metatag(Parcel in) {
        this.viewport = ((String) in.readValue((String.class.getClassLoader())));
        this.appleItunesApp = ((String) in.readValue((String.class.getClassLoader())));
        this.fbAppId = ((String) in.readValue((String.class.getClassLoader())));
        this.ogSiteName = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterSite = ((String) in.readValue((String.class.getClassLoader())));
        this.author = ((String) in.readValue((String.class.getClassLoader())));
        this.ogTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.ogImage = ((String) in.readValue((String.class.getClassLoader())));
        this.ogUpdatedTime = ((String) in.readValue((String.class.getClassLoader())));
        this.ogUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.ogDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.ogType = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterCard = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterImage = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterCreator = ((String) in.readValue((String.class.getClassLoader())));
        this.articlePublisher = ((String) in.readValue((String.class.getClassLoader())));
        this.articleAuthor = ((String) in.readValue((String.class.getClassLoader())));
        this.articleSection = ((String) in.readValue((String.class.getClassLoader())));
        this.articleSectionUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.articleId = ((String) in.readValue((String.class.getClassLoader())));
        this.articlePublished = ((String) in.readValue((String.class.getClassLoader())));
        this.articleModified = ((String) in.readValue((String.class.getClassLoader())));
        this.newsKeywords = ((String) in.readValue((String.class.getClassLoader())));
        this.pinterestUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.pinterestDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.pinterestMedia = ((String) in.readValue((String.class.getClassLoader())));
        this.ogImageWidth = ((String) in.readValue((String.class.getClassLoader())));
        this.ogImageHeight = ((String) in.readValue((String.class.getClassLoader())));
        this.fbPages = ((String) in.readValue((String.class.getClassLoader())));
        this.appleMobileWebAppTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.articlePublishedTime = ((String) in.readValue((String.class.getClassLoader())));
        this.articleModifiedTime = ((String) in.readValue((String.class.getClassLoader())));
        this.styleTools = ((String) in.readValue((String.class.getClassLoader())));
        this.msvalidate01 = ((String) in.readValue((String.class.getClassLoader())));
        this.ahrefsSiteVerification = ((String) in.readValue((String.class.getClassLoader())));
        this.ogImageAlt = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterImageAlt = ((String) in.readValue((String.class.getClassLoader())));
        this.sailthruTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.sailthruTags = ((String) in.readValue((String.class.getClassLoader())));
        this.sailthruDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.sailthruDate = ((String) in.readValue((String.class.getClassLoader())));
        this.sailthruImageFull = ((String) in.readValue((String.class.getClassLoader())));
        this.sailthruImageThumb = ((String) in.readValue((String.class.getClassLoader())));
        this.msapplicationTileimage = ((String) in.readValue((String.class.getClassLoader())));
        this.msapplicationTilecolor = ((String) in.readValue((String.class.getClassLoader())));
        this.outbrainsection = ((String) in.readValue((String.class.getClassLoader())));
        this.referrer = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.musicCreator = ((String) in.readValue((String.class.getClassLoader())));
        this.twitterImageSrc = ((String) in.readValue((String.class.getClassLoader())));
        this.formatDetection = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Metatag() {
    }

    public String getViewport() {
        return viewport;
    }

    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    public String getAppleItunesApp() {
        return appleItunesApp;
    }

    public void setAppleItunesApp(String appleItunesApp) {
        this.appleItunesApp = appleItunesApp;
    }

    public String getFbAppId() {
        return fbAppId;
    }

    public void setFbAppId(String fbAppId) {
        this.fbAppId = fbAppId;
    }

    public String getOgSiteName() {
        return ogSiteName;
    }

    public void setOgSiteName(String ogSiteName) {
        this.ogSiteName = ogSiteName;
    }

    public String getTwitterSite() {
        return twitterSite;
    }

    public void setTwitterSite(String twitterSite) {
        this.twitterSite = twitterSite;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOgTitle() {
        return ogTitle;
    }

    public void setOgTitle(String ogTitle) {
        this.ogTitle = ogTitle;
    }

    public String getOgImage() {
        return ogImage;
    }

    public void setOgImage(String ogImage) {
        this.ogImage = ogImage;
    }

    public String getOgUpdatedTime() {
        return ogUpdatedTime;
    }

    public void setOgUpdatedTime(String ogUpdatedTime) {
        this.ogUpdatedTime = ogUpdatedTime;
    }

    public String getOgUrl() {
        return ogUrl;
    }

    public void setOgUrl(String ogUrl) {
        this.ogUrl = ogUrl;
    }

    public String getOgDescription() {
        return ogDescription;
    }

    public void setOgDescription(String ogDescription) {
        this.ogDescription = ogDescription;
    }

    public String getOgType() {
        return ogType;
    }

    public void setOgType(String ogType) {
        this.ogType = ogType;
    }

    public String getTwitterCard() {
        return twitterCard;
    }

    public void setTwitterCard(String twitterCard) {
        this.twitterCard = twitterCard;
    }

    public String getTwitterTitle() {
        return twitterTitle;
    }

    public void setTwitterTitle(String twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    public String getTwitterDescription() {
        return twitterDescription;
    }

    public void setTwitterDescription(String twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    public String getTwitterImage() {
        return twitterImage;
    }

    public void setTwitterImage(String twitterImage) {
        this.twitterImage = twitterImage;
    }

    public String getTwitterCreator() {
        return twitterCreator;
    }

    public void setTwitterCreator(String twitterCreator) {
        this.twitterCreator = twitterCreator;
    }

    public String getArticlePublisher() {
        return articlePublisher;
    }

    public void setArticlePublisher(String articlePublisher) {
        this.articlePublisher = articlePublisher;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleSection() {
        return articleSection;
    }

    public void setArticleSection(String articleSection) {
        this.articleSection = articleSection;
    }

    public String getArticleSectionUrl() {
        return articleSectionUrl;
    }

    public void setArticleSectionUrl(String articleSectionUrl) {
        this.articleSectionUrl = articleSectionUrl;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticlePublished() {
        return articlePublished;
    }

    public void setArticlePublished(String articlePublished) {
        this.articlePublished = articlePublished;
    }

    public String getArticleModified() {
        return articleModified;
    }

    public void setArticleModified(String articleModified) {
        this.articleModified = articleModified;
    }

    public String getNewsKeywords() {
        return newsKeywords;
    }

    public void setNewsKeywords(String newsKeywords) {
        this.newsKeywords = newsKeywords;
    }

    public String getPinterestUrl() {
        return pinterestUrl;
    }

    public void setPinterestUrl(String pinterestUrl) {
        this.pinterestUrl = pinterestUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getPinterestDescription() {
        return pinterestDescription;
    }

    public void setPinterestDescription(String pinterestDescription) {
        this.pinterestDescription = pinterestDescription;
    }

    public String getPinterestMedia() {
        return pinterestMedia;
    }

    public void setPinterestMedia(String pinterestMedia) {
        this.pinterestMedia = pinterestMedia;
    }

    public String getOgImageWidth() {
        return ogImageWidth;
    }

    public void setOgImageWidth(String ogImageWidth) {
        this.ogImageWidth = ogImageWidth;
    }

    public String getOgImageHeight() {
        return ogImageHeight;
    }

    public void setOgImageHeight(String ogImageHeight) {
        this.ogImageHeight = ogImageHeight;
    }

    public String getFbPages() {
        return fbPages;
    }

    public void setFbPages(String fbPages) {
        this.fbPages = fbPages;
    }

    public String getAppleMobileWebAppTitle() {
        return appleMobileWebAppTitle;
    }

    public void setAppleMobileWebAppTitle(String appleMobileWebAppTitle) {
        this.appleMobileWebAppTitle = appleMobileWebAppTitle;
    }

    public String getArticlePublishedTime() {
        return articlePublishedTime;
    }

    public void setArticlePublishedTime(String articlePublishedTime) {
        this.articlePublishedTime = articlePublishedTime;
    }

    public String getArticleModifiedTime() {
        return articleModifiedTime;
    }

    public void setArticleModifiedTime(String articleModifiedTime) {
        this.articleModifiedTime = articleModifiedTime;
    }

    public String getStyleTools() {
        return styleTools;
    }

    public void setStyleTools(String styleTools) {
        this.styleTools = styleTools;
    }

    public String getMsvalidate01() {
        return msvalidate01;
    }

    public void setMsvalidate01(String msvalidate01) {
        this.msvalidate01 = msvalidate01;
    }

    public String getAhrefsSiteVerification() {
        return ahrefsSiteVerification;
    }

    public void setAhrefsSiteVerification(String ahrefsSiteVerification) {
        this.ahrefsSiteVerification = ahrefsSiteVerification;
    }

    public String getOgImageAlt() {
        return ogImageAlt;
    }

    public void setOgImageAlt(String ogImageAlt) {
        this.ogImageAlt = ogImageAlt;
    }

    public String getTwitterImageAlt() {
        return twitterImageAlt;
    }

    public void setTwitterImageAlt(String twitterImageAlt) {
        this.twitterImageAlt = twitterImageAlt;
    }

    public String getSailthruTitle() {
        return sailthruTitle;
    }

    public void setSailthruTitle(String sailthruTitle) {
        this.sailthruTitle = sailthruTitle;
    }

    public String getSailthruTags() {
        return sailthruTags;
    }

    public void setSailthruTags(String sailthruTags) {
        this.sailthruTags = sailthruTags;
    }

    public String getSailthruDescription() {
        return sailthruDescription;
    }

    public void setSailthruDescription(String sailthruDescription) {
        this.sailthruDescription = sailthruDescription;
    }

    public String getSailthruDate() {
        return sailthruDate;
    }

    public void setSailthruDate(String sailthruDate) {
        this.sailthruDate = sailthruDate;
    }

    public String getSailthruImageFull() {
        return sailthruImageFull;
    }

    public void setSailthruImageFull(String sailthruImageFull) {
        this.sailthruImageFull = sailthruImageFull;
    }

    public String getSailthruImageThumb() {
        return sailthruImageThumb;
    }

    public void setSailthruImageThumb(String sailthruImageThumb) {
        this.sailthruImageThumb = sailthruImageThumb;
    }

    public String getMsapplicationTileimage() {
        return msapplicationTileimage;
    }

    public void setMsapplicationTileimage(String msapplicationTileimage) {
        this.msapplicationTileimage = msapplicationTileimage;
    }

    public String getMsapplicationTilecolor() {
        return msapplicationTilecolor;
    }

    public void setMsapplicationTilecolor(String msapplicationTilecolor) {
        this.msapplicationTilecolor = msapplicationTilecolor;
    }

    public String getOutbrainsection() {
        return outbrainsection;
    }

    public void setOutbrainsection(String outbrainsection) {
        this.outbrainsection = outbrainsection;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMusicCreator() {
        return musicCreator;
    }

    public void setMusicCreator(String musicCreator) {
        this.musicCreator = musicCreator;
    }

    public String getTwitterImageSrc() {
        return twitterImageSrc;
    }

    public void setTwitterImageSrc(String twitterImageSrc) {
        this.twitterImageSrc = twitterImageSrc;
    }

    public String getFormatDetection() {
        return formatDetection;
    }

    public void setFormatDetection(String formatDetection) {
        this.formatDetection = formatDetection;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(viewport);
        dest.writeValue(appleItunesApp);
        dest.writeValue(fbAppId);
        dest.writeValue(ogSiteName);
        dest.writeValue(twitterSite);
        dest.writeValue(author);
        dest.writeValue(ogTitle);
        dest.writeValue(ogImage);
        dest.writeValue(ogUpdatedTime);
        dest.writeValue(ogUrl);
        dest.writeValue(ogDescription);
        dest.writeValue(ogType);
        dest.writeValue(twitterCard);
        dest.writeValue(twitterTitle);
        dest.writeValue(twitterDescription);
        dest.writeValue(twitterImage);
        dest.writeValue(twitterCreator);
        dest.writeValue(articlePublisher);
        dest.writeValue(articleAuthor);
        dest.writeValue(articleSection);
        dest.writeValue(articleSectionUrl);
        dest.writeValue(articleId);
        dest.writeValue(articlePublished);
        dest.writeValue(articleModified);
        dest.writeValue(newsKeywords);
        dest.writeValue(pinterestUrl);
        dest.writeValue(twitterUrl);
        dest.writeValue(pinterestDescription);
        dest.writeValue(pinterestMedia);
        dest.writeValue(ogImageWidth);
        dest.writeValue(ogImageHeight);
        dest.writeValue(fbPages);
        dest.writeValue(appleMobileWebAppTitle);
        dest.writeValue(articlePublishedTime);
        dest.writeValue(articleModifiedTime);
        dest.writeValue(styleTools);
        dest.writeValue(msvalidate01);
        dest.writeValue(ahrefsSiteVerification);
        dest.writeValue(ogImageAlt);
        dest.writeValue(twitterImageAlt);
        dest.writeValue(sailthruTitle);
        dest.writeValue(sailthruTags);
        dest.writeValue(sailthruDescription);
        dest.writeValue(sailthruDate);
        dest.writeValue(sailthruImageFull);
        dest.writeValue(sailthruImageThumb);
        dest.writeValue(msapplicationTileimage);
        dest.writeValue(msapplicationTilecolor);
        dest.writeValue(outbrainsection);
        dest.writeValue(referrer);
        dest.writeValue(title);
        dest.writeValue(musicCreator);
        dest.writeValue(twitterImageSrc);
        dest.writeValue(formatDetection);
    }

    public int describeContents() {
        return  0;
    }

}
