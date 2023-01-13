package ru.wcut.api.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "price")
public class PriceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column( nullable = true )
    private int material_type_id;
    private String material_name_ru;
    private String material_name_en;

    @Column(columnDefinition = "TEXT")
    private String description_body;

    @Column(length = 4)
    private String s_5;
    private BigDecimal s_5_cost;

    @Column(length = 4)
    private String s_10;
    private BigDecimal s_10_cost;

    @Column(length = 4)
    private String s_15;
    private BigDecimal s_15_cost;

    @Column(length = 4)
    private String s_20;
    private BigDecimal s_20_cost;

    @Column(length = 4)
    private String s_25;
    private BigDecimal s_25_cost;

    @Column(length = 4)
    private String s_30;
    private BigDecimal s_30_cost;

    @Column(length = 4)
    private String s_35;
    private BigDecimal s_35_cost;

    @Column(length = 4)
    private String s_40;
    private BigDecimal s_40_cost;

    @Column(length = 4)
    private String s_45;
    private BigDecimal s_45_cost;

    @Column(length = 4)
    private String s_50;
    private BigDecimal s_50_cost;

    private String description_page;

    @Column(length = 155)
    private String keywords_page;

    private Date dt_published;
    private boolean is_published;

    public PriceEntity() {
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

    public String getS_15() {
        return s_15;
    }

    public void setS_15(String s_15) {
        this.s_15 = s_15;
    }

    public BigDecimal getS_15_cost() {
        return s_15_cost;
    }

    public void setS_15_cost(BigDecimal s_15_cost) {
        this.s_15_cost = s_15_cost;
    }

    public String getS_20() {
        return s_20;
    }

    public void setS_20(String s_20) {
        this.s_20 = s_20;
    }

    public BigDecimal getS_20_cost() {
        return s_20_cost;
    }

    public void setS_20_cost(BigDecimal s_20_cost) {
        this.s_20_cost = s_20_cost;
    }

    public String getS_25() {
        return s_25;
    }

    public void setS_25(String s_25) {
        this.s_25 = s_25;
    }

    public BigDecimal getS_25_cost() {
        return s_25_cost;
    }

    public void setS_25_cost(BigDecimal s_25_cost) {
        this.s_25_cost = s_25_cost;
    }

    public String getS_30() {
        return s_30;
    }

    public void setS_30(String s_30) {
        this.s_30 = s_30;
    }

    public BigDecimal getS_30_cost() {
        return s_30_cost;
    }

    public void setS_30_cost(BigDecimal s_30_cost) {
        this.s_30_cost = s_30_cost;
    }

    public String getS_35() {
        return s_35;
    }

    public void setS_35(String s_35) {
        this.s_35 = s_35;
    }

    public BigDecimal getS_35_cost() {
        return s_35_cost;
    }

    public void setS_35_cost(BigDecimal s_35_cost) {
        this.s_35_cost = s_35_cost;
    }

    public String getS_40() {
        return s_40;
    }

    public void setS_40(String s_40) {
        this.s_40 = s_40;
    }

    public BigDecimal getS_40_cost() {
        return s_40_cost;
    }

    public void setS_40_cost(BigDecimal s_40_cost) {
        this.s_40_cost = s_40_cost;
    }

    public String getS_45() {
        return s_45;
    }

    public void setS_45(String s_45) {
        this.s_45 = s_45;
    }

    public BigDecimal getS_45_cost() {
        return s_45_cost;
    }

    public void setS_45_cost(BigDecimal s_45_cost) {
        this.s_45_cost = s_45_cost;
    }

    public String getS_50() {
        return s_50;
    }

    public void setS_50(String s_50) {
        this.s_50 = s_50;
    }

    public BigDecimal getS_50_cost() {
        return s_50_cost;
    }

    public void setS_50_cost(BigDecimal s_50_cost) {
        this.s_50_cost = s_50_cost;
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

    public Date getDt_published() {
        return dt_published;
    }

    public void setDt_published(Date dt_published) {
        this.dt_published = dt_published;
    }

    public boolean isIs_published() {
        return is_published;
    }

    public void setIs_published(boolean is_published) {
        this.is_published = is_published;
    }
}
