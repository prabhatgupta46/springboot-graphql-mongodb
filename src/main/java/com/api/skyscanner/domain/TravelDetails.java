package com.api.skyscanner.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "TravelRecords")
public class TravelDetails {

    @Id
    private Long travelId;
    private Traveller traveller;
    private String airline;
    private String source;
    private String  destination;
    private String bookingCode;
}
