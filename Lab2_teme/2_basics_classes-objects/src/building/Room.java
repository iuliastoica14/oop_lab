package building;

public class Room {

	private Integer number;

	public Room(Integer number)
	{
		this.number=number;
	}

	public Room() {
		number=0;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}
}
