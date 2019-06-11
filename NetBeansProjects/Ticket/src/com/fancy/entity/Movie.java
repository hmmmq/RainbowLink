package com.fancy.entity;



import java.util.Date;

public class Movie {

    private int mId;
    private String mName;//电影名
    private String mActor;//演员
    private String mlanguage;//语言
    private String mlocality;//地区
    private String mPicaddress;//海报地址
    private String mDetail;//详情
    private int mDuration;// 时长
    private String mType;// 类型
    private double mGrade;//评分
    private Date mTime;//上映时间
    private String mshow;//上映状态
    private String mheng;//横板海报

    public Movie() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Movie(int mId) {
        super();
        this.mId = mId;
        
    }


    public Movie(int mId, String mName, String mActor, String mlanguage, String mlocality, String mPicaddress, String mDetail, int mDuration, String mType, double mGrade, Date mTime, String mshow, String mheng) {
        super();
        this.mId = mId;
        this.mName = mName;
        this.mActor = mActor;
        this.mlanguage = mlanguage;
        this.mlocality = mlocality;
        this.mPicaddress = mPicaddress;
        this.mDetail = mDetail;
        this.mDuration = mDuration;
        this.mType = mType;
        this.mGrade = mGrade;
        this.mTime = mTime;
        this.mshow = mshow;
        this.mheng = mheng;
    }

    public Movie(String mName, String mActor, String mlanguage, String mlocality, String mPicaddress, String mDetail, int mDuration, String mType, Date mTime, String mshow, String mheng) {
        super();
        this.mName = mName;
        this.mActor = mActor;
        this.mlanguage = mlanguage;
        this.mlocality = mlocality;
        this.mPicaddress = mPicaddress;
        this.mDetail = mDetail;
        this.mDuration = mDuration;
        this.mType = mType;
        this.mTime = mTime;
        this.mshow = mshow;
        this.mheng = mheng;
    }
    
       public Movie(String mName, String mActor, String mlanguage, String mlocality, String mPicaddress, String mDetail, int mDuration, String mType, double mGrade, Date mTime, String mshow, String mheng) {
        super();
        this.mName = mName;
        this.mActor = mActor;
        this.mlanguage = mlanguage;
        this.mlocality = mlocality;
        this.mPicaddress = mPicaddress;
        this.mDetail = mDetail;
        this.mDuration = mDuration;
        this.mType = mType;
        this.mGrade = mGrade;
        this.mTime = mTime;
        this.mshow = mshow;
        this.mheng = mheng;
    }

    
    public Movie(String mName,String mActor,String mlanguage, String mlocality, String mPicaddress, String mDetail, String mType, double mGrade, String mshow, String mheng) {
        super();
        this.mName = mName;
        this.mActor = mActor;
        this.mlanguage = mlanguage;
        this.mlocality = mlocality;
        this.mPicaddress = mPicaddress;
        this.mDetail = mDetail;
        this.mType = mType;
        this.mGrade = mGrade;
        this.mshow = mshow;
        this.mheng = mheng;
    }
    
    public Movie(String mType) {
        super();
        this.mType = mType;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmActor() {
        return mActor;
    }

    public void setmActor(String mActor) {
        this.mActor = mActor;
    }

    public String getMlanguage() {
        return mlanguage;
    }

    public void setMlanguage(String mlanguage) {
        this.mlanguage = mlanguage;
    }

    public String getMlocality() {
        return mlocality;
    }

    public void setMlocality(String mlocality) {
        this.mlocality = mlocality;
    }

    public String getmPicaddress() {
        return mPicaddress;
    }

    public void setmPicaddress(String mPicaddress) {
        this.mPicaddress = mPicaddress;
    }

    public String getmDetail() {
        return mDetail;
    }

    public void setmDetail(String mDetail) {
        this.mDetail = mDetail;
    }

    public int getmDuration() {
        return mDuration;
    }

    public void setmDuration(int mDuration) {
        this.mDuration = mDuration;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public double getmGrade() {
        return mGrade;
    }

    public void setmGrade(double mGrade) {
        this.mGrade = mGrade;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public String getmshow() {
        return mshow;
    }

    public void setmshow(String mshow) {
        this.mshow = mshow;
    }

    public String getmheng() {
        return mheng;
    }

    public void setmheng(String mheng) {
        this.mheng = mheng;
    }

    @Override
    public String toString() {
        return "Movie [mId=" + mId + ", mName=" + mName + ",mActor=" + mActor + ", mlanguage=" + mlanguage + ", mlocality=" + mlocality
                + ", mPicaddress=" + mPicaddress + ", mDetail=" + mDetail + ", mDuration=" + mDuration + ", mType="
                + mType + ",mTime=" + mTime + ",mshow" + mshow + ",mheng" + mheng + "]";
    }
}
