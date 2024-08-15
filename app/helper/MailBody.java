package helper;

public class MailBody {
    public static String verificationCode(String code,String expiration){
        String body="<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            padding: 20px;\n" +
                "            margin: 0;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            margin: 0 auto;\n" +
                "            background-color: #ffffff;\n" +
                "            padding: 30px;\n" +
                "            border-radius: 5px;\n" +
                "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "        }\n" +
                "        h1 {\n" +
                "            color: #333333;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        p {\n" +
                "            color: #666666;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        .verification-code {\n" +
                "            background-color: #f8f8f8;\n" +
                "            padding: 15px;\n" +
                "            font-size: 24px;\n" +
                "            text-align: center;\n" +
                "            border-radius: 5px;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        .footer {\n" +
                "            text-align: center;\n" +
                "            color: #999999;\n" +
                "            font-size: 12px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <h1 style='color:'>Verify account Verification</h1>\n" +
                "    <p>Please use the following verification code to complete your registration:</p>\n" +
                "    <div class=\"verification-code\"><b>"+code+"</b></div>\n" +
                "    <p><i>This code will expire after "+expiration+"</i></p>\n" +
                "    <p>If you did not request this code, you can safely ignore this email.</p>\n" +
                "    <p>Thank you,<br>AON Ltd</p>\n" +
                "</div>\n" +
                "<div class=\"footer\">\n" +
                "    This email was sent to you by AON Ltd. Please do not reply to this email.\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n";
        return body;
    }
    public static String verificationCodeHtml(String code,String expiration){
        String body="<html><body>Your code is <b>34534</b>" +
                "</body>" +
                "</html>";
        return body;
    }
    public static String contactUsForm(String name,String subject,String message){
        String body="<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            padding: 20px;\n" +
                "            margin: 0;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            margin: 0 auto;\n" +
                "            background-color: #ffffff;\n" +
                "            padding: 30px;\n" +
                "            border-radius: 5px;\n" +
                "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "        }\n" +
                "        h3 {\n" +
                "            color: #333333;\n" +
                "            margin-bottom: 20px;\n" +
                "            font-size: 18px;\n" +
                "        }\n" +
                "        p {\n" +
                "            color: #666666;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        .message {\n" +
                "            background-color: #f8f8f8;\n" +
                "            padding: 15px;\n" +
                "            font-size: 15px;\n" +
                "            text-align: center;\n" +
                "            border-radius: 5px;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        .footer {\n" +
                "            text-align: center;\n" +
                "            color: #999999;\n" +
                "            font-size: 12px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <h3 style='color:black;font-weight:bold'>"+subject+"</h3>\n" +
                "    <div class=\"message\">"+message+"\n\n <p style='font-size:17px;font-weight:bold'>"+name+"</p>\n</div>\n" +
                "</div>\n" +
                "<div class=\"footer\">\n" +
                "    This email was sent from contact us form.\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n";
        return body;
    }
    public static String mailContent(String subject,String message){
        String body="<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            padding: 20px;\n" +
                "            margin: 0;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            margin: 0 auto;\n" +
                "            background-color: #ffffff;\n" +
                "            padding: 30px;\n" +
                "            border-radius: 5px;\n" +
                "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "        }\n" +
                "        h3 {\n" +
                "            color: #333333;\n" +
                "            margin-bottom: 20px;\n" +
                "            font-size: 18px;\n" +
                "        }\n" +
                "        p {\n" +
                "            color: #666666;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        .message {\n" +
                "            background-color: #f8f8f8;\n" +
                "            padding: 15px;\n" +
                "            font-size: 15px;\n" +
                "            text-align: center;\n" +
                "            border-radius: 5px;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        .footer {\n" +
                "            text-align: center;\n" +
                "            color: #999999;\n" +
                "            font-size: 12px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <h3 style='color:black;font-weight:bold'>"+subject+"</h3>\n" +
                "    <div class=\"message\">"+message+"\n\n <p style='font-size:17px;font-weight:bold'></p>\n</div>\n" +
                "</div>\n" +
                "<div class=\"footer\">\n" +
                "    Best Regards,<br>AON Ltd.\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n";
        return body;
    }
    
}
