package com.example.listviewlab;

public class Drink {
    private String name;
    private String description;
    private int imgResourceId;

    public static final Drink[] drinks = {
            new Drink("Expresso","Taza de expresso",R.drawable.expresso),
            new Drink("Capuccino","Taza de capuccino", R.drawable.capuccino),
            new Drink("Basic","Una taza de cafe normal",R.drawable.coffee)
    };

    public Drink(String name, String description, int id) {
        this.name = name;
        this.description = description;
        imgResourceId = id;
    }

    public int getImgResourceId() {
        return imgResourceId;
    }

    public void setImgResourceId(int imgResourceId) {
        this.imgResourceId = imgResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }
}
