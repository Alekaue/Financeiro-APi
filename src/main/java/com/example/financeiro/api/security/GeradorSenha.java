package com.example.financeiro.api.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorSenha {

	
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
<<<<<<< HEAD
		System.out.println(encoder.encode("@ngul@r0"));
=======
		System.out.println(encoder.encode("admin"));
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
	}
	
}
