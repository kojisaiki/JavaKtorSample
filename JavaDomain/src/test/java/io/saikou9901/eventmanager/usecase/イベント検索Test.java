package io.saikou9901.eventmanager.usecase;

import io.saikou9901.eventmanager.entity.イベント;
import io.saikou9901.eventmanager.repository.イベントRepository;
import io.saikou9901.eventmanager.value.期間;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class イベント検索Test {

    イベント検索 _イベント検索;

    @Mock イベントRepository _イベントRepository;

    @BeforeEach
    void init() {
        _イベント検索 = new イベント検索(_イベントRepository);
    }

    @Test
    void 取得_期間内のイベント() {
        // 準備
        doReturn(new ArrayList<>()).when(_イベントRepository).期間内のイベント(any());

        // 実施
        期間 _kikan = new 期間(new Date(), new Date());
        List<イベント> subject = _イベント検索.取得_期間内のイベント(_kikan);

        // 確認
        verify(_イベントRepository, times(1)).期間内のイベント(_kikan);
        assertEquals(subject.size(), 0);
    }
}