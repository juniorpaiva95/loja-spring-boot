package com.digivox.desafio.item.services;

import com.digivox.desafio.exceptions.DatabaseException;
import com.digivox.desafio.exceptions.ResourceNotFoundException;
import com.digivox.desafio.item.models.TipoItem;
import com.digivox.desafio.item.repository.TipoItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class TipoItemService {

    @Autowired
    TipoItemRepository repository;

    public TipoItem getOne(UUID id) {
        log.info("TipoItemService -> getOne");

        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public List<TipoItem> getAll() {
        return repository.findAll();
    }

    public TipoItem create(TipoItem tipoItem) {
        return repository.save(tipoItem);
    }

    public void delete(UUID id) {
        try{
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public TipoItem update(UUID id, TipoItem tipoItem) {
        try {
            TipoItem entity = repository.getOne(id);
            entity.setDescription(tipoItem.getDescription());

            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }
}
