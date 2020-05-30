package com.seancoyle.weatherapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {


    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("coord")
    @Expose
    private Coord coord;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("timezone")
    @Expose
    private Long timezone;
    @SerializedName("sunrise")
    @Expose
    private Long sunrise;
    @SerializedName("sunset")
    @Expose
    private Long sunset;

    /**
     * No args constructor for use in serialization
     *
     */
    public City() {
    }

    /**
     *
     * @param country
     * @param coord
     * @param sunrise
     * @param timezone
     * @param sunset
     * @param name
     * @param id
     */
    public City(Long id, String name, Coord coord, String country, Long timezone, Long sunrise, Long sunset) {
        super();
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
        this.timezone = timezone;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getTimezone() {
        return timezone;
    }

    public void setTimezone(Long timezone) {
        this.timezone = timezone;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coord=" + coord +
                ", country='" + country + '\'' +
                ", timezone=" + timezone +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }
}
