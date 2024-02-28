package com.ks.mspring8.dto;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class UserAlbumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer userId;

    private String albumName;

    private String albumFolder;

    private LocalDateTime albumCreateDate;

}
