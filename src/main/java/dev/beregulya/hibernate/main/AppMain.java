package dev.beregulya.hibernate.main;

import dev.beregulya.hibernate.dao.NotebooksEntity;
import dev.beregulya.hibernate.utils.HibernateSessionFactory;
import org.hibernate.Session;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Hibernate Tutorial");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        //session.beginTransaction();

        /*NotebooksEntity notebooksEntity = new NotebooksEntity();
        notebooksEntity.setSerial(123454321);
        notebooksEntity.setVendor("Apple");
        notebooksEntity.setModel("Macbook");
        notebooksEntity.setManufactureDate("23/12/2016");
        notebooksEntity.setPrice(1499);*/



        //session.save(null);
        //session.getTransaction().commit();
        session.close();
        HibernateSessionFactory.shutDown();
    }

}
