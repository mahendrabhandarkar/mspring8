package com.ks.mspring8.vo;
import jakarta.validation.constraints.NotNull;

public class WfQueueRoleRankUserVO {
    private Long roleRankUserId;
    private @NotNull Long roleProcessId;
    private @NotNull String userId;
}
