import building.Address;
import building.Building;
import building.Floor;
import building.Room;

public class BuildingCreator {

	public static void main(String[] args) {
		Room room = new Room(10);

		Floor floor = new Floor();
		floor.addRoom(room);

		Building building = new Building();
		building.addFloor(floor);
		building.setAddress(new Address("turism", "cluj",7));
		room.setNumber(300);
		
		System.out.println(building.getFloors().get(0).rooms[0].getNumber());
		
		System.out.println(building);
	}
}
