
package com.openbank;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "national_identifier",
    "name"
})
@Generated("jsonschema2pojo")
public class Bank__1 {

    @JsonProperty("national_identifier")
    private Object nationalIdentifier;
    @JsonProperty("name")
    private String name;

    @JsonProperty("national_identifier")
    public Object getNationalIdentifier() {
        return nationalIdentifier;
    }

    @JsonProperty("national_identifier")
    public void setNationalIdentifier(Object nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
