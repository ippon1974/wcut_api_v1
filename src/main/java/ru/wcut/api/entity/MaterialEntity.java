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


}
