package ru.wcut.api.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "mateiral")
public class MaterialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String material;
    private String material_en;

    @Column(unique=true)
    private String translit;

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
}
