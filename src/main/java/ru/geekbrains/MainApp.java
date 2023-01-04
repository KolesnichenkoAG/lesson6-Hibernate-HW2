package ru.geekbrains;

import ru.geekbrains.product.ProductDao;

public class MainApp {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.geekbrains");
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDao(sessionFactoryUtils);
            ProductService productService = new ProductService();
            productService.findByIdListClient(2l);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
