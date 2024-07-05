package helper;

public class Constants {
    public static String TOKEN_SECRET_KEY = "FYPReferences256";
    public static String BASE_URL = "http://localhost:5000";
    public static String PROJECT_PATH = System.getProperty("user.dir");
    public static String FILE_UPLOADED_URL = "/media/";
    public static String FILE_UPLOAD_PATH_DEV = PROJECT_PATH + "/public/assets/uploads/";
    public static String FILE_UPLOAD_PATH_PROD = "/root/uploads/";
    public static String FILE_UPLOAD_PATH = BASE_URL.startsWith("https")?"/root/uploads/":FILE_UPLOAD_PATH_DEV;
    public static String SUCCESS = "SUCCESS";
    public static String PASSWORD_POLICY = "Password must be 6 or more characters including lowercase,uppercase,numbers and special characters";
    public static String USER_SAVED = "User saved";
    public static String USER_SAVED_MESSAGE = "User saved successful";
    public static String USER_UPDATED_MESSAGE = "Account information updated successful";
    public static String ERROR_OCCURRED = "ERROR";
    public static String ERROR_OCCURED_MESSAGE = "Something went wrong";
    public static String VERIFICATION_CODE_EXPIRED = "Verification code expired,click resend";
    public static String VERIFICATION_CODE_NOTMATCH = "Verification code does not match";
    public static String USER_DELETED_MESSAGE = "User account deleted successful";
    public static String USER_NOTEXIST_MESSAGE = "User does not exist";
    public static String ERROR_DUPLICATE_VALUE = "Duplicate value";
    public static String ERROR_UNAUTHORIZE_OPERATION = "You are not authorized to perform this operation";
    public static String ERROR_EXISTS_MESSAGE = "Email,phone exists";
    public static String INVALID_EMAIL = "Invalid email address";
    public static String ERROR_WEAK_PASSWORD = "Password must be 8 characters containing lowercase,uppercase letter,numbers and at least one special character";
    public static String INVALID_CURRENT_PASSWORD = "Invalid current password";
    public static String ERROR_PASSWORD_NOTALLOWED = "New password matches current one,it is not allowed";
    public static String PASSWORD_UPDATED = "Password updated";
    public static String PASSWORD_UPDATED_MESSAGE = "Password updated succesful";
    public static String ERROR_NOTEXIST = "Not exist";
    public static String ERROR_VERIFICATION_CODE_FAILED = "Invalid verification code or have expired";
    public static String DATA_NOTFOUND = "Data not found";
    public static String DATA_NOTFOUND_MESSAGE = "Data not found";

    public static String ACCOUNT_ERROR = "Account error";
    public static String ERROR_ACCOUNT_VERIFY = "Your account is not verifed,check your email";
    public static String ACCOUNT_VERIFIED = "Account verified successful";
    public static String CHECK_VERIFICATION_CODE_MESSAGE = "Verification code sent to your email";
    public static String IS_DEACTIVATED = "is deactivated ";
    public static String ERROR_ACCOUNT_LOCKED = "Account locked";
    public static String ERROR_ACCOUNT_LOCKED_MESSAGE = "Your account is locked";
    public static String ERROR_LOGIN = "Invalid login";
    public static String ERROR_LOGIN_MESSAGE = "Your credentials is invalid";
    public static String ERROR_NOUSER_TYPE = "No user type";
    public static String ERROR_NOUSER_TYPE_MESSAGE = "No user type information found";
    public static String ERROR_ACCESS_DENIED = "Access denied";
    public static String ERROR_NOAUTH_HEADER_MESSAGE = "You don't have permission to access this resource.";
    public static String ERROR_INVALID_TOKEN = "Invalid token";
    //Destination
    public static String DESTINATION_SAVED_MESSAGE = "Destination information saved";
    public static String ERROR_DESTINATION_NOTEXIST = "Destination does not exist";
    public static String ERROR_DESTINATION_ALREADY_EXIST = "Destination already exist";
    public static String DESTINATION_DELETED_MESSAGE = "Destination deleted successful";
    //Stations
    public static String STATION_SAVED_MESSAGE = "Station information saved";
    public static String ERROR_STATION_NOTEXIST = "Station does not exist";
    public static String ERROR_STATION_ALREADY_EXIST = "Station already exist";
    public static String STATION_DELETED_MESSAGE = "Station deleted successful";
    //Schedule
    public static String SCHEDULE_SAVED_MESSAGE = "Schedule information saved";
    public static String ERROR_SCHEDULE_NOTEXIST = "Schedule does not exist";
    public static String ERROR_SCHEDULE_ALREADY_EXIST = "Schedule already exist";
    public static String SCHEDULE_DELETED_MESSAGE = "Schedule deleted successful";
    //Reservations
    public static String RESERVATION_SAVED_MESSAGE = "Reservation information saved";
    public static String ERROR_RESERVATION_NOTEXIST = "Reservation does not exist";
    public static String ERROR_RESERVATION_ALREADY_EXIST = "Reservation already exist";
    public static String RESERVATION_CANCELLED_MESSAGE = "Reservation cancelled successful";

    // Reviews
    public static String REVIEW_SAVED_MESSAGE = "Review saved successful";




}
