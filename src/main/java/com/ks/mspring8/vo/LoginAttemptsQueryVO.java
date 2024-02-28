package com.ks.mspring8.vo;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class LoginAttemptsQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String ipAddress;

    private String login;

    private LocalDateTime time;

}
