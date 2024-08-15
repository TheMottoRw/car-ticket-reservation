package helper;

import play.mvc.Http;

import java.io.File;
import java.util.Random;
import java.util.UUID;

public class HelperUtil {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String CHARACTERS = ALPHABET+NUMBERS;

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(index));
        }
        return stringBuilder.toString();
    }
    public static String generateRandomNumber(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(NUMBERS.length());
            stringBuilder.append(NUMBERS.charAt(index));
        }
        return stringBuilder.toString();
    }
    public static String getFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex != -1 && dotIndex < filename.length() - 1) {
            return filename.substring(dotIndex + 1);
        }
        return ""; // or null, depending on how you want to handle files without extensions
    }
    public static boolean deleteFile(String filepath) {
        File file = new File(filepath);
        // Check if the file exists
        if (file.exists()) {
            // Attempt to delete the file
            boolean isDeleted = file.delete();
            // Check if deletion was successful
            if (isDeleted) return true;
        }
        return false; // or null, depending on how you want to handle files without extensions
    }
    public static String generateUuid(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public static int longToInt(long value){
        return Integer.parseInt(String.valueOf(value));
    }

    public static String getBaseUrl(Http.Request request){
        String host = request.host(),
                scheme = request.secure()?"https://":"http://";
        return scheme+host;
    }
    public static String getFileUploadPath(Http.Request request){
        String baseUrl = getBaseUrl(request);
        return baseUrl.startsWith("https")?Constants.FILE_UPLOAD_PATH_PROD:Constants.FILE_UPLOAD_PATH_DEV;
    }
}
