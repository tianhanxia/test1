package model;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String type;
    private int quantity;
    private String description;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "requestId")
    private DonationRequest requestId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DonationRequest getRequestId() {
        return requestId;
    }

    public void setRequestId(DonationRequest requestId) {
        this.requestId = requestId;
    }
}
