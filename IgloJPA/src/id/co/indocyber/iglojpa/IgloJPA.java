/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.iglojpa;

import id.co.indocyber.model.Employee;
import id.co.indocyber.model.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class IgloJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("IgloJPAPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Person p = new Person();
        p.setNama("Smith Depok");
        p.setAge(23);
        p.setSalary(245000000.0);
        
        Employee e = new Employee();
        e.setNama("Yana Andika");
        e.setAlamat("Jakarta");
        e.setJabatan("Project Manager");
        e.setNoPhone("089636743133");
        System.out.println(e.toString());
        em.persist(e);
        em.persist(p);//untuk menyimpan ke database
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
    
}
