package com.unicobank.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Schema(name = "Loans",
        description = "Schema to hold Loan information"
)
@Getter@Setter@ToString
public class LoansDto {

    @Schema(
            description = "Mobile Number of Customer", example = "4365327698"
    )
    @NotEmpty(message = "Mobile Number should not be empty or null")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number should have 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Loan Number of the customer", example = "548732457654"
    )
    @NotEmpty(message = "Loan number should not null or empty")
    @Pattern(regexp = "^$|[0-9]{12}", message = "Loan number should have 12 digits")
    private String loanNumber;

    @Schema(
            description = "Type of the loan", example = "Home Loan"
    )
    @NotEmpty(message = "Loan type can not be null")
    private String loanType;

    @Schema(
            description = "Total loan amount", example = "100000"
    )
    @Positive(message = "Total loan amount must be greater than zero")
    private int totalLoan;

    @Schema(
            description = "Total loan amount paid", example = "1000"
    )
    @PositiveOrZero(message = "Amount paid must be equal or greater than zero")
    private int amountPaid;

    @Schema(
            description = "Total outstanding amount against a loan", example = "99000"
    )
    @PositiveOrZero(message = "Outstanding Amount must be equal or greater than zero")
    private int outstandingAmount;
}
