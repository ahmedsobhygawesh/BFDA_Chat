/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Passant
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    private String fromUser;
    private Vector<String> toUsers;
    private String messageContent;
    private String messageFontColor;
    private String messageFontFamily;
    private String messageFontSize;
    private boolean isItalic;
    private boolean isBold;
    private LocalDateTime messageDate;


    public boolean isItalic() {
        return isItalic;
    }

    public void setItalic(boolean italic) {
        isItalic = italic;
    }

    public boolean isBold() {
        return isBold;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public Vector<String> getToUsers() {
        return toUsers;
    }

    public void setToUsers(Vector<String> toUsers) {
        this.toUsers = toUsers;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageFontColor() {
        return messageFontColor;
    }

    public void setMessageFontColor(String messageFontColor) {
        this.messageFontColor = messageFontColor;
    }

    public String getMessageFontFamily() {
        return messageFontFamily;
    }

    public void setMessageFontFamily(String messageFontFamily) {
        this.messageFontFamily = messageFontFamily;
    }

    public String getMessageFontSize() {
        return messageFontSize;
    }

    public void setMessageFontSize(String messageFontSize) {
        this.messageFontSize = messageFontSize;
    }

    public LocalDateTime getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(LocalDateTime messageDate) {
        this.messageDate = messageDate;
    }

}
