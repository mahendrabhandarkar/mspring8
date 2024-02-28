package com.ks.mspring8.dto;


import com.ks.mspring8.entity.SubCommunity;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class CommunityDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer religionId;

    private String communityName;

    private Set<SubCommunity> subCommunities;
}
