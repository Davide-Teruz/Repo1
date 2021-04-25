package planetario;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int i;
		int j;
		Utility Util= new Utility();
		Stella Sole= new Stella();
		Scanner lettore= new Scanner(System.in);
		Scanner lettorenome= new Scanner(System.in);
		
		
		do 
		{
			Util.menu1();
			i=lettore.nextInt();
		
		switch(i) { 
		//aggiungere un corpo
		case 1: 
		{
			Util.menu2();			 
			j=lettore.nextInt();
			
			switch(j) 
			{ 
			//aggiungere stella
			case 1:{Util.aggiungereStella(Sole);}
				break;
			
			//aggiungere pianeta	
			case 2: {Util.aggiungerePianeta(Sole);}
				break;
			
			//aggiungere luna
			case 3: {Util.aggiungereLuna(Sole);}
			    break;
			case 4: ;
				break;
			}
		}
		break;
			
		//rimuovere corpo celeste
		case 2: 
		{
			Util.menu3();
			j=lettore.nextInt();
	
		     switch(j) 
		
		              { 
		                //rimuovere pianeta
		                case 1: {Util.rimuoverePianeta(Sole);}  
		                break;
		            
		                //rimuovere luna
		                case 2: { Util.rimuovereLuna(Sole);}
		                break;
		                case 3:
		            	break;
		              }           
		   break;
		}
		
	   //presenza nel sistema solare di un corpo
		case 3: { Util.presenzaNelSistema(Sole,Sole.getListaPianeti());}
	        break;
		
		//lune che orbitano attorno a un pianeta
		case 4: {Util.luneCheOrbitano(Sole);}
		    break;
		
		//percorso luna stella
		case 5: {Util.percorsoLunaStella(Sole);}             
		   break;
		
		//centro di massa
		case 6: {Util.calcoloCentroDiMassa(Sole);}  
			break;
		}
	}
		while (i!=0);
		}
	}