package hibernate;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Staff {

    @Id
    private int staff_id;
    private int address_id;
    private int store_id;

    @ManyToOne
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private Address address;

    @OneToMany(mappedBy = "staff")
    private Set<Payment> payments;

    @OneToMany(mappedBy = "staff")
    private Set<Rental> rentals;

    @ManyToMany(mappedBy = "staff")
    private Set<Store> store;


    public Staff(int staff_id, int address_id, int store_id) {
        this.staff_id = staff_id;
        this.address_id = address_id;
        this.store_id = store_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Set<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(Set<Rental> rentals) {
        this.rentals = rentals;
    }
}
