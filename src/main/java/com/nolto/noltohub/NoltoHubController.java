package com.nolto.noltohub;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoltoHubController {

    @GetMapping("/user")
    public ResponseEntity<NoltoHubUserResponse> getUser() {
        return ResponseEntity.ok(
                new NoltoHubUserResponse(
                        1L,
                        "noltoLoginID",
                        "https://item.kakaocdn.net/do/f0467527c2e468d6d60ea37c8e9d74968f324a0b9c48f77dbce3a43bd11ce785"
                )
        );
    }

    @PostMapping("/token")
    public ResponseEntity<OAuthTokenResponse> getToken() {
        return ResponseEntity.ok(
                new OAuthTokenResponse(
                        "noltohub_token_type",
                        "noltohub_scope",
                        "noltohub_access_token"
                )
        );
    }
}