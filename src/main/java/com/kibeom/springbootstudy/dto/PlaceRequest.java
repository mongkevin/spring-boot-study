package com.kibeom.springbootstudy.dto;

import com.kibeom.springbootstudy.constant.PlaceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceRequest {
    private PlaceType placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String memo;
}

//    public record PlaceRequest(
//            PlaceType placeType,
//            String placeName,
//            String address,
//            String phoneNumber,
//            Integer capacity,
//            String memo
//    ) {
//        public static PlaceRequest of(
//                PlaceType placeType,
//                String placeName,
//                String address,
//                String phoneNumber,
//                Integer capacity,
//                String memo
//    ) {
//            return new PlaceRequest(placeType, placeName, address, phoneNumber, capacity, memo);
//        }
//    }