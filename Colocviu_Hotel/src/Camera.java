import java.util.ArrayList;

public class Camera{
    private int nrId;
    private int capacitate;
    private double pret;
    private double pret_special;
    private ArrayList<Client> oaspeti;

    Camera(int nrId,int capacitate,double pret,double pret_special,ArrayList<Client> oaspeti){
        this.nrId=nrId;
        this.capacitate=capacitate;
        this.pret=pret;
        this.pret_special=pret_special;
        this.oaspeti=oaspeti;
    }

    public int getCapacitate(){return capacitate;}
    public int getNrID(){return nrId;}
    public ArrayList<Client> getOaspeti(){return oaspeti;}

    public double pretCamera(int nopti,double discount)
    {
        if(capacitate==1)
            return pret_special*nopti-(pret_special*nopti*discount)/100;
        else
            return pret*(oaspeti.size()+1)*nopti-(pret*(oaspeti.size()+1)*nopti)/100;
    }


    public boolean isFull()
    {
        if(oaspeti.size()==capacitate-1)
            return true;
        return false;
    }
}
