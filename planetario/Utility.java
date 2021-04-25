package planetario;

import java.util.ArrayList;
import java.util.Scanner;

public class Utility 
{

	    Pianeta Terra= new Pianeta();

	    int i;
	    double a;
	    int b;
	    int c;
	    int n=0;
	    int w=1;
	    int l=1;
	    int j;
	    String nome; 
	    String opianeta;
	    String codice;
	    String rottapianeta;
	    String rottastella;
	    double sommaMassa=0;
	    double sommaPosizioneX=0;
	    double sommaPosizioneY=0;
	    double centroDiMassaX=0;
	    double centroDiMassaY=0;
	    double sommaPesataPosizioniX;
	    double sommaPesataPosizioniY;
	  
	    
	    
	    Scanner lettore= new Scanner(System.in);
	    Scanner lettorenome= new Scanner(System.in);
	 

	    public void aggiungerePianeta(Stella S)
	    {

	        System.out.println("Digitare nome:");
	        nome = lettorenome.nextLine();

	        System.out.println("Digitare massa:");
	        a= lettore.nextInt();

	        System.out.println("Digitare posizione(x):");
	        b= lettore.nextInt();

	        System.out.println("Digitare posizione(y):");
	        c= lettore.nextInt();

	        codice= "P"+(w++);
	        System.out.println("Il codice univoco è:"+codice);
	        Pianeta Pian =new Pianeta(b,c,a,nome,codice); 

	        S.getListaPianeti().add(Pian);

	    }

	    public void aggiungereLuna(Stella S)
	    { 
	    	System.out.println("Digitare nome:");
			nome = lettorenome.nextLine();
			
			System.out.println("Digitare massa: ");
			a= lettore.nextInt();
			
			System.out.println("Digitare posizione(x):");
			b= lettore.nextInt();
			
			System.out.println("Digitare posizione(y):");
			c= lettore.nextInt();
			
			System.out.println("Digitare il pianeta attorno a cui orbita");
			opianeta= lettorenome.nextLine();
			
			codice= "L"+(l++);
			System.out.println("Il codice univoco è:"+codice);
			
			Luna La =new Luna(b,c,a,opianeta,nome,codice);
			 for(Pianeta p:S.getListaPianeti())
			 {
				if (p.getNome().equalsIgnoreCase(opianeta))
				{
					p.getListaLune().add(La);
				}
			 }
	    }

        public void aggiungereStella(Stella S)
        {
        	if(n==0){
        		n++;
        	System.out.println("Digitare nome:");
		    nome = lettorenome.nextLine();
		
		    System.out.println("Digitare massa: ");
		    a= lettore.nextInt();
		    codice= "S"+(1);
			System.out.println("Il codice univoco è:"+codice);
			
		    S.setNome(nome); 
		    S.setMassa(a);
		    S.setCodice(codice);
		    }
        	else
        	{
        		System.out.println("La stella è già stata inserita");
        	}
        }

        public void rimuoverePianeta(Stella S) 
        {
        
            System.out.println("Digitare nome:");
            nome = lettorenome.nextLine();
            Pianeta daRimuovere = null;

            if(listaContieneNomeP(S.getListaPianeti(), nome))
            {
            for(Pianeta p:S.getListaPianeti()) 
            {
                if (p.getNome().equalsIgnoreCase(nome))
                { 
                    daRimuovere = p;
                    System.out.println("Il pianeta è stato rimosso");
                }
            }
            S.getListaPianeti().remove(daRimuovere);
            }
            else 
            {
                System.out.println("Nome inserito non valido");
            }
        }
            
        public void rimuovereLuna(Stella S) 
        {
        	{
                System.out.println("Digitare nome: ");
                nome = lettorenome.nextLine();
                Luna daRimuovere = null;


            for(Pianeta p: S.getListaPianeti())
            { if(listaContieneNomeL(p.getListaLune(), (nome)))
                {
                for(Luna la: p.getListaLune()) 
                {
                    if (la.getNome().equalsIgnoreCase(nome))
                    { 
                        daRimuovere = la;
                        System.out.println("La luna è stata rimossa");

                    }
                    }
                p.getListaLune().remove(daRimuovere);
                }
                else 
                {
                    System.out.println("Nome inserito non valido");
                 }
            }
        	}
        	}
       
        
        public void luneCheOrbitano(Stella S) 
        { 
        	{
        		System.out.println("Digitare Pianeta: ");
        		nome = lettorenome.nextLine();
        		
        		for(Pianeta p:S.getListaPianeti()) 
        		{
        			if (p.getNome().equalsIgnoreCase(nome))
        			{ 
        				for(Luna lun:p.getListaLune()) 
        				{
        					System.out.println(lun.getNome());
        				}
        				}
        			else System.out.println("Nome inserito non valido");
        		}
        	}
        }
        
        public boolean listaContieneNomeP(ArrayList<Pianeta> ListaPian,String nome) 
        {
        	Boolean trovato= false;
        	for(Pianeta l:ListaPian) 
        	{
        		if(l.getNome().equalsIgnoreCase(nome))
        			trovato=true;
        	}
        return trovato;
        }

        public boolean listaContieneNomeL(ArrayList<Luna> listaLun,String nome) 
        {
        	Boolean trovato= false;
        	for(Luna l:listaLun) 
        	{
        		if(l.getNome().equalsIgnoreCase(nome))
        			trovato=true;
        	}
        return trovato;
        }
        
        public void presenzaNelSistema(Stella S,ArrayList<Pianeta> listaPian)
        {
        	System.out.println("Digitare nome: ");
			nome = lettorenome.nextLine();
			boolean esiste=false;
			if(S.getNome()==nome) 
			{
				esiste=true;
			}
			else if(listaContieneNomeP(listaPian,nome)) 
				  {
					esiste=true;
				  }
				else 
					for(Pianeta p:listaPian)
					{
						if(listaContieneNomeL(p.getListaLune(), nome)) 
						{
							esiste=true;
						}
					}
				if (esiste) {System.out.println("Il corpo cercato è presente nel sistema");}
				else {System.out.println("Il corpo cercato non è presente nel sistema");}
        
        }
        
        public void menu1()
        {
        	System.out.println("\nDigitare il codice corrispondente alla funzione desiderata\n"
    				+ "1)Aggingi un corpo\n"
    				+ "2)Rimuovi un corpo\n"
    				+ "3)Trova se un corpo è presente nel sistema\n"
    				+ "4)Trova quali lune orbitano attorno a un pianeta\n"
    				+ "5)Trova il percorso dalla stella alla luna\n"
    				+ "6)Calcolo del centro di massa del sistema\n"
    				+ "0)Terminare il programma\n");
        }

        public void menu2()
{
        	System.out.println("\nDigitare il codice corrispondente alla funzione desiderata\n"
					+ "1)Aggiungere stella\n"
					+ "2)Aggiungere pianeta\n"
					+ "3)Aggiungere luna\n"
					+ "4)ritorna al menu precedente\n");

        }

        public void menu3()
        {
        	System.out.print("\nDigitare il codice corrispondente alla funzione desiderata\n"
    				+ "1)Rimuovere pianeta\n"
    				+ "2)Rimuovere luna\n"
    				+ "3)ritorna al menu precedente\n");
        }


        public void percorsoLunaStella(Stella S) 
{
	System.out.println("Digitare la luna da cui si parte: ");
	nome = lettorenome.nextLine();
	
	for(Pianeta p: S.getListaPianeti())
        {if(listaContieneNomeL(p.getListaLune(), (nome)))
        {
        for(Luna la: p.getListaLune()) 
          {
            if (la.getNome().equalsIgnoreCase(nome))
            {
            	rottapianeta=la.getPianeta();
            	System.out.println(S.getNome()+">"+rottapianeta+">"+nome);
            }
          }
        }
        else System.out.println("La luna inserita non è valida");}
}
 
        public void calcoloCentroDiMassa(Stella S) 
        {
        	for(Pianeta p: S.getListaPianeti())
	         {
        		sommaPesataPosizioniX+=(p.getMassa())*(p.getPosizioneX());
        		sommaPesataPosizioniY+=(p.getMassa())*(p.getPosizioneY());
        		sommaMassa+=(p.getMassa());
        		for(Luna lu: p.getListaLune())
	            {
        			sommaPesataPosizioniX+=(lu.getMassa())*(lu.getPosizioneX());
            		sommaPesataPosizioniY+=(lu.getMassa())*(lu.getPosizioneY());
            		sommaMassa+=(lu.getMassa());
	            }
	         }
	        sommaMassa+=S.getMassa();
        	centroDiMassaX=(sommaPesataPosizioniX)/(sommaMassa);
        	centroDiMassaY=(sommaPesataPosizioniY)/(sommaMassa);
        	System.out.println("Il centro di massa è: "+centroDiMassaX+","+centroDiMassaY);
        }
        }


