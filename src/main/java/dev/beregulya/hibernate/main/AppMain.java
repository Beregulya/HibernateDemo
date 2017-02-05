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
        notebooksEntity.setManufactureDate("13/05/2015");
        notebooksEntity.setPrice(499);

        OwnersEntity ownersEntity = new OwnersEntity();
        ownersEntity.setName("Yung");

        ownersEntity.setNotebooksEntity(notebooksEntity);
        notebooksEntity.setOwnersEntity(ownersEntity);

        session.save(notebooksEntity);
        session.save(ownersEntity);
        session.getTransaction().commit();

        session.close();

        HibernateSessionFactory.shutDown();
    }

}
