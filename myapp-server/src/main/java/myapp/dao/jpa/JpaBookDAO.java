package myapp.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import myapp.dao.stub.IBookDAO;
import myapp.model.Book;
import myapp.model.BookView;

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

    @Override
    public Book findByTitle(String title) {
        return entityManager.createQuery("select e from Book e where title = :title", Book.class)
                .setParameter("title", title)
                .getSingleResult();
    }

    @Override
    public BookView findByTitleNative(String title) {
        TypedQuery<BookView> typedQuery = entityManager.createNamedQuery("Book.findByTitle", BookView.class);
        typedQuery.setMaxResults(1);
        typedQuery.setParameter("title", title);
        return typedQuery.getResultList()
                         .stream()
                         .findFirst()
                          .orElse(null);
    }

    
    @Override
    public void remove(Book book) {
        entityManager.remove(book);
    }
    
    @Override
    public List<Book> findByBookIdGreaterThan(Integer bookId) {
        TypedQuery<Book> typedQuery = entityManager.createNamedQuery("Book.findByBookIdGreaterThan", Book.class);
        
        typedQuery.setParameter("bookId", bookId)
                     .getResultList();
        return typedQuery.getResultList();
    }
    
    

}
