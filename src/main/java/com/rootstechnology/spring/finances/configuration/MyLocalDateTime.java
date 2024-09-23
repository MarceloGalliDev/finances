package com.rootstechnology.spring.finances.configuration;

import java.time.LocalDateTime;

public class MyLocalDateTime {

    private LocalDateTime time;

    public MyLocalDateTime(LocalDateTime t) {
        this.time = t;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
