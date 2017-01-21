package br.thiede.roberto.catalogovirtual100.models;

/**
 * Created by roberto thiede on 18/01/17.
 */

public class product
{
    private int id;
    private String date;
    private String name;
    private String price;
    private String description;
    private String images;
    private String category;
    private String sub_category;
    private String ref;

    public product(){};

    public product(int id, String date, String name, String price, String description, String images,
                   String category, String sub_category, String ref)
    {
        this.id = id;
        this.date = date;
        this.name = name;
        this.price = price;
        this.description = description;
        this.images = images;
        this.category = category;
        this.sub_category = sub_category;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSub_category() {
        return sub_category;
    }

    public void setSub_category(String sub_category) {
        this.sub_category = sub_category;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String toString()
    {
        return "id=" + id + " date=" + date +" name=" + name + " price=" + price;
    }

}
