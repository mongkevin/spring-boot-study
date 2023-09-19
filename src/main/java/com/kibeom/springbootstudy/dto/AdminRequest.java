package com.kibeom.springbootstudy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminRequest {
    private String email;
    private String nickname;
    private String password;
    private String phoneNumber;
    private String memo;
}

//    public record AdminRequest(
//            String email,
//            String nickname,
//            String password,
//            String phoneNumber,
//            String memo
//    ) {
//        public static AdminRequest of(
//                String email,
//                String nickname,
//                String password,
//                String phoneNumber,
//                String memo
//    ) {
//            return new AdminRequest(email, nickname, password, phoneNumber, memo);
//        }
//    }
