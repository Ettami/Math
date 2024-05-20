package com.example.math;

public class Olymp {
    private String name;
    private String level;
    private String datebegin;
    private String dateend;
    private String regotb;
    private String regsak;

    Olymp(String name,String level, String datebegin,String dateend,String regotb,String regsak){
        this.name = name;
        this.level = level;
        this.datebegin = datebegin;
        this.regotb = regotb;
        this.dateend = dateend;
        this.regsak = regsak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public String getDatebegin() {
        return datebegin;
    }

    public String getDateend() {
        return dateend;
    }

    public String getRegotb() {
        return regotb;
    }

    public String getRegsak() {
        return regsak;
    }
}
