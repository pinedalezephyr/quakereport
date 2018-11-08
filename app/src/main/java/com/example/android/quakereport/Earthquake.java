package com.example.android.quakereport;

public class Earthquake {


    /**
     * location of earthquake
     */
    private String mLocation;

    /**
     * time of Earthquake in usable format
     **/
    private long mTimeInMilliseconds;
    //get double value of quake
    private double mMagnitude;
    /**
     * Website URL of the earthquake
     */
    private String mUrl;


    /*
     * Constructs a new {@link Earthquake} object.
     * @param magnitude is the magnitude or size of quake
     * @param location is the city of guake
     * @param TimeInMilliseconds  is the time of guake
     ** @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude,String location,long timeInMilliseconds,String url) {


        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = new Long(timeInMilliseconds);
        mUrl = url;
    }
    /**
     * Returns the website URL to find more information about the earthquake.
     */

    /**
     * returns the mag of quake
     */
    public double getmMagnitude() {
        return mMagnitude;
    }

    /**
     * returns loc of quake
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * returns date of quake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;


    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }
}
