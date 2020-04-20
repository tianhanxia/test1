package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "drop_off")
public class DropOff implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Drop_off_ID;
    private String email;
    private String phone_num;
    private String description;
    private String start_time;
    private String end_time;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "NGOId")
    private NGO NGOId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "addressId")
    private Address addressId;

    public int getDrop_off_ID() {
        return Drop_off_ID;
    }

    public void setDrop_off_ID(int drop_off_ID) {
        Drop_off_ID = drop_off_ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public NGO getNGOId() {
        return NGOId;
    }

    public void setNGOId(NGO NGOId) {
        this.NGOId = NGOId;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }
}
