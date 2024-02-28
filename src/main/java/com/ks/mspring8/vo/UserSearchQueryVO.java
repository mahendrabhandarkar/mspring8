package com.ks.mspring8.vo;


import lombok.Data;

import java.io.Serializable;

@Data
public class UserSearchQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private String gender;

    private Integer profileImg;

    private String maritalStatus;

    private Integer religionId;

    private Integer motherTongueId;

    private Integer countryId;

    private Integer stateId;

    private Integer cityId;

    private Integer eduId;

    private String diet;

    private String disability;

    private String hivPositive;

}
