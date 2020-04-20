package model;

import javax.persistence.*;

@Entity
@Table(name = "NGO")
public class NGO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int NGOId;
    private String name;
    private String password;
    private String imgUrl;
    private String email;
    private String phoneNum;
    private String coverArea;
    private String description;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address addressId;

    public int getNGOId() {
        return NGOId;
    }

    public void setNGOId(int NGOId) {
        this.NGOId = NGOId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCoverArea() {
        return coverArea;
    }

    public void setCoverArea(String coverArea) {
        this.coverArea = coverArea;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }
}
