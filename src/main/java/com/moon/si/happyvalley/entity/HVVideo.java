package com.moon.si.happyvalley.entity;

import com.moon.si.happyvalley.entity.BaseBean;

import java.util.Date;

/**
 * Created by ZeYu
 * Date: 2017/2/7.
 * Time: 15:55.
 * DESC: say something
 */
public class HVVideo extends BaseBean {

    private int id;
    private String vname;
    private String thunder_url;
    private String pic_path;
    private String type;
    private String country;
    private String director;
    private String actor;
    private String intro;
    private String year;
    private double score;
    private Date update_time;

    public HVVideo() {
    }

    public HVVideo(int id, String vname, String thunder_url, String pic_path, String type, String country, String director, String actor, String intro, String year, double score, Date update_time) {
        this.id = id;
        this.vname = vname;
        this.thunder_url = thunder_url;
        this.pic_path = pic_path;
        this.type = type;
        this.country = country;
        this.director = director;
        this.actor = actor;
        this.intro = intro;
        this.year = year;
        this.score = score;
        this.update_time = update_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getThunder_url() {
        return thunder_url;
    }

    public void setThunder_url(String thunder_url) {
        this.thunder_url = thunder_url;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
