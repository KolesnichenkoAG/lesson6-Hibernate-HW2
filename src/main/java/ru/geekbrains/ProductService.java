package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.client.ClientDao;
import ru.geekbrains.product.Product;
import ru.geekbrains.product.ProductDao;

@Component
public class ProductService {

    @Autowired
    private ProductDao productDao;
    private ClientDao clientDao;

    public void ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Product findByIdListClient(Long id) {
        return productDao.findByIdListClient(id);
    }

    /*public  findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            User user = session.get(User.class, id);
            session.getTransaction().commit();
            return user;
        }
    }*/

}
