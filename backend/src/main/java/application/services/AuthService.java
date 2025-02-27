package application.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public String encrypt(String sequence) {
        return bCryptPasswordEncoder.encode(sequence);
    }
}
