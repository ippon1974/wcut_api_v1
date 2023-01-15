package ru.wcut.api.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "costsize")
public class CostSizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String size;
    private BigDecimal cost;

    @ManyToOne
    @JoinColumn(name = "mateiral_id")
    private MaterialEntity mateiral;

    public CostSizeEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public MaterialEntity getMateiral() {
        return mateiral;
    }

    public void setMateiral(MaterialEntity mateiral) {
        this.mateiral = mateiral;
    }
}
