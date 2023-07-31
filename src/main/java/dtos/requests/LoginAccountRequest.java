package dtos.requests;

import lombok.Data;

@Data
public class LoginAccountRequest {
    private int id;
    private String username;
    private String password;
}
