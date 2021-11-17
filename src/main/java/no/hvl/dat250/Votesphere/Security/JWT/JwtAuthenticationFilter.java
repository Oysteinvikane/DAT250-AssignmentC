package no.hvl.dat250.Votesphere.Security.JWT;


import com.fasterxml.jackson.databind.*;
import no.hvl.dat250.Votesphere.Entities.*;
import org.springframework.boot.jackson.*;
import org.springframework.boot.json.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.web.authentication.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


/*
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private final AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;

        setFilterProcessesUrl("/login");
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest req,
                                                HttpServletResponse res) throws AuthenticationException {
        System.err.println("req = " + req + ", res = " + res);

        try {
            PollUser creds = new ObjectMapper()
                    .readValue(req.getInputStream(), PollUser.class);
            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            creds.getUsername(),
                            creds.getPassword(),
                            new ArrayList<>())
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest req,
                                            HttpServletResponse res,
                                            FilterChain chain,
                                            Authentication auth) throws IOException {
        String token = JWT.create()
                .withSubject(((User) auth.getPrincipal()).getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .sign(Algorithm.HMAC512(SECRET.getBytes()));

        // String body = ((User) auth.getPrincipal()).getUsername() + " " + token;

        String json = "{\""+ TOKEN_PREFIX.strip() + "\":\""+ token +"\"}";

        res.getWriter().write(json);
        res.getWriter().flush();
    }

    @Override
    protected AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }
}*/
