package hibernate.homework.DAO;

import hibernate.homework.model.Kontakt;
import hibernate.homework.model.Osoba;

import java.util.List;

public interface OsobaDao {

    Osoba getOsobaById(Integer id);

    Osoba getOsobaByCity(String City);

    List<Kontakt> getKontaktByIdOsoby(Integer id);

    Osoba getOsobaByNrTelefonu(String nrTel);

}
