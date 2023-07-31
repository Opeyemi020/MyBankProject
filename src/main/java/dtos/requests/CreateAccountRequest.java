package dtos.requests;

import lombok.Data;

@Data
public class CreateAccountRequest {
    private String firstName;
    private String lastName;
    private String otherName;
    private String phoneNumber;
    private String emailAddress;
}
