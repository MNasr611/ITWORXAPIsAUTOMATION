package com.itworx.api.schema;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ActivitySchema {
    @JsonProperty("activity")
    private String activity;

    @JsonProperty("type")
    private String type;

    @JsonProperty("participants")
    private int participants;

    @JsonProperty("price")
    private double price;

    @JsonProperty("link")
    private String link;

    @JsonProperty("key")
    private String key;

    @JsonProperty("accessibility")
    private double accessibility;

}
