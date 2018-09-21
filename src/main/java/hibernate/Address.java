package hibernate;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Address {

    @Id
    private int address_id;
    private int city_id;

    @OneToMany(mappedBy = "address")
    private Set<Store> stores;

    @ManyToOne
    @JoinColumn(name = "city_id", insertable = false, updatable = false)
    private City city;

    @OneToMany(mappedBy = "address")
    private Set<Staff> staff;

    public Address(int address_id, int city_id) {
        this.address_id = address_id;
        this.city_id = city_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public Set<Store> getStores() {
        return stores;
    }

    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<Staff> getStaff() {
        return staff;
    }

    public void setStaff(Set<Staff> staff) {
        this.staff = staff;
    }
}
