package myapp.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import myapp.dao.stub.IBookDAO;
import myapp.model.Book;

@Repository
public class JpaBookDAO implements IBookDAO {
    
    private EntityManager entityManager;

    private TransactionTemplate transactionTemplate;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    @Autowired
    public void setTransactionTemplate(TransactionTemplate tt) {
        this.transactionTemplate = tt;
    }
    
    @Override
    public void save(Book book) {
        entityManager.persist(book);
    }

    @Override
    public List<Book> getAll() {
        return entityManager.createQuery("select e from Book e", Book.class)
                .getResultList();
    }
    

}
