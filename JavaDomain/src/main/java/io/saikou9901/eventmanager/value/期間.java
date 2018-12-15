package io.saikou9901.eventmanager.value;

import java.util.Date;

public class 期間 {
    private Date 開始;
    private Date 終了;

    public 期間(Date 開始, Date 終了) {
        this.開始 = 開始;
        this.終了 = 終了;
    }

    public Date get開始() {
        return 開始;
    }

    public Date get終了() {
        return 終了;
    }
}
