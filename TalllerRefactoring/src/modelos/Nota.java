package modelos;
import java.util.ArrayList;

public class Nota {
	private double nexamen;
    private double ndeberes; 
    private double nlecciones; 
    private double ntalleres;
    private ArrayList<Paralelo> paralelos;
    
    public double calcularNota(Paralelo p) {
    	double notaTeorico=0;
    	double notaPractico=0;
    	for(Paralelo par:paralelos){
    		if(p.equals(par)) {
    			notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
    	        notaPractico=(ntalleres)*0.20;
    	      
    		}
    	}
    	return notaTeorico+notaPractico;
    	
    }
}
