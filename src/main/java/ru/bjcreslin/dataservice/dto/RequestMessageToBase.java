package ru.bjcreslin.dataservice.dto;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.java.Log;

import java.time.LocalDateTime;

/**
 * Класс для запроса данных из базы данных
 */
@Log
@Getter
@ToString
public class RequestMessageToBase {
    private RequestMessage requestMessage;
    /*    Время получения запроса     */
    private LocalDateTime requestTime;

    public RequestMessageToBase(RequestMessage requestMessage) {
        this.requestMessage = requestMessage;
        this.requestTime = LocalDateTime.now();
        log.info("запрос с ID " + requestMessage.getId() + "получен в " + requestTime);
    }


}
