package com.example.maxmalla009.learnspinnerlistview;

/**
 * Created by maxmalla009 on 7/15/2015.
 */
public class Product extends Goods {
    private Catalog Dmuc;

    public Catalog getDmuc(){
        return Dmuc;
    }
    public void setDmuc(Catalog dmuc){
        this.Dmuc = dmuc;
    }
    public Product(String id,String name,Catalog dmuc){
        super(id,name);
        this.Dmuc = dmuc;
    }
    public Product(String id,String name){
        super(id,name);
    }
    public Product(){
        super();
    }
}
