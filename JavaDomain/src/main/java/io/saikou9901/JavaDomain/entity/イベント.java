package io.saikou9901.JavaDomain.entity;

import io.saikou9901.JavaDomain.value.期間;

public class イベント {

    private String イベント名;
    private 期間 開催期間;

    public String getイベント名() {
        return イベント名;
    }

    public void setイベント名(String イベント名) {
        this.イベント名 = イベント名;
    }

    public 期間 get開催期間() {
        return 開催期間;
    }

    public void set開催期間(期間 開催期間) {
        this.開催期間 = 開催期間;
    }
}
