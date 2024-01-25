package projektii;
public class Pica extends Pizza {

    /* Lista e p�rb�r�sve bazuar n� indeksin e vektrorit
    
    0 -> Cheese 
    1 -> Peperoni
    2 -> Ullinj 
    3 -> Kerpudha

    */
    
    char size = 'm'; // n�se klienti harron t� zgjedhi madh�sin� e pic�s, programi do ti vendosi pic�s automatikisht madh�sin� mesatare 
    int[][] price = { // kemi t� b�jm� me nje vektor dy dimensional ku ruhen cmimet p�r secilin p�rb�r�s n� baz� t� madh�sis� s� pic�s

        {10,20,30,30},
        {100,200,300,300},
        {1000,2000,3000,3000}
    };
    
    String[] ingName = {"Cheese", "Peperoni", "Olives", "Mushrooms"};
    int[] ingredient = {0,0,0,0}; // jan� marr kat�r pica baz�, por q� klienti ka mund�sin� ti ndyshoj si do ai
    int[] normal = {1,1,0,0};
    int[] olivePizza = {1,1,1,0};
    int[] bulku = {500,500,500,500};
 
    Pica(String choice){ //n� var�si t� pic�s q� klienti zgjedh b�het p�rdit�simi i sasis� s� p�rb�r�sve n� TextField-et te Frame-i Porosia
        switch(choice){
            
            case "My pizza": 
            ingredient = ingredient;
            break;
            case "Normal":  
            ingredient = normal;
            break;
            case "Olive Pizza": 
            ingredient = olivePizza;
            break;
            case "Bulku":
            ingredient = bulku;
            break;
              
        }
    }

    public double llogaritShumen(){ // funksion -> gjen vleren totale te fatur�s q� duhet t� paguaj klienti
        double sum = 0;
        int i = 1; // n�se klienti harron t� zgjedhi madh�sin� e pic�s, programi do ti vendosi pic�s automatikisht madh�sin� mesatare 
        switch(size){ // indeksi i do t� mbaj madh�sin� e pic�s dhe j llojin e p�rb�r�sit
             case 's':
             i = 0;
             break;

             case 'm':
             i = 1;
             break;

             case 'l':
             i = 2;
             break;
        }
        for(int j = 0; j < ingredient.length; j++){
            sum = sum + ingredient[j] * price[i][j];           
        }
        return sum;
    }

    public String getIngridiends(int i){ //funksion -> kthen emrin e p�rb�r�sit n� var�si t� numrit t� indeksit
    String ind = "";
    if(i==0){
        ind = ind + ingredient[i];
    }
    else if(i==1){
        ind = ind + ingredient[i];
    }else if(i==2){
        ind = ind + ingredient[i];
    }else if(i==3){
        ind = ind + ingredient[i];
    }
    return ind;
    }

    public void resetPizza(){ // metod� -> fshin gjith� t� dh�nat p�r pic�n q� kemi shtuar
        for(int i = 0; i < ingredient.length;i++){
            ingredient[i] = 0;
        }
        size = 'm';
    }   
}
