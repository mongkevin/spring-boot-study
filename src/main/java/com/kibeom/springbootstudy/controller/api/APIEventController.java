package com.kibeom.springbootstudy.controller.api;

import com.kibeom.springbootstudy.constant.ErrorCode;
import com.kibeom.springbootstudy.constant.EventStatus;
import com.kibeom.springbootstudy.dto.APIDataResponse;
import com.kibeom.springbootstudy.dto.APIErrorResponse;
import com.kibeom.springbootstudy.dto.EventResponse;
import com.kibeom.springbootstudy.exception.GeneralException;
import com.sun.jdi.request.EventRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api")
@RestController
public class APIEventController {
    @GetMapping("/events")
    public APIDataResponse<List<EventResponse>> getEvents() {
        return APIDataResponse.of(List.of(new EventResponse(
                1L,
                "오후 운동",
                EventStatus.OPENED,
                LocalDateTime.of(2021, 1, 1, 13, 0, 0),
                LocalDateTime.of(2021, 1, 1, 16, 0, 0),
                0,
                24,
                "마스크 꼭 착용하세요"
        )));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/events")
    public APIDataResponse<Void> createEvent(@RequestBody EventRequest eventRequest) {
        return APIDataResponse.empty();
    }

    @GetMapping("/events/{eventId}")
    public APIDataResponse<EventResponse> getEvent(@PathVariable Long eventId) {
        if (eventId.equals(2L)) {
            return APIDataResponse.empty();
        }

        return APIDataResponse.of(new EventResponse(
                1L,
                "오후 운동",
                EventStatus.OPENED,
                LocalDateTime.of(2021, 1, 1, 13, 0, 0),
                LocalDateTime.of(2021, 1, 1, 16, 0, 0),
                0,
                24,
                "마스크 꼭 착용하세요"
        ));
    }

    @PutMapping("/events/{eventId}")
    public APIDataResponse<Void> modifyEvent(
            @PathVariable Long eventId,
            @RequestBody EventRequest eventRequest
    ) {
        return APIDataResponse.empty();
    }

    @DeleteMapping("/events/{eventId}")
    public APIDataResponse<Void> removeEvent(@PathVariable Long eventId) {
        return APIDataResponse.empty();
    }

}
