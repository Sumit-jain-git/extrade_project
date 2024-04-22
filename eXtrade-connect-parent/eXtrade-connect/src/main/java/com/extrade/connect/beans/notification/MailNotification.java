package com.extrade.connect.beans.notification;
import com.extrade.connect.beans.Attachment;
import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class MailNotification extends Notification{
    private String subject;
    private List<Attachment> attachments;
}
