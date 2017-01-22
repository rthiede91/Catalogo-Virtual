package br.thiede.roberto.catalogovirtual100.models;

/**
 * Created by roberto thiede on 18/01/17.
 */

public class business
{
    private int id;
    private String date;
    private String name;
    private String description;
    private String images;
    private String keywords;
    private String category;
    private String ref;

    public business(){};

    public business(int id, String date, String name, String description, String images,
                    String keywords, String category, String ref)
    {
        this.id = id;
        this.date = date;
        this.name = name;
        this.description = description;
        this.images = images;
        this.keywords = keywords;
        this.category = category;
        this.ref = ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String ategory) {
        this.category = ategory;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String toString()
    {
        return "id=" + id + " date=" + date +" name=" + name + " price=";
    }

}
