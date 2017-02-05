package dev.beregulya.hibernate.dao;

import javax.persistence.*;

@Entity
@Table(name = "NOTEBOOKS")
public class NotebooksEntity {

    @Id
    @Column(name = "NOTEBOOKS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SERIAL")
    private int serial;

    @Column(name = "VENDOR")
    private String vendor;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "MANUFACTURE_DATE")
    private String manufactureDate;

    @Column(name = "PRICE")
    private int price;

    @OneToOne
    @JoinColumn(name = "OWNERS_ID")
    private OwnersEntity ownersEntity;

    public NotebooksEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public OwnersEntity getOwnersEntity() {
        return ownersEntity;
    }

    public void setOwnersEntity(OwnersEntity ownersEntity) {
        this.ownersEntity = ownersEntity;
    }

}
