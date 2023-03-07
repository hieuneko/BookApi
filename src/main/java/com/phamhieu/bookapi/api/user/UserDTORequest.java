package com.phamhieu.bookapi.api.user;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class UserDTORequest {

    private UUID id;
    private UUID roleId;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private boolean enabled;
    private String avatar;
}
