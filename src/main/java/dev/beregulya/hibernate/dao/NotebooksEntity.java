package dev.beregulya.hibernate.dao;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "notebooks", schema = "database")
public class NotebooksEntity {

    private int id;
    private int serial;
    private String vendor;
    private String model;
    private String manufactureDate;
    private int price;

    public NotebooksEntity() {
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "serial", nullable = false)
    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Basic
    @Column(name = "vendor", nullable = false, length = 45)
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Basic
    @Column(name = "model", nullable = false, length = 45)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "manufacture_date", nullable = false, length = 45)
    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotebooksEntity that = (NotebooksEntity) o;

        if (id != that.id) return false;
        if (serial != that.serial) return false;
        if (price != that.price) return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (manufactureDate != null ? !manufactureDate.equals(that.manufactureDate) : that.manufactureDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + serial;
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (manufactureDate != null ? manufactureDate.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

}
