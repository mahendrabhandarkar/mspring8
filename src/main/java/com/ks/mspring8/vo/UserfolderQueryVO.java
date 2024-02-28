package com.ks.mspring8.vo;


import lombok.Data;

import java.io.Serializable;

@Data
public class UserfolderQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private String folderName;

}
