package com.kibeom.springbootstudy.domain;

import com.kibeom.springbootstudy.constant.PlaceType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Admin {
    private Long id;

    private PlaceType placeType;
    private String email;
    private String nickname;
    private String password;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
