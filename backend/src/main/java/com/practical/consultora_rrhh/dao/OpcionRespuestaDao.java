package com.practical.consultora_rrhh.dao;

import com.practical.consultora_rrhh.interfaces.dao.IOpcionRespuestaDao;
import com.practical.consultora_rrhh.modelo.clases.OpcionRespuesta;
import com.practical.consultora_rrhh.interfaces.repositorio.opcionRespuestaRepository;

import java.util.List;
import java.util.Optional;

public class OpcionRespuestaDao implements IOpcionRespuestaDao {

    private final opcionRespuestaRepository repository;

    public OpcionRespuestaDao(opcionRespuestaRepository repository) {
        this.repository = repository;
    }

    @Override
    public OpcionRespuesta guardar(OpcionRespuesta opcionRespuesta) {
        return repository.save(opcionRespuesta);
    }
// Analizar caso peculiar
    @Override
    public OpcionRespuesta actualizar(Long aLong, OpcionRespuesta opcionRespuesta) {
        return null;
    }

    @Override
    public List<OpcionRespuesta> obtenerTodos() {
        return repository.findAll();
    }

    @Override
    public void eliminar(OpcionRespuesta opcionRespuesta) {
 repository.delete(opcionRespuesta);}

    @Override
    public Optional<OpcionRespuesta> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<OpcionRespuesta> obtenerPorNombreContiene(String texto) {
        return repository.findByNombreContaining(texto);
    }

    @Override
    public boolean existePorNombreInsensible(String nombre) {
        return repository.existsByNombreIgnoreCase(nombre);
    }
}
