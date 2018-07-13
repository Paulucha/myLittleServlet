package com.paulucha.model;

import java.time.LocalDate;

public class MyApp {
    private LocalDate localDate;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public MyApp(LocalDate localDate) {
        this.localDate = localDate;
    }

}
