package com.ks.mspring8.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class CountriesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String sortname;

    private String name;

}
