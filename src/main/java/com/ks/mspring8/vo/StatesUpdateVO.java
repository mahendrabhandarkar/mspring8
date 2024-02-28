package com.ks.mspring8.vo;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class StatesUpdateVO extends StatesVO implements Serializable {
    private static final long serialVersionUID = 1L;

}
