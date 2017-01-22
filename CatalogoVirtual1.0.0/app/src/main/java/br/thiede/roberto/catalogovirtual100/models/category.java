package br.thiede.roberto.catalogovirtual100.models;

/**
 * Created by roberto thiede on 18/01/17.
 */

public class category
{
    private int id;
    private String date;
    private String name;
    private String description;
    private String images;
    private String business_id;
    private String category;
    private String ref;

    public category(){};

    public category(int id, String date, String name, String description, String images,
                    String business_id, String category, String ref)
    {
        this.id = id;
        this.date = date;
        this.name = name;
        this.description = description;
        this.images = images;
        this.business_id = business_id;
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

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String toString()
    {
        return "id=" + id + " date=" + date +" name=" + name ;
    }

}
