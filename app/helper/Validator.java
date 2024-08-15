package helper;

import play.libs.Files;
import play.mvc.Http;

import java.util.regex.Pattern;

public class Validator {
    public static boolean nid(String nid){
        boolean feed=false;
        String patt="1[0-9]{4}[7,8][0-9]{10}";
        feed=Pattern.matches(patt,nid);
        return feed;
    }
    public static boolean rwandanPhone(String number){
        boolean feed=false;
        String patt="(25)?07[2,3,8][0-9]{7}";
        feed=Pattern.matches(patt,number);
        return feed;
    }

    public static boolean phoneNumber(String number){
        boolean feed=false;
        String patt="^\\+?(?:[0-9] ?){8,14}[0-9]$";
        feed=Pattern.matches(patt,number);
        return feed;
    }

    public static boolean tin(String number){
        boolean feed=false;
        String patt="[0-9]{9}";
        feed=Pattern.matches(patt,number);
        return feed;
    }
    public static boolean email(String email){
        boolean feed = false;
        String patt = "[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*";
        feed=Pattern.matches(patt,email);
        return feed;
    }

    public static boolean password(String password){
        String patt="[a-zA-Z0-9 !@#$%^&*(),./;']{3,24}";
        String strongPatt = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{3,}$";
        return Pattern.matches(patt,password);
    }
    public static boolean isImageFile(Http.MultipartFormData.FilePart<Files.TemporaryFile> filePart) {
        String contentType = filePart.getContentType(); // Get the content type of the uploaded file

        // Check if the content type corresponds to an image
        return contentType != null && contentType.startsWith("image/");
    }
    public boolean strings(String str){
        boolean feed=false;
        String patt="[a-z]{4}";
        feed=Pattern.matches(patt,str);
        return feed;
    }
}