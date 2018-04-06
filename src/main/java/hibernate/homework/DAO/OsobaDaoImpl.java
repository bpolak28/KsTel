package hibernate.homework.DAO;

import hibernate.homework.Util.HibernateUtil;
import hibernate.homework.model.Adres;
import hibernate.homework.model.Kontakt;
import hibernate.homework.model.Osoba;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;


public class OsobaDaoImpl implements OsobaDao {

    public Osoba getOsobaById(Integer id) {

        Session session = new HibernateUtil().getSession();

        Criteria criteria = session.createCriteria(Osoba.class);

        criteria.add(Restrictions.eq("id", id));

        List<Osoba> osobaList = criteria.list();

        session.close();

        return osobaList.stream()
                .findFirst()
                .orElseGet(null);

    }


    public Osoba getOsobaByCity(String city) {

        Session session = new HibernateUtil().getSession();

        Criteria criteria = session.createCriteria(Adres.class);

        criteria.add(Restrictions.eq("city",city));

        List<Adres> adress = criteria.list();

        return adress.stream().findFirst().orElseGet(null).getOsoba();

    }

    public List<Kontakt> getKontaktByIdOsoby(Integer id) {

        Session session = new HibernateUtil().getSession();

        Criteria criteria = session.createCriteria(Osoba.class);

        criteria.add(Restrictions.eq("id",id));

        List<Osoba> osobas = criteria.list();

        Osoba osoba = osobas.stream()
                .findFirst()
                .orElseGet(null);

        return osoba.getKontakts();
    }

    public Osoba getOsobaByNrTelefonu(String nrTel) {
        Session session = new HibernateUtil().getSession();

        Criteria criteria = session.createCriteria(Kontakt.class);
        criteria.add(Restrictions.eq("tel",nrTel));
        List<Kontakt> kontakts = criteria.list();
        Kontakt kontakt = kontakts.stream()
                .findFirst()
                .orElseGet(null);

        return kontakt.getOsoba();
    }
}
