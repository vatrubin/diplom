package ru.practicum.ewm.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ViewStatsModel {
    private String app;
    private String uri;
    private Long hits;
}
