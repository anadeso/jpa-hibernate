package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String[] args) {

        /*Pessoa pessoa1 = new Pessoa(null, "Ana", "silva@gmail.com");
        Pessoa pessoa2 = new Pessoa(null, "Rita", "rita@gmail.com");
        Pessoa pessoa3 = new Pessoa(null, "Carlos", "carlos@gmail.com");*/

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em =  emf.createEntityManager();


        Pessoa p =  em.find(Pessoa.class, 2);

        /*em.getTransaction().begin();
        em.persist(pessoa1);
        em.persist(pessoa2);
        em.persist(pessoa3);
        em.getTransaction().commit();*/

        System.out.println(p);
        System.out.println("Pronto!");
        em.close();
        emf.close();

    }
}
