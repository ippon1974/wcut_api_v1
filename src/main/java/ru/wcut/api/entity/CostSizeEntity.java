package ru.wcut.api.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "costsize")
public class CostSizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int material_id;

    @Column(length = 5)
    private String size;

    private BigDecimal cost;
    private int is_published;


//    @ManyToOne
//    @JoinColumn(name = "mateiral_id")
//    private MaterialEntity mateiral;

    public CostSizeEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getIs_published() {
        return is_published;
    }

    public void setIs_published(int is_published) {
        this.is_published = is_published;
    }
}
