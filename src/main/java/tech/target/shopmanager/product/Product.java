package tech.target.shopmanager.product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, name = "id")
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "section")
    private String section;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "expiry_date")
    private String expiryDate;

    @Column(name = "low_stock_level")
    private int lowStockLevel;

    @Column(name = "product_image_link")
    private String productImageLink;

    @Column(name = "hit_date_time")
    private String hitDateTime;

    @Column(nullable = false, updatable = false, name = "product_code")
    private String productCode;

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", section='" + section + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", expiryDate='" + expiryDate + '\'' +
                ", lowStockLevel=" + lowStockLevel +
                ", productImageLink='" + productImageLink + '\'' +
                ", hitDateTime='" + hitDateTime + '\'' +
                ", productCode='" + productCode + '\'' +
                '}';
    }

    public Product(Long id, String productName, String section, int quantity, double price, String expiryDate, int lowStockLevel, String productImageLink, String hitDateTime, String productCode) {
        this.id = id;
        this.productName = productName;
        this.section = section;
        this.quantity = quantity;
        this.price = price;
        this.expiryDate = expiryDate;
        this.lowStockLevel = lowStockLevel;
        this.productImageLink = productImageLink;
        this.hitDateTime = hitDateTime;
        this.productCode = productCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getLowStockLevel() {
        return lowStockLevel;
    }

    public void setLowStockLevel(int lowStockLevel) {
        this.lowStockLevel = lowStockLevel;
    }

    public String getProductImageLink() {
        return productImageLink;
    }

    public void setProductImageLink(String productImageLink) {
        this.productImageLink = productImageLink;
    }

    public String getHitDateTime() {
        return hitDateTime;
    }

    public void setHitDateTime(String hitDateTime) {
        this.hitDateTime = hitDateTime;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, section, quantity, price, expiryDate, lowStockLevel, productImageLink, hitDateTime, productCode);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Objects.equals(id, product.id) &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(section, product.section) &&
                Objects.equals(quantity, product.quantity) &&
                Objects.equals(price, product.price) &&
                Objects.equals(expiryDate, product.expiryDate) &&
                Objects.equals(lowStockLevel, product.lowStockLevel) &&
                Objects.equals(productImageLink, product.productImageLink) &&
                Objects.equals(hitDateTime, product.hitDateTime) &&
                Objects.equals(productCode, product.productCode);
    }

}
