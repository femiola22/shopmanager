package tech.target.shopmanager.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cart")
public class Cart  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, name  = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "date_time_created")
    private String dateTimeCreated;

    @Column(name = "checked_out")
    private Boolean checkedOut;

    public Cart(Long id, Long userId, String dateTimeCreated, Boolean checkedOut) {
        this.id = id;
        this.userId = userId;
        this.dateTimeCreated = dateTimeCreated;
        this.checkedOut = checkedOut;
    }

    public Cart() {

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

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(String dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public Boolean getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", dateTimeCreated='" + dateTimeCreated + '\'' +
                ", checkedOut=" + checkedOut +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, dateTimeCreated, checkedOut);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cart cart = (Cart) obj;
        return Objects.equals(id, cart.id) &&
                Objects.equals(userId, cart.userId) &&
                Objects.equals(dateTimeCreated, cart.dateTimeCreated) &&
                Objects.equals(checkedOut, cart.checkedOut);
    }
}
