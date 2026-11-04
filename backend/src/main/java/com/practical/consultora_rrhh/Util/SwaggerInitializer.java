package com.practical.consultora_rrhh.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class SwaggerInitializer {

    private static final Logger log =
            LoggerFactory.getLogger(SwaggerInitializer.class);

    @Value("${server.port:8080}")
    private String port;

    @EventListener(ApplicationReadyEvent.class)
    public void mostrarSwagger() {
        log.info("Swagger UI disponible en: http://localhost:{}/swagger-ui/index.html", port);
    }
}