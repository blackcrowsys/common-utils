package com.blackcrowsys.commonutils.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class FieldChange implements Serializable {

    private static final long serialVersionUID = -5597022988458115060L;

    private String field;
    private String oldValue;
    private String newValue;
}
