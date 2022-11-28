package daojpa;

import javax.persistence.*;
import java.util.List;
import java.util.Properties;

public abstract class DAO<T> implements DAOInterface<T> {

    protected static EntityManagerFactory managerFactory;
    protected static EntityManager manager;
    protected Class<T> entidade;

    public DAO(Class<T> entidade) {
        this.entidade = entidade;
    }

    public static void open() {
        if (manager == null) {
            String nomeUnidadePersistencia = "";
            String provedor = "";
            String sgbd = "";
            String banco = "";
            String ip = "";
            Properties dados = new Properties();

            try {
                dados.load(DAO.class.getResourceAsStream("/dados.properties"));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            provedor = dados.getProperty("provedor");
            sgbd = dados.getProperty("sgbd");
            ip = dados.getProperty("ip");
            banco = dados.getProperty("banco");
            nomeUnidadePersistencia = provedor + "-" + sgbd;

            //alterar URL da conexão
            Properties propriedadesXML = new Properties();

            propriedadesXML.setProperty("javax.persistence.jdbc.url", "jdbc:postgresql://" + ip + ":5432/" + banco);

            managerFactory = Persistence.createEntityManagerFactory(nomeUnidadePersistencia, propriedadesXML);
            manager = managerFactory.createEntityManager();

        }
    }

    public static void close() {
        if (manager != null && manager.isOpen()) {
            manager.close();
            managerFactory.close();
            manager = null;
        }
    }


    public void begin() {
        if (!manager.getTransaction().isActive()) {
            manager.getTransaction().begin();
        }
    }

    public void commit() {
        if (manager.getTransaction().isActive()) {
            manager.getTransaction().commit();
        }
    }

    public void rollback() {
        if (manager.getTransaction().isActive()) {
            manager.getTransaction().rollback();
        }
    }


    public void create(T obj) {
        manager.persist(obj);
    }

    public T read(Object id) {
        return manager.find(this.entidade, id);
    }

    public T update(T obj) {
        manager.merge(obj);
        return obj;
    }

    public void delete(T obj) {
        manager.remove(obj);
    }

    @SuppressWarnings("unchecked")
    //recuperar todos objetos de um tipo
    public List<T> readAll() {
        TypedQuery<T> query = manager.createQuery("select x from " + this.entidade.getSimpleName() + " x", this.entidade);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    //deletar todos objetos de um tipo
    public void deleteAll() {
        Query query = manager.createQuery("delete from " + this.entidade.getSimpleName());
        query.executeUpdate();
    }
}
