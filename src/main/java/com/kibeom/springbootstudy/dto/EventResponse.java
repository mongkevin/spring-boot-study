package com.kibeom.springbootstudy.dto;

import com.kibeom.springbootstudy.constant.EventStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventResponse {
    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;
}


//자바 16부터 사용하는 record를 사용한 방식
//롬북의 문제점에 따른 새로운 제안

//    public record EventResponse(
//            Long placeId,
//            String eventName,
//            EventStatus eventStatus,
//            LocalDateTime eventStartDatetime,
//            LocalDateTime eventEndDatetime,
//            Integer currentNumberOfPeople,
//            Integer capacity,
//            String memo
//    ) {
//        public static EventResponse of(
//                Long placeId,
//                String eventName,
//                EventStatus eventStatus,
//                LocalDateTime eventStartDatetime,
//                LocalDateTime eventEndDatetime,
//                Integer currentNumberOfPeople,
//                Integer capacity,
//                String memo
//    ) {
//            return new EventResponse(
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





