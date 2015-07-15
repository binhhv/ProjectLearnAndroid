package com.example.maxmalla009.learnspinnerlistview;

/**
 * Created by maxmalla009 on 7/15/2015.
 */
public class Goods {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Goods(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Goods() {
        super();
    }
    public String toString(){
        return this.id+" - " +this.name;
    }
}
