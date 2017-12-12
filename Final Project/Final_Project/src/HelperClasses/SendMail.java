/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 
/**
 *
 * @author BoyangWei
 */
public class SendMail {
    public static void Send(String address,String name){
        
      // 收件人电子邮箱
      String to = address;
 
      // 发件人电子邮箱
      String from = "wangyuchen2017@outlook.com";
 
      // 指定发送邮件的主机为 localhost
      String host = "smtp-mail.outlook.com";
      
      String port ="587";
      // 获取系统属性
      Properties properties = System.getProperties();
 
      // 设置邮件服务器
      properties.put("mail.smtp.host",host );
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.port", port);
      properties.put("mail.smtp.starttls.enable", true);
 
      // 获取默认session对象
      Session session = Session.getDefaultInstance(properties,new Authenticator(){
          public PasswordAuthentication getPasswordAuthentication()
          {
           return new PasswordAuthentication("wangyuchen2017@outlook.com", "WSwyc2017!"); //发件人邮件用户名、密码
          }
         });
      try{
         // 创建默认的 MimeMessage 对象
         MimeMessage message = new MimeMessage(session);
 
         // Set From: 头部头字段
         message.setFrom(new InternetAddress(from));
 
         // Set To: 头部头字段
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));
 
         // Set Subject: 头部头字段
         message.setSubject("Thanks for sign up, "+name);
 
         // 设置消息体
         message.setText("Having fun purchasing!");
         
 
         // 发送消息
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
    }
}
