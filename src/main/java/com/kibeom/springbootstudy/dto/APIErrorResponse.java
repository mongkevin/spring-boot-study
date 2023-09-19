package com.kibeom.springbootstudy.dto;

import com.kibeom.springbootstudy.constant.ErrorCode;
import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
//상속 받은 클래스에서만 쓰이게
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class APIErrorResponse {

    private final Boolean success;
    private final Integer errorCode;
    private final String message;

    //수동 입력 에러코드
    public static APIErrorResponse of(Boolean success, Integer errorCode, String message) {
        return new APIErrorResponse(success, errorCode, message);
    }

    //에러 코드 넣기
    public static APIErrorResponse of(Boolean success, ErrorCode errorCode) {
        return new APIErrorResponse(success, errorCode.getCode(), errorCode.getMessage());
    }

    public static APIErrorResponse of(Boolean success, ErrorCode errorCode, Exception e) {
        return new APIErrorResponse(success, errorCode.getCode(), errorCode.getMessage(e));
    }

    public static APIErrorResponse of(Boolean success, ErrorCode errorCode, String message) {
        return new APIErrorResponse(success, errorCode.getCode(), errorCode.getMessage(message));
    }
}
