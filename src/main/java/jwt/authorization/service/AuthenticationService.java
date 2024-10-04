package jwt.authorization.service;

import jwt.authorization.model.LoginRequest;
import jwt.authorization.model.RegisterRequest;
import jwt.authorization.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse login(LoginRequest request);
    JwtAuthenticationResponse register(RegisterRequest request);
}
