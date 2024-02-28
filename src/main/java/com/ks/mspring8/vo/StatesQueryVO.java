package com.ks.mspring8.vo;


import lombok.Data;

import java.io.Serializable;

@Data
public class StatesQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer countryId;

}
