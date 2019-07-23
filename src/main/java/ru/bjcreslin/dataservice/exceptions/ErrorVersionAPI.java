package ru.bjcreslin.dataservice.exceptions;

import lombok.extern.java.Log;

@Log
public class ErrorVersionAPI extends Exception {

    public ErrorVersionAPI(int version, int currentVersion) {
    log.warning("Текущая версия API - "+currentVersion +" не совпадает с версией запроса "+version);
    }
}
