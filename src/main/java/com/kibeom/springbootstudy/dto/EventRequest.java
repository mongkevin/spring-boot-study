package com.kibeom.springbootstudy.dto;

import com.kibeom.springbootstudy.constant.EventStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventRequest {
    private Long placeId;
    String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;
}


//    public record EventRequest(
//            Long placeId,
//            String eventName,
//            EventStatus eventStatus,
//            LocalDateTime eventStartDatetime,
//            LocalDateTime eventEndDatetime,
//            Integer currentNumberOfPeople,
//            Integer capacity,
//            String memo
//    ) {
//        public static EventRequest of(
//                Long placeId,
//                String eventName,
//                EventStatus eventStatus,
//                LocalDateTime eventStartDatetime,
//                LocalDateTime eventEndDatetime,
//                Integer currentNumberOfPeople,
//                Integer capacity,
//                String memo
//    ) {
//            return new EventRequest(
//                    placeId,
//                    eventName,
//                    eventStatus,
//                    eventStartDatetime,
//                    eventEndDatetime,
//                    currentNumberOfPeople,
//                    capacity,
//                    memo
//            );
//        }
//    }