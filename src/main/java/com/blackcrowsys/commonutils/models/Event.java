package com.blackcrowsys.commonutils.models;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Event implements Serializable {

    private String securityToken;
    private List<FieldChange> changes;
}
