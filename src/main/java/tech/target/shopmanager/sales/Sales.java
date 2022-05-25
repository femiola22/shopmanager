package tech.target.shopmanager.sales;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, name = "id")
    private  Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "date_time")
    private String dateTime;

    public Sales(Long id, Long userId, Long productId, int quantity, double price, String dateTime) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.dateTime = dateTime;
    }

    public Sales() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, productId, quantity, price, dateTime);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sales sales = (Sales) obj;
        return Objects.equals(id, sales.id) &&
                Objects.equals(userId, sales.userId) &&
                Objects.equals(productId, sales.productId) &&
                Objects.equals(quantity, sales.quantity)&&
                Objects.equals(price, sales.price)&&
                Objects.equals(dateTime, sales.dateTime);
    }
}
