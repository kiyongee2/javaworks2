package collection.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class MessageQueueTest {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		Message mail = new Message("sendMail", "�̼���");
		Message sms = new Message("sendSMS", "ȫ�浿");
		Message katalk = new Message("sendKakaotalk", "������");
		
		messageQueue.offer(mail);
		messageQueue.offer(sms);
		messageQueue.offer(katalk);
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
	}

}
