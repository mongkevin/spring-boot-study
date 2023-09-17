package com.kibeom.springbootstudy.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

import static org.springframework.web.servlet.function.RequestPredicates.path;
import static org.springframework.web.servlet.function.RouterFunctions.route;

//@Configuration
public class APIPlaceRouter {

    //함수 기반 설계 연습

//    @Bean
//    public RouterFunction<ServerResponse> placeRouter(){
//        return route().nest(path("/api/places"),builder -> builder
//                .GET("", req -> ServerResponse.ok().body(List.of("place1","place2")))
//                .POST("",req -> ServerResponse.ok().body(true))
//                .GET("/{placeId}", req -> ServerResponse.ok().body("place" + req.pathVariable("placeId")))
//                .PUT("/{placeId}", req -> ServerResponse.ok().body(true))
//                .DELETE("/{placeId}", req -> ServerResponse.ok().body(true))
//        ).build();
//    }

//    private final APIPlaceHandler apiPlaceHandler;

    //APIPlaceHandler를 이용한 함수
//    @Bean
//    public RouterFunction<ServerResponse> placeRouter(APIPlaceHandler apiPlaceHandler){
//        return route().nest(path("/api/places"),builder -> builder
//                .GET("", apiPlaceHandler::getPlaces)
//                .POST("",apiPlaceHandler::createPlace)
//                .GET("/{placeId}", apiPlaceHandler::getPlace)
//                .PUT("/{placeId}", apiPlaceHandler::modifyPlace)
//                .DELETE("/{placeId}", apiPlaceHandler::removePlace)
//        ).build();
//    }
}
