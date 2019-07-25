package ru.bjcreslin.dataservice.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bjcreslin.dataservice.dto.RequestMessage;
import ru.bjcreslin.dataservice.dto.RequestMessageToBase;

@Log
@RestController
@RequestMapping("/dataservice")
public class WebController {

    /**
     * метод тестирования соединения
     *
     * @return данные о тесте
     */
    @GetMapping("/test")
    public String getTest() {
        log.info("Test OK");
        return "test OK";
    }

    @GetMapping("/{item}")
    public RequestMessageToBase doAction(@PathVariable RequestMessage item) {
        RequestMessageToBase responseitem = new RequestMessageToBase(item);

        return responseitem;
    }
}
