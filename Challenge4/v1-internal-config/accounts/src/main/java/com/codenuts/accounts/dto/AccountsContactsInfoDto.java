package com.codenuts.accounts.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties(prefix = "accounts")
public class AccountsContactsInfoDto {

    private String message;
    private ContactDetails contactDetails;
    private List<String> onCallSupport;
}

@Data
class ContactDetails{
    private String name;
    private String email;
}

//below is 2nd option
//@ConfigurationProperties(prefix = "accounts")
//public record AccountsContactsInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
//
//}
