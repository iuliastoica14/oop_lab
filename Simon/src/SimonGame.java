public class SimonGame {

    public static void main(String[] args)
    {
        SimonPanel simon=new SimonPanel();
        SimonModel simonModel=new SimonModel(simon);
        SimonController simonController=new SimonController(simonModel,simon);
    }
}
