package ru.bjcreslin.dataservice.dto;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.java.Log;
import ru.bjcreslin.dataservice.exceptions.ErrorVersionAPI;

import java.time.LocalDateTime;

/**
 * Класс для запроса данных из базы данных
 */
@Log
@Getter
@ToString
public class RequestMessageToBase {
    /* версия запроса  */
    static private final int CURRENT_VERSION = 1;

    public RequestMessageToBase(int version, String function, long id, String text, String author) throws ErrorVersionAPI {
        if (version != CURRENT_VERSION) {
            throw new ErrorVersionAPI(version, CURRENT_VERSION);
        }
        this.version = version;
        this.function = function;
        this.id = id;
        this.text = text;
        this.author = author;
        log.info("Запрос с id " + id + " к функции " + function + " автором " + author);
        receiveTime = LocalDateTime.now();
    }

    /*    версия запроса     */
    private int version;
    /*    Функция запроса     */
    private String function;
    /*    id запроса     */
    private long id;
    /*    текст запроса     */
    private String text;
    /*   автор запроса   */
    private String author;
    /*    время получения запроса     */
    private LocalDateTime receiveTime;
}
