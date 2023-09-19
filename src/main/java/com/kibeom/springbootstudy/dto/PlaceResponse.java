package com.kibeom.springbootstudy.dto;

import com.kibeom.springbootstudy.constant.PlaceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceResponse {
    private PlaceType placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String memo;
}


//    public record PlaceResponse(
//            PlaceType placeType,
//            String placeName,
//            String address,
//            String phoneNumber,
//            Integer capacity,
//            String memo
//    ) {
//        public static PlaceResponse of(
//                PlaceType placeType,
//                String placeName,
//                String address,
//                String phoneNumber,
//                Integer capacity,
//                String memo
//    ) {
//            return new PlaceResponse(placeType, placeName, address, phoneNumber, capacity, memo);
//        }
//    }

