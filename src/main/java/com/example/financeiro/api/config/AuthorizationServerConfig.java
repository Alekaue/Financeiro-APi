	package com.example.financeiro.api.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.AuthenticationManager;
<<<<<<< HEAD
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
=======
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import com.example.financeiro.api.config.token.CustomTokenEnhancer;

@Profile("oauth-security")
@Configuration
<<<<<<< HEAD
=======
@EnableAuthorizationServer
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter{
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
<<<<<<< HEAD
	@Autowired
	private UserDetailsService userDetailsservice;
	
=======
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
				.withClient("angular")
<<<<<<< HEAD
				.secret("$2a$10$tIBu0FOSvNVCvQoGtfTsLuQbRHVGpM/Dsd1WO/LlsM0oiNzC6b0.G") // @ngul@r0
=======
				.secret("@ngul@r0")
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
				.scopes("read", "write")
				.authorizedGrantTypes("password", "refresh_token")
				.accessTokenValiditySeconds(10000)
				.refreshTokenValiditySeconds(3600 * 24)
			.and()
				.withClient("mobile")
<<<<<<< HEAD
				.secret("$2a$10$1Ir5DUqJXddr6Eow9rLeXOD/PvhvL.5jukpVHkYxHDv.3Ft2P8are") //m0b1l30
=======
				.secret("m0b1l30")
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
				.scopes("read")
				.authorizedGrantTypes("password", "refresh_token")
				.accessTokenValiditySeconds(10000)
				.refreshTokenValiditySeconds(3600 * 24);
			
	}
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		
		TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
		tokenEnhancerChain.setTokenEnhancers(Arrays.asList(tokenEnhancer(), accessTokenConverter()));
		
		
		endpoints
			.tokenStore(tokenStore())
			.tokenEnhancer(tokenEnhancerChain)
			.reuseRefreshTokens(false)
<<<<<<< HEAD
			.userDetailsService(userDetailsservice)
=======
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
			.authenticationManager(authenticationManager);
			
	}
		

	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
		accessTokenConverter.setSigningKey("@lek@ue");
		
		return accessTokenConverter;
	}

	@Bean
	public TokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}
	
	private TokenEnhancer tokenEnhancer() {
		return new CustomTokenEnhancer();
	}
}
