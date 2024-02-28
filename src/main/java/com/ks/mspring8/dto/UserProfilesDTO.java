package com.ks.mspring8.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class UserProfilesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer userId;

    private String website;

    private Integer motherTongueId;

    private Integer religionId;

    private Integer countryId;

    private Integer stateId;

    private Integer cityId;

    private String maritalStatus;

    private String height;

    private String skinTone;

    private String bodyType;

    private String diet;

    private String smoke;

    private String drink;

    private String ownWords;

    private String disability;

    private String hivPositive;

    private Integer profileComplete;

}
