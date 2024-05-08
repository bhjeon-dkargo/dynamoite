package io.dkargo.dynamoite.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.*;

@Data
@DynamoDBDocument
public class Address {

    @DynamoDBAttribute
    private String line1;

    @DynamoDBAttribute
    private  String city;

    @DynamoDBAttribute
    private  String country;
}
