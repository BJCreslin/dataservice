package ru.bjcreslin.dataservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bjcreslin.dataservice.dto.ItemDTO;

public interface ItemRepository extends JpaRepository<ItemDTO, Long> {

}
