package br.com.brenohff.climbapi.config;

import br.com.brenohff.climbapi.entity.Pilots;
import br.com.brenohff.climbapi.service.PilotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import static java.util.Objects.isNull;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private PilotsService pilotsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        int pilotid = Integer.parseInt(authentication.getName());
        String pilotPassword = authentication.getCredentials().toString();

        Pilots pilot = pilotsService.getPilotById(pilotid);
        if (isNull(pilot)) {
            return null;
        }

        String pilotHash = pilot.getPassword();
        if (stringHexa(gerarHash(pilotPassword + pilot.getSalt())).equals(pilotHash)) {
            return new UsernamePasswordAuthenticationToken(pilot, pilotPassword, new ArrayList<>());
        } else {
            return null;
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private byte[] gerarHash(String frase) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(frase.getBytes());
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private static String stringHexa(byte[] bytes) {
        StringBuilder s = new StringBuilder();
        for (byte aByte : bytes) {
            int parteAlta = ((aByte >> 4) & 0xf) << 4;
            int parteBaixa = aByte & 0xf;
            if (parteAlta == 0) s.append('0');
            s.append(Integer.toHexString(parteAlta | parteBaixa));
        }
        return s.toString();
    }

}