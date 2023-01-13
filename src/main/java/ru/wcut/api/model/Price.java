package ru.wcut.api.model;

import ru.wcut.api.entity.PriceEntity;
import ru.wcut.api.entity.WorkEntity;

import java.math.BigDecimal;

public class Price {
    private long id;
    private int material_type_id;
    private String material_name_ru;
    private String material_name_en;
    private String description_body;
    private String s_5;
    private BigDecimal s_5_cost;
    private String s_10;
    private BigDecimal s_10_cost;

    public Price() {
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

    public String getMaterial_name_ru() {
        return material_name_ru;
    }

    public void setMaterial_name_ru(String material_name_ru) {
        this.material_name_ru = material_name_ru;
    }

    public String getMaterial_name_en() {
        return material_name_en;
    }

    public void setMaterial_name_en(String material_name_en) {
        this.material_name_en = material_name_en;
    }

    public String getDescription_body() {
        return description_body;
    }

    public void setDescription_body(String description_body) {
        this.description_body = description_body;
    }

    public String getS_5() {
        return s_5;
    }

    public void setS_5(String s_5) {
        this.s_5 = s_5;
    }

    public BigDecimal getS_5_cost() {
        return s_5_cost;
    }

    public void setS_5_cost(BigDecimal s_5_cost) {
        this.s_5_cost = s_5_cost;
    }

    public String getS_10() {
        return s_10;
    }

    public void setS_10(String s_10) {
        this.s_10 = s_10;
    }

    public BigDecimal getS_10_cost() {
        return s_10_cost;
    }

    public void setS_10_cost(BigDecimal s_10_cost) {
        this.s_10_cost = s_10_cost;
    }

    public static Price toModel(PriceEntity priceEntity) {
        Price model  = new Price();
        model.setId(priceEntity.getId());
        model.setMaterial_type_id(priceEntity.getMaterial_type_id());
        model.setMaterial_name_ru(priceEntity.getMaterial_name_ru());
        model.setMaterial_name_en(priceEntity.getMaterial_name_en());
        model.setDescription_body(priceEntity.getDescription_body());
        model.setS_5(priceEntity.getS_5());
        model.setS_5_cost(priceEntity.getS_5_cost());
        model.setS_10(priceEntity.getS_10());
        model.setS_10_cost(priceEntity.getS_10_cost());
        return model;
    }
}
