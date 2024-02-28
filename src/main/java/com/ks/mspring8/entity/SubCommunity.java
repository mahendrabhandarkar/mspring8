package com.ks.mspring8.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sub_community")
public class SubCommunity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "community_id", nullable = false)
    private Integer communityId;

    @Column(name = "sub_community_name", nullable = false)
    private String subCommunityName;

}
