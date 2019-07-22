package ru.bjcreslin.dataservice.service;

import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import ru.bjcreslin.dataservice.dto.ItemDTO;
import ru.bjcreslin.dataservice.repo.ItemRepository;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Log
public class ItemService {
    ItemRepository itemRepository;

    private Optional<ItemDTO> baseAnswer;


    public ItemDTO findById(Long id) {
        baseAnswer = itemRepository.findById(id);
        if (baseAnswer.isPresent()) {
            log.info("OK. FindById id=" + id);
            return baseAnswer.get();
        } else {
            log.info("OK. NOT FindById id=" + id);
            throw new NoSuchElementException("Нет элемента с id=" + id);
        }
    }

}
