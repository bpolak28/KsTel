package hibernate.homework.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "osoba")
public class Osoba {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToOne(mappedBy = "osoba",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Adres adres;

    @OneToMany(mappedBy = "osoba", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Kontakt> kontakts;

    public Osoba() {
    }

    public Osoba(String name, String surname, Adres adres, List<Kontakt> kontakts) {
        this.name = name;
        this.surname = surname;
        this.adres = adres;
        this.kontakts = kontakts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public List<Kontakt> getKontakts() {
        return kontakts;
    }

    public void setKontakts(List<Kontakt> kontakts) {
        this.kontakts = kontakts;
    }
}
