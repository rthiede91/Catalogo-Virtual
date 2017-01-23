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
    private String category_id;
    private String business_id;
    private String keywords;
    private String ref;

    public product(){};

    public product(int id, String date, String name, String price, String description, String images,
                   String category_id, String business_id, String keywords, String ref)
    {
        this.id = id;
        this.date = date;
        this.name = name;
        this.price = price;
        this.description = description;
        this.images = images;
        this.category_id = category_id;
        this.business_id = business_id;
        this.keywords = keywords;
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

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.ref = keywords;
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
