package com.ks.mspring8.dto;


import com.ks.mspring8.entity.Community;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class ReligionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String religionName;
    private Set<Community> communities;
}
