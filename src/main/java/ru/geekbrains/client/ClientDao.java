package ru.geekbrains.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import ru.geekbrains.SessionFactoryUtils;

//@Configuration
@Component
public class ClientDao {
    private SessionFactoryUtils sessionFactoryUtils;

    public ClientDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

}
