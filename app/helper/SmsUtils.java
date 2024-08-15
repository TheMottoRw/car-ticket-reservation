package helper;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Result;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import static play.mvc.Results.ok;

public class SmsUtils {

    public static String sendSms(String receiver,String text) {
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = null;
        String phone = receiver;
        String message = text;
        try {
            phone = phone.replace("+", "");
            phone = phone.substring(0, 3).equals("250") ? phone : "25" + phone;
            System.out.println(phone);


            String body = "{'form_params':{'sender':'+250788671144','recipients':'" + phone + "','message':'" + message + "'}}";
            Map<String, String> formData = new HashMap<>();
            formData.put("sender", "+250788671144");
            formData.put("recipients", phone);
            formData.put("message", message);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.intouchsms.co.rw/api/sendsms/.json"))
                    .POST(HttpRequest.BodyPublishers.noBody())
                    .header("Authorization", "Basic " +
                            Base64.getEncoder().encodeToString(("Channy:Channy@Inema!").getBytes()))
                    .header("Content-Type","application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(getFormDataAsString(formData)))
                    .build();

            HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (res.statusCode() == 200) {
                JsonNode obj = Json.parse(res.body());
                return "success";
            }
            System.out.println(res.body());
            return "success";
        } catch (IOException e) {
//            throw new RuntimeException(e);
            return "fail";
        } catch (InterruptedException e) {
            return "fail";
//            throw new RuntimeException(e);
        }
    }
    public static Result sendSms() {
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = null;
        String phone = "0784634118";
        String message = "Hello Asua,are you good?";
        try {
            phone = phone.replace("+", "");
            phone = phone.substring(0, 3).equals("250") ? phone : "25" + phone;
            System.out.println(phone);


            String body = "{'form_params':{'sender':'+250788671144','recipients':'" + phone + "','message':'" + message + "'}}";
            Map<String, String> formData = new HashMap<>();
            formData.put("sender", "+250788671144");
            formData.put("recipients", phone);
            formData.put("message", message);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.intouchsms.co.rw/api/sendsms/.json"))
                    .POST(HttpRequest.BodyPublishers.noBody())
                    .header("Authorization", "Basic " +
                            Base64.getEncoder().encodeToString(("Channy:Channy@Inema!").getBytes()))
                    .header("Content-Type","application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(getFormDataAsString(formData)))
                    .build();

            HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (res.statusCode() == 200) {
                JsonNode obj = Json.parse(res.body());
            }
            System.out.println(res.body());
            return ok(res.body());
        } catch (IOException e) {
//            throw new RuntimeException(e);
            return ok("failed " + e.getMessage());
        } catch (InterruptedException e) {
            return ok("failed " + e.getMessage());
//            throw new RuntimeException(e);
        }

//        return ok("");
    }
    private static String getFormDataAsString(Map<String, String> formData) {
        StringBuilder formBodyBuilder = new StringBuilder();
        for (Map.Entry<String, String> singleEntry : formData.entrySet()) {
            if (formBodyBuilder.length()>0) {
                formBodyBuilder.append("&");
            }
            formBodyBuilder.append(URLEncoder.encode(singleEntry.getKey(), StandardCharsets.UTF_8));
            formBodyBuilder.append("=");
            formBodyBuilder.append(URLEncoder.encode(singleEntry.getValue(), StandardCharsets.UTF_8));
        }
        return formBodyBuilder.toString();
    }

}