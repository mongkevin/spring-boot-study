package com.kibeom.springbootstudy.controller.api;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.URI;
import java.util.List;

import static org.springframework.web.servlet.function.ServerResponse.created;
import static org.springframework.web.servlet.function.ServerResponse.ok;

//@Component
public class APIPlaceHandler {

    //함수 기반 설계 연습

//    public ServerResponse getPlaces(ServerRequest request) {
//        return ok().body(List.of("place1","place2"));
//    }
//
//    public ServerResponse createPlace(ServerRequest request) {
//        return created(URI.create("/api/places/1")).body(true);
//    }
//
//    public ServerResponse getPlace(ServerRequest request) {
//        return ok().body("place" + request.pathVariable("placeId"));
//    }
//
//    public ServerResponse modifyPlace(ServerRequest request) {
//        return ok().body(true);
//    }
//
//    public ServerResponse removePlace(ServerRequest request) {
//        return ServerResponse.ok().body(true);
//    }
}
