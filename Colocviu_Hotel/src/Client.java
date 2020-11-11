import java.util.Date;

public class Client extends Persoana{
    private int nr_camera;
    private Date1 checkin;
    private Date1 checkout;

    Client(int ID, String nume, String numar_telefon,int nr_camera, Date1 checkin, Date1 checkout)
    {
        super(ID,nume,numar_telefon);
        this.nr_camera=nr_camera;
        this.checkin=checkin;
        this.checkout=checkout;

    }

    public Date1 getCheckin(){return checkin;}

    public Date1 getCheckout(){return checkout;}


    public String toString(){
        return super.toString()+ "Camera: "+nr_camera+"\nDate: "+checkin+" - "+checkout+'\n';
    }

    public int getNr_camera(){ return nr_camera;}
}
