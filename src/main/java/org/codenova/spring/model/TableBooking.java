package org.codenova.spring.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;



@Setter
@Getter
@ToString
public class TableBooking {

    @NotBlank
    private String customerName;

    @Min(2)
    @Max(6)
    private int guests;

    @Future
    private LocalDate bookingDate;

    @Email
    private String contact;

    @Size(min = 1, max = 20)
    private String request;
}
