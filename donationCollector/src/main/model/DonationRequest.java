package model;

import javax.persistence.*;

@Entity
@Table(name = "donationRequest")
public class DonationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int requestId;
    private String email;
    private String notes;
    private String status;
    private String date;
    private String NGOId;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address addressId;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNGOId() {
        return NGOId;
    }

    public void setNGOId(String NGOId) {
        this.NGOId = NGOId;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }
}
