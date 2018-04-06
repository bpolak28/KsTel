package hibernate.homework;

import hibernate.homework.DAO.OsobaDao;
import hibernate.homework.DAO.OsobaDaoImpl;
import hibernate.homework.Util.HibernateUtil;
import hibernate.homework.model.Kontakt;
import hibernate.homework.model.Osoba;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class OsobaDaoImplTest {

    @Test
    public void testGetOsobaById(){

        OsobaDao osobaDao = new OsobaDaoImpl();

        Osoba osobaById = osobaDao.getOsobaById(1);

        Assert.assertEquals("Marek",osobaById.getName());
    }

    @Test
    public void testGetOsobaByCity(){
        OsobaDao osobaDao = new OsobaDaoImpl();

        Osoba osoba = osobaDao.getOsobaByCity("Piaseczno");

        Assertions.assertEquals("Robcio",osoba.getName());
    }

    @Test
    public void testGetKontaktByIdOsoby(){
        OsobaDao osobaDao = new OsobaDaoImpl();
        List<Kontakt> kontakts = osobaDao.getKontaktByIdOsoby(1);

        Assertions.assertEquals("w@o2.pl",kontakts.get(0).getEmail());
        Assertions.assertEquals("555444333",kontakts.get(1).getTel());
    }

    @Test
    public void testGetOsobaByNrTel(){
        OsobaDao osobaDao = new OsobaDaoImpl();
        Osoba osoba = osobaDao.getOsobaByNrTelefonu("123456789");

        Assertions.assertEquals("Rogus",osoba.getSurname());
    }
}
