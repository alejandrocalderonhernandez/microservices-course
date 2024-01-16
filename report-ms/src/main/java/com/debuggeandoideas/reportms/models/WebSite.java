package com.debuggeandoideas.reportms.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class WebSite implements Serializable {

    private Long id;
    private String name;
    private Category category;
    private String description;
}
