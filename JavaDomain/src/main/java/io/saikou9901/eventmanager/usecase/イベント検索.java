package io.saikou9901.eventmanager.usecase;

import io.saikou9901.eventmanager.entity.イベント;
import io.saikou9901.eventmanager.repository.イベントRepository;
import io.saikou9901.eventmanager.value.期間;

import java.util.List;

public class イベント検索 {

    private イベントRepository _イベントRepository;

    public イベント検索(イベントRepository _イベントRepository) {
        this._イベントRepository = _イベントRepository;
    }

    public List<イベント> 取得_期間内のイベント(期間 kikan) {
        return _イベントRepository.期間内のイベント(kikan);
    }
}
