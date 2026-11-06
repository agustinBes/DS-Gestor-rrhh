package com.practical.consultora_rrhh.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public abstract class genericDaoImpl<T> {

    @PersistenceContext
    private EntityManager em;

    private final Class<T> entidad;

    public genericDaoImpl(Class<T> entidad) {
        this.entidad = entidad;
    }

    public boolean existePorNombreInsensible(String nombre) {
        return em.createQuery(
                        "SELECT COUNT(e) FROM " + entidad.getSimpleName() +
                                " e WHERE LOWER(e.nombre) = LOWER(:nombre)",
                        Long.class
                )
                .setParameter("nombre", nombre)
                .getSingleResult() > 0;
    }
    public boolean existeCodigoInsensible(String codigo) {
        return em.createQuery(
                "SELECT COUNT(e) FROM"+entidad.getSimpleName()+
                        "e WHERE LOWER(e.codigo) =Lower(:codigo)",
                Long.class
        )
                .setParameter("codigo", codigo)
                .getSingleResult() > 0;
    }
}