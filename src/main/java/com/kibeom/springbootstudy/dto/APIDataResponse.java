package com.kibeom.springbootstudy.dto;

import com.kibeom.springbootstudy.constant.ErrorCode;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
//APIErrorResponse도 같이 불러올수 있도록
@EqualsAndHashCode(callSuper = true)
public class APIDataResponse<T> extends APIErrorResponse {

    private final T data;

    private APIDataResponse(T data) {
        super(true, ErrorCode.OK.getCode(), ErrorCode.OK.getMessage());
        this.data = data;
    }

    public static <T> APIDataResponse<T> of(T data) {
        return new APIDataResponse<>(data);
    }

    public static <T> APIDataResponse<T> empty() {
        return new APIDataResponse<>(null);
    }
}
