//Lara Geraseev
import java.util.ArrayList;
import java.util.List;

public class Gest {
    private Pessoa p1;
    private List<Pessoa> bdPs = new ArrayList<Pessoa>();
    public List<Pessoa> getbdPs(){
        return bdPs;
    }   
    public Pessoa cadPs(Pessoa p1){
        if(consPsCod(p1) == null){
            bdPs.add(p1);
            return p1;
        }
        else{
            return null;
        }
    }
    public Pessoa consPsCod(Pessoa p1){
        for(int i = 0; i < bdPs.size(); i++){
            if(p1.getCel() == bdPs.get(i).getCel() || p1.getFixo() == bdPs.get(i).getFixo()){
                return bdPs.get(i);
            }
        }
        return null;
    }     
    public Pessoa removerPs(Pessoa p1){
        p1 = consPsCod(p1);
        if(p1 != null){
            bdPs.remove(p1);
            return p1;
        }
        else{
            return null;
        }
    }        
}
