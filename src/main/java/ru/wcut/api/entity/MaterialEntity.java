package ru.wcut.api.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mateiral")
public class MaterialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int material_type_id;

    @Column(length = 35)
    private String material;

    @Column(length = 35)
    private String material_en;

    @Column(unique=true)
    private String translit;

    @Column(columnDefinition = "TEXT")
    private String description_body;

    @Column(columnDefinition = "TEXT")
    private String description_page;

    @Column(length = 155)
    private String keywords_page;
    private Date dt;
    private Date dt_published;
    private Boolean is_published;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mateiral")
//    private List<CostSizeEntity> costSizeEntities;

    public MaterialEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaterial_type_id() {
        return material_type_id;
    }

    public void setMaterial_type_id(int material_type_id) {
        this.material_type_id = material_type_id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial_en() {
        return material_en;
    }

    public void setMaterial_en(String material_en) {
        this.material_en = material_en;
    }

    public String getTranslit() {
        return translit;
    }

    public void setTranslit(String translit) {
        this.translit = translit;
    }

    public String getDescription_body() {
        return description_body;
    }

    public void setDescription_body(String description_body) {
        this.description_body = description_body;
    }

    public String getDescription_page() {
        return description_page;
    }

    public void setDescription_page(String description_page) {
        this.description_page = description_page;
    }

    public String getKeywords_page() {
        return keywords_page;
    }

    public void setKeywords_page(String keywords_page) {
        this.keywords_page = keywords_page;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Date getDt_published() {
        return dt_published;
    }

    public void setDt_published(Date dt_published) {
        this.dt_published = dt_published;
    }

    public Boolean getIs_published() {
        return is_published;
    }

    public void setIs_published(Boolean is_published) {
        this.is_published = is_published;
    }
}
