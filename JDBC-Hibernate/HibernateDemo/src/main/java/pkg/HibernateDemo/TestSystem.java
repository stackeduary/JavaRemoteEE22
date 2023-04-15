package pkg.HibernateDemo;

import jakarta.persistence.*;

import java.util.List;

public class TestSystem {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateDemo");

    public static void main(String[] args) {
        deleteCustomer(1);
        addCustomer(1, "Ricky", "Rubio");
        getAllCustomers();
        changeFName(1, "Marco");
        getAllCustomers();
        addCustomer(2, "Rauno", "Ofili");
        getAllCustomers();
        changeFName(2, "Sylvester");
        getCustomer(2);
        getAllCustomers();
        emf.close();
    }

    public static void addCustomer(int id, String fname, String lname) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = null;

        try {
            et = em.getTransaction();
            et.begin();

            Customer cust = new Customer();
            cust.setId(id);
            cust.setFname(fname);
            cust.setLname(lname);

            em.persist(cust);
            et.commit();
        } catch (Exception e) {
            if (et != null) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void getCustomer(int id) {
        EntityManager em = emf.createEntityManager();
        String strQuery = "select c from Customer c where c.id is not null"; // HQL = Hibernate Query Language

        TypedQuery<Customer> tq = em.createQuery(strQuery, Customer.class);
        List<Customer> customerList;

        try {
            customerList = tq.getResultList();
            customerList.forEach(cstmr -> System.out.println(cstmr.getFname() + " " + cstmr.getLname()));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void getAllCustomers() {
        EntityManager em = emf.createEntityManager();
        String strQuery = "select c from Customer c where c.id is not null";

        TypedQuery<Customer> tq = em.createQuery(strQuery, Customer.class);
        List<Customer> customers;

        try {
            customers = tq.getResultList();
            customers.forEach(cstmr -> System.out.println(cstmr.getFname() + " " + cstmr.getLname()));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void changeFName(int id, String fname) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = null;

        Customer customer = null;

        try {
            et = em.getTransaction();
            et.begin();

            customer = em.find(Customer.class, id);
            customer.setFname(fname);

            em.persist(customer);
            et.commit();
        } catch (Exception e) {
            if (et != null) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void deleteCustomer(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = null;
        Customer customer = null;

        try {
            et = em.getTransaction();
            et.begin();
            customer = em.find(Customer.class, id);
            em.remove(customer);
            et.commit();
        } catch (Exception e) {
            if (et != null) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }

    }
}
