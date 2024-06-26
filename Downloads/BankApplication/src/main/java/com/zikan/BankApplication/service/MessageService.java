package com.zikan.BankApplication.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.hibernate.pretty.MessageHelper;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final JavaMailSender javaMailSender;
//    private final AccountUserService accountUserService;

//    public MessageService(JavaMailSender javaMailSender, AccountUserService accountUserService) {
//        this.javaMailSender = javaMailSender;
//        this.accountUserService = accountUserService;
//    }

    public void loginNotification(String receiver, String message) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "utf-8");
        messageHelper.setTo(receiver);
        messageHelper.setSubject("Login Notification");
        messageHelper.setText(message);

        javaMailSender.send(messageHelper.getMimeMessage());

         /*
        String[] addresses = new String[]{"sruffy07@gmail.com", "skytecomputer@gmail.com", receiver};
        List<String> addressList = Arrays.asList(addresses);
        addressList.forEach(add -> {
            AccountUser user = accountUserService.getAccountUserByUsername(add).getBody();
            assert user != null;
            String text = "Dear "+ user.getFirstName() +"\n" +
                    "There has been a successful login into your Banking Account. Please if you did not log in" +
                    " call us on the following number: 01-2245845, 08004455454\n"
                    + "Thank you for Banking with Us.";
            try{
                messageHelper.setTo(add);
                messageHelper.setText(text);
                javaMailSender.send(messageHelper.getMimeMessage());
            }catch (MessagingException messagingException){
                System.out.println(messagingException.getMessage());
            }
        });
        */
    }
}
