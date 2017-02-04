package dev.beregulya.hibernate.main;

import dev.beregulya.hibernate.dao.NotebooksEntity;
import dev.beregulya.hibernate.dao.OwnersEntity;
import dev.beregulya.hibernate.utils.HibernateSessionFactory;
import org.hibernate.Session;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Hibernate Tutorial");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        NotebooksEntity notebooksEntity = new NotebooksEntity();
        notebooksEntity.setSerial(123456789);
        notebooksEntity.setVendor("Lenovo");
        notebooksEntity.setModel("IdeaPad");
        notebooksEntity.setManufactureDate("20/10/2015");
        notebooksEntity.setPrice(399);

        session.save(notebooksEntity);
        session.getTransaction().commit();

        OwnersEntity ownersEntity = new OwnersEntity();
        ownersEntity.setName("Steve");
        ownersEntity.setNotebooksEntity(notebooksEntity);

        session.beginTransaction();
        session.save(ownersEntity);
        session.getTransaction().commit();

        session.close();

        HibernateSessionFactory.shutDown();
    }

}
