package io.saikou9901.eventmanager.repository;

import io.saikou9901.eventmanager.entity.イベント;
import io.saikou9901.eventmanager.value.期間;

import java.util.List;

public interface イベントRepository {

    public List<イベント> 期間内のイベント(期間 kikan);
}
