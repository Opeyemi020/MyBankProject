package dtos.responses;

import lombok.Data;

@Data
public class CreateAccountResponse {
    private String accountNumber;
    private String fullName;
    private String message;
}
