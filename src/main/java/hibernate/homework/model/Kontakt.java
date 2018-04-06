package hibernate.homework.model;

import javax.persistence.*;

@Entity
@Table(name = "kontakt")
public class Kontakt {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "tel")
    private String tel;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_osoba")
    private Osoba osoba;

    public Kontakt(){

    }

    public Kontakt(String tel, String email, Osoba osoba) {
        this.tel = tel;
        this.email = email;
        this.osoba = osoba;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
}
