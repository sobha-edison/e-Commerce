package com.ecommerce.eCommerce.configuration;

import com.ecommerce.eCommerce.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

public class CustomTokenEnhancer implements TokenEnhancer {
    private final Logger log = LoggerFactory.getLogger(CustomTokenEnhancer.class);

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        try {
            if (authentication.getPrincipal() instanceof User) {
                User user = (User) authentication.getPrincipal();
                final Map<String, Object> additionalInfo = new HashMap<>();
                if (user.getName() != null)
                    additionalInfo.put("Name", user.getName());
                if (user.getId() != 0)
                    additionalInfo.put("UserID", user.getId());
                ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return accessToken;
    }
}
