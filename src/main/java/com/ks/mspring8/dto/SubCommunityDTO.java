package com.ks.mspring8.dto;


import com.ks.mspring8.entity.Community;
import lombok.Data;

import java.io.Serializable;

@Data
public class SubCommunityDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer communityId;

    private String subCommunityName;

    private Community community;
}
