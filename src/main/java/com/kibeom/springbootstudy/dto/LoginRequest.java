package com.kibeom.springbootstudy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    private String email;
    private String password;
}

//    public record LoginRequest(
//            String email,
//            String password
//    ) {
//        public static LoginRequest of(
//                String email,
//                String password
//    ) {
//            return new LoginRequest(email, password);
//        }
//    }
