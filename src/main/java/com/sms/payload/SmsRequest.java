package com.sms.payload;

import lombok.Data;

@Data
public class SmsRequest {

    private String to;
    private String message;

}