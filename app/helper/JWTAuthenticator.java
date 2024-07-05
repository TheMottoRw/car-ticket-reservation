package helper;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import dto.ErrorMessageDTO;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import java.util.Optional;

public class JWTAuthenticator extends Security.Authenticator {
    public String secret = Constants.TOKEN_SECRET_KEY;

    @Override
    public Optional<String> getUsername(Http.Request request) {
        String token = extractToken(request);
        if (token != null && validateToken(token)) {
            return Optional.ofNullable(parseToken(token));
        }
        return Optional.empty();
    }

    @Override
    public Result onUnauthorized(Http.Request request) {
        return unauthorized(Json.toJson(new ErrorMessageDTO(Constants.ERROR_INVALID_TOKEN, Constants.ERROR_UNAUTHORIZE_OPERATION)));
    }

    private DecodedJWT getPayloadInfo(String token) {
        DecodedJWT decodedJWT;
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret))
                .acceptLeeway(1).build();
        decodedJWT = verifier.verify(token);
        return decodedJWT;
    }

    private String extractToken(Http.Request request) {
        if (request.header("Authorization").isEmpty())
            return "";
        return request.header("Authorization").get().replaceAll("Bearer ", "");
    }

    private boolean validateToken(String token) {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret))
                    .acceptLeeway(1).build();
            DecodedJWT decodedJWT = verifier.verify(token);
        } catch (TokenExpiredException | JWTDecodeException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    private String parseToken(String token) {
        return getPayloadInfo(token).getClaim("id").asString();
    }

    public String parseData(Http.Request request, String field) {
        String token = extractToken(request);
        if (validateToken(token)) {
            return getPayloadInfo(token).getClaim(field).asString();
        }
        return "";
    }
}
