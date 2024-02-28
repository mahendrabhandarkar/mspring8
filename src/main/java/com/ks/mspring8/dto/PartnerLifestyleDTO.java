package com.ks.mspring8.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class PartnerLifestyleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer userId;

    private String pdiet;

    private String psmoke;

    private String pdrink;

}
