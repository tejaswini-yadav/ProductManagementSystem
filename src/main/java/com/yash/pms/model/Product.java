package com.yash.pms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    /**
	 * Default serial version ID
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Float price;

    @Column(name = "ins_date", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date insdate;

    @Column(name = "lupd_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lupddate;

    @JsonIgnoreProperties(value = {"product"})
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)   
    private Category category;

    /*@ManyToOne
    @JsonIgnore
    private Optional<User> user;

    public Optional<User> getUser() {
        return user;
    }

    public void setUser(Optional<User> user2) {
        this.user = user2;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getInsDate() {
        return insdate;
    }

    public Date getLupdDate() {
        return lupddate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @PrePersist
    public void onPrePersist() {
        this.insdate = new Date();
        this.lupddate = new Date();
    }

    @PreUpdate
    public void onPreUpdate() {
        this.lupddate = new Date();
    }
}
