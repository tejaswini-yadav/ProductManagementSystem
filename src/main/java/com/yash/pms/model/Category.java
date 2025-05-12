package com.yash.pms.model;

import javax.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "category")
public class Category implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "category_name")
    private String categoryName;

    /*@Column(nullable = false)
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> productSet;
*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

   /* public Set<Product> getProduct() {
        return productSet;
    }

    public void setProduct(Product product) {
        if (productSet.size() == 0) {
            productSet = new HashSet<>();
        }
        productSet.add(product);
    }*/
}
