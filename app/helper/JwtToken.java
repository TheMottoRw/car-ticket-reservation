package helper;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import io.jsonwebtoken.JwtException;
import play.mvc.Http;

import java.time.Instant;

public class JwtToken {

    public static String generateToken(String uid,String email,String phone,String userType) {
        String jwt = JWT.create()
                .withIssuer(Constants.BASE_URL)
                .withClaim("id",uid)
                .withClaim("email",email)
                .withClaim("phone",phone)
                .withClaim("user_type",userType)
                .withIssuedAt(Instant.now())
                .withExpiresAt(Instant.now().plusSeconds(3600 * 3))
                .sign(Algorithm.HMAC256(Constants.TOKEN_SECRET_KEY));
        return jwt;
    }

    public static String refreshToken() {
        String jwt = JWT.create()
                .withIssuedAt(Instant.now())
                .withExpiresAt(Instant.now().minusSeconds(600))
                .sign(Algorithm.HMAC256(Constants.TOKEN_SECRET_KEY));
        return jwt;
    }

    public static boolean validateToken(String token) {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(Constants.TOKEN_SECRET_KEY))
                    .acceptLeeway(1).build();
            DecodedJWT decodedJWT = verifier.verify(token);
        } catch (TokenExpiredException | JWTDecodeException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    public static String tokenValidationError(String token) {
        try {

            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(Constants.TOKEN_SECRET_KEY))
                    .acceptLeeway(1).build();
            DecodedJWT decodedJWT = verifier.verify(token);
        } catch (TokenExpiredException | JWTDecodeException | JwtException ex) {
            return ex.getMessage();
        }
        return "valid";
    }

    public static DecodedJWT getPayloadInfo(String token) {
        DecodedJWT decodedJWT;
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(Constants.TOKEN_SECRET_KEY))
                .acceptLeeway(1).build();
        decodedJWT = verifier.verify(token);
        return decodedJWT;
    }
    public static String getFieldFromToken(String field,String token) {
        DecodedJWT decodedJWT = null;
        System.out.println(token);
        if(validateToken(token)){
            decodedJWT = getPayloadInfo(token);
            return decodedJWT.getClaim(field).asString();
        }else {
            System.out.println("Invalid token");
        }
        return "";
    }
    public static String getTokenHeader(Http.Request request){
        if(request.header("Authorization").isEmpty())
            return "";
        return request.header("Authorization").get().replaceAll("Bearer ","");
    }
    public static String resourceSecurity(Http.Request request){
        if(request.header("Authorization").isEmpty())
            return "noheader";
        if(!validateToken(request.header("Authorization").get().replaceAll("Bearer ",""))){
            return tokenValidationError(request.header("Authorization").get());
        }
        return "";
    }

}
