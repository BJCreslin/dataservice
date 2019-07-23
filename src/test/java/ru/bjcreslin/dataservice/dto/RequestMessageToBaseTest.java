package ru.bjcreslin.dataservice.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bjcreslin.dataservice.exceptions.ErrorVersionAPI;

class RequestMessageToBaseTest {
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

    private RequestMessageToBase requestMessageToBase;

    @BeforeEach
    public void dataAssignment() {
        version = 1;
        function = "testfunction";
        id = 12l;
        text = "test to API Sysytem";
        author = "receiveAuthor";
    }

    @Test
    void correctCreate() {

        try {
            requestMessageToBase = new RequestMessageToBase(version, function, id, text, author);

        } catch (ErrorVersionAPI errorVersionAPI) {
            errorVersionAPI.printStackTrace();
        }
        Assertions.assertEquals(requestMessageToBase.getAuthor(), author);

    }

    @Test
    void inCorrectCreate() throws ErrorVersionAPI {
        version = 3;

        Assertions.assertThrows(ErrorVersionAPI.class, () -> {
            new RequestMessageToBase(version, function, id, text, author);
        });
    }
}