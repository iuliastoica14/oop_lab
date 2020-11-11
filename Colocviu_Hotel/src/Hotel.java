import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

public class Hotel {
    public ArrayList<Angajat> angajati;
    public ArrayList<Client> clienti;
    public ArrayList<Camera> camere;

    Hotel(ArrayList<Angajat> angajati, ArrayList<Client> clienti, ArrayList<Camera> camere)
    {
        this.angajati=angajati;
        this.camere=camere;
        this.clienti=clienti;
    }

    public void addClient(Client c)
    {
        clienti.add(c);
    }

    public void addAngajat(Angajat c)
    {
        angajati.add(c);
    }


    public double facturaClient(Client c){
        int nopti=c.getCheckout().getZi()-c.getCheckin().getZi();
        for (Camera camera : camere) {
            if(camera.getNrID()==c.getNr_camera()){
                return  camera.pretCamera(nopti,0.0);
            }
        }
        return 0;
    }

    public void sortAngajati(){
        Collections.sort(angajati);
    }

    public void sortClienti(){
        Collections.sort(clienti);
    }

    public ArrayList<Camera> camereLibere()
    {
        for(Camera i:camere)
            if(i.getOaspeti().size()==0)



    }

    public void statistici()
    {
        int libera=0;
        int ocupat=0;
        for(Camera i:camere)
            if(i.isFull())
                libera++;
            else
                ocupat++;
        System.out.println("Camere libere: "+libera+"\nCamere ocupate: "+ocupat);
    }



}
