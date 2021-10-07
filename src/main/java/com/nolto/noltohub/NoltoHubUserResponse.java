package com.nolto.noltohub;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NoltoHubUserResponse {
    private Long id;
    private String login;
    private String avatar_url;

    public NoltoHubUserResponse(final Long id, final String login, final String avatar_url) {
        this.id = id;
        this.login = login;
        this.avatar_url = avatar_url;
    }
}
