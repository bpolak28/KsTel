package hibernate.homework.model;

import javax.persistence.*;

@Entity
@Table(name = "adres")
public class Adres {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "street_number")
    private String streetNumber;

    @OneToOne
    @JoinColumn (name = "id_osoba")
    private Osoba osoba;

    public Adres(){

    }

    public Adres(String city, String street, String streetNumber, Osoba osoba) {
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.osoba = osoba;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
}
