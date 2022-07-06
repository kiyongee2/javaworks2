package object.equals;

public class Member {
	String id;
	
	Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;  //������ �Ű��� id�� ��ġ���� ������
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
