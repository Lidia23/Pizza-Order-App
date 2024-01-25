package projektii;
public class Pica extends Pizza {

    /* Lista e përbërësve bazuar në indeksin e vektrorit
    
    0 -> Cheese 
    1 -> Peperoni
    2 -> Ullinj 
    3 -> Kerpudha

    */
    
    char size = 'm'; // nëse klienti harron të zgjedhi madhësinë e picës, programi do ti vendosi picës automatikisht madhësinë mesatare 
    int[][] price = { // kemi të bëjmë me nje vektor dy dimensional ku ruhen cmimet për secilin përbërës në bazë të madhësisë së picës

        {10,20,30,30},
        {100,200,300,300},
        {1000,2000,3000,3000}
    };
    
    String[] ingName = {"Cheese", "Peperoni", "Olives", "Mushrooms"};
    int[] ingredient = {0,0,0,0}; // janë marr katër pica bazë, por që klienti ka mundësinë ti ndyshoj si do ai
    int[] normal = {1,1,0,0};
    int[] olivePizza = {1,1,1,0};
    int[] bulku = {500,500,500,500};
 
    Pica(String choice){ //në varësi të picës që klienti zgjedh bëhet përditësimi i sasisë së përbërësve në TextField-et te Frame-i Porosia
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

    public double llogaritShumen(){ // funksion -> gjen vleren totale te faturës që duhet të paguaj klienti
        double sum = 0;
        int i = 1; // nëse klienti harron të zgjedhi madhësinë e picës, programi do ti vendosi picës automatikisht madhësinë mesatare 
        switch(size){ // indeksi i do të mbaj madhësinë e picës dhe j llojin e përbërësit
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

    public String getIngridiends(int i){ //funksion -> kthen emrin e përbërësit në varësi të numrit të indeksit
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

    public void resetPizza(){ // metodë -> fshin gjithë të dhënat për picën që kemi shtuar
        for(int i = 0; i < ingredient.length;i++){
            ingredient[i] = 0;
        }
        size = 'm';
    }   
}
