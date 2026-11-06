package com.practical.consultora_rrhh.dao;

import com.practical.consultora_rrhh.dto.FiltrosBusqueda.PreguntaFiltrosDto;
import com.practical.consultora_rrhh.interfaces.dao.IPreguntaDao;
import com.practical.consultora_rrhh.interfaces.repositorio.preguntaRepository;
import com.practical.consultora_rrhh.modelo.clases.Pregunta;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class PreguntaDaoImpl  extends genericDaoImpl<Pregunta> implements IPreguntaDao {

    private final preguntaRepository repository;
    public PreguntaDaoImpl(preguntaRepository repository) {
        super(Pregunta.class);
        this.repository = repository;
    }


    @Override
    public List<Pregunta> buscar(PreguntaFiltrosDto filtros) {
        return List.of();
    }
    @Override
    public Pregunta guardar(Pregunta pregunta) {
        return repository.save(pregunta);
    }

    @Override
    public List<Pregunta> obtenerTodos() {
        return repository.findAll();
    }

    @Override
    public void eliminar(Pregunta pregunta) {

    }

    @Override
    public Optional<Pregunta> obtenerPorId(Long id) {
        return repository.findById(id);
    }


}

