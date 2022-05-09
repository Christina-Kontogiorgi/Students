package com.example.students.models;

public class Student {
    private String mName;
    private String mSurname;
    private int mAm;
    private int mYears;
    private double mMo;
    public String All;
    public String getTheBigString(){
          All=mName+", "+mSurname+", "+mAm+", "+mYears+", "+mMo;
        return All;


    }
    public  void  setName(String N){
        mName=N;
    }
    public String getName(){
        return mName;
    }
    public void setSurname(String S){
        mSurname=S;
    }
    public String getSurname(){
        return mSurname;
    }
    public void setAm(int A){
        mAm=A;
    }
    public int getAm(){
        return mAm;
    }
    public void setYears(int Y){
        mYears=Y;
    }
    public int getYears(){
        return mYears;
    }
    public void setMo(double M){
        mMo=M;
    }
    public double getMo(){
        return mMo;
    }

}
