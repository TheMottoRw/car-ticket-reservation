package helper;

import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;

public class MailerService {
    MailerClient mailerClient;
    String body;

    public MailerService(MailerClient mailerClient) {
        this.mailerClient = mailerClient;

    }


    public void sendEmail(String to, String subject, String body, String replyTo, String cc) {
        Email email = new Email()
                .setSubject(subject)
                .setFrom("APARWA <contact.aoltd@gmail.com>")
                .addReplyTo(replyTo.trim().equals("")?to:replyTo)
                .addTo(to)
                // adds attachment
//                .addAttachment("attachment.pdf", new File("/some/path/attachment.pdf"))
                // adds inline attachment from byte array
//                .addAttachment("data.txt", "data".getBytes(), "text/plain", "Simple data", EmailAttachment.INLINE)
                // adds cid attachment
//                .addAttachment("image.jpg", new File("/some/path/image.jpg"), cid)
                // sends text, HTML or both...
//                .setBodyText(subject)
                .setBodyHtml(body);
        if(!cc.equals("")){
            email.addCc(cc);
        }

        mailerClient.send(email);

    }
}
