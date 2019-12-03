package com.example.stline.bot.executor;

import com.example.stline.bot.Bot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
@Slf4j
public class DispatcherBot extends Bot {

    @Override
    public Integer sendMessageChannel(String message) throws  TelegramApiException {
        SendMessage sendMessage= new SendMessage().setChatId(getChannelChatId()).setText(message);
        return execute(sendMessage).getMessageId();
    }

    @Override
    public void editMessageChannel(String message, Integer messageId) throws TelegramApiException {
        EditMessageText editMessageText= new EditMessageText()
                .setChatId(getChannelChatId())
                .setMessageId(Math.toIntExact(messageId))
                .setText(message);
        execute(editMessageText);
    }

    @Override
    public void removeMessageChannel(Integer messageId) throws TelegramApiException {
        DeleteMessage deleteMessage = new DeleteMessage()
                .setChatId(getChannelChatId())
                .setMessageId(Math.toIntExact(messageId));
        execute(deleteMessage);
    }


    //example for GET
//    @Override
//    public Long sendMessage(String message) throws IOException, TelegramApiException {
//        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s&entities=messageEntityItalic";
//        urlString = String.format(urlString, super.getBotToken(), super.getChannelChatId(), message);
//        BufferedReader bufferedReader = urlConn(urlString);
//        String inputLine;
//        Long message_id = null;
//        SendMessage sendMessage= new SendMessage();
//        sendMessage.setChatId(getChannelChatId());
//        sendMessage.setText(message);
//        execute(sendMessage);
//        while ((inputLine = bufferedReader.readLine()) != null) {
//            int index = inputLine.indexOf("message_id\"");
//            int firstIndex = inputLine.indexOf(":", index) + 1;
//            int lastIndex = inputLine.indexOf(",\"chat\"");
//            message_id = Long.parseLong(inputLine.substring(firstIndex, lastIndex));
//        }
//        bufferedReader.close();
//        return message_id;
//    }
//
//    @Override
//    public void editMessage(String message, Long messageId) throws IOException {
//        String urlString = "https://api.telegram.org/bot%s/editMessageText?chat_id=%s&message_id=%s&text=%s";
//        urlString = String.format(urlString, super.getBotToken(), super.getChannelChatId(), messageId, message);
//        urlConn(urlString);
//    }
//
//    @Override
//    public void removeMessage(Long id) throws IOException {
//        String urlString = "https://api.telegram.org/bot%s/deleteMessage?chat_id=%s&message_id=%s";
//        urlString = String.format(urlString, super.getBotToken(), super.getChannelChatId(), id);
//        urlConn(urlString);
//    }
//
//    private BufferedReader urlConn(String urlString) throws IOException {
//        log.info(urlString);
//        URL url = new URL(urlString);
//        URLConnection conn = url.openConnection();
//        return new BufferedReader(new InputStreamReader(conn.getInputStream()));
//    }
}
