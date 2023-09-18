package com.kibeom.springbootstudy.controller;

import com.kibeom.springbootstudy.constant.PlaceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/admin")
@Controller
public class AdminController {
    @GetMapping(value = "/places")
    public ModelAndView adminPlaces(
            PlaceType placeType,
            String placeName,
            String address
    ){ //@RequestParam(required = false)을 적지 않으면 기본값으로 false
        Map<String, Object> map = new HashMap<>();
        map.put("placeType", placeType);
        map.put("placeName", placeName);
        map.put("address", address);

        return new ModelAndView("admin/places", map);
    }

    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer palceId){
        return "Admin/place-detail";
    }

    @GetMapping("/events")
    public String adminEvents(){
        return "Admin/events";
    }
    @GetMapping("/places/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId){
        return "Admin/event-detail";
    }
}
