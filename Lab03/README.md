## Esercizio 1 
Dopo aver fatto il fork del progetto relativo al laboratorio 3, creare in Java una semplice applicazione dotata 
di  interfaccia  grafica  che  funga  da  correttore  ortografico  di  parole:  dato  un  testo  in  input,  il  programma 
stampa  le  parole  errate,  il  numero  di  errori,  e  il  tempo  impiegato  per  effettuare  il  controllo  ortografico. 
In  particolare,  l’utente  inserisce  un  testo  che  vuole  verificare  nella  casella  di  testo  in  alto.  Dopo  aver 
selezionato  la  lingua  da  utilizzare,  fa  click  sul  bottone  Spell  Check  per  avviare  il  controllo  ortografico.  Si 
suggerisce  di  filtrare  il  testo  ricevuto  in  input  trasformandolo  tutto  in  minuscolo  ed  eliminando  i  segni  di 
punteggiatura. Nell’area di testo sottostante, viene restituito l’elenco delle parole errate. Utilizzare il pulsante 
Clear Text per cancellare il testo inserito da entrambe le caselle di testo. 

```JAVA
//Nota1: per eliminare tutti i segni di punteggiature utilizzare il metodo 
thisIsAString.replaceAll(“[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", "")
//Nota2: sviluppare l’applicazione secondo il pattern 
Model View Controller (MVC)
```
Di seguito, una possibile traccia per la soluzione: 
1. Creare l’interfaccia grafica con *SceneBuilder. Associare al bottone Spell Check il metodo  
doSpellCheck()* ed al bottone *Clear Text* il metodo *doClearText()*. 
2. Creare il package *it.polito.tdp.spellchecker.model* ed una nuova classe (Java Bean)  
denominata  *RichWord*.  Ogni  istanza  di  questa  classe  conterrà  una  parola  del  testo  in  input,  e 
l’indicazione se tale parola è corretta o meno (utilizzare un boolean). 
3. Definire nel package it.polito.tdp.spellchecker.model una nuova classe *Dictionary*,  
il modello dell’applicazione, in cui definire i seguenti metodi: 
```JAVA
 public void loadDictionary(String language)  
 ```
Questo  metodo  permette  di  caricare  in  memoria  il  dizionario  della  lingua  desiderata.  A  questo 
proposito,  utilizzare  i  file  *Italian.txt*  e  *English.txt*  nella  cartella  *src/main/resources*.  I 
file contengono una parola per riga. Salvare le parole del dizionario in una struttura dati appropriata. 
Di seguito viene riportato un esempio di codice per leggere le parole da file: 

```JAVA
try { 
 FileReader fr = new FileReader("English.txt"); 
BufferedReader br = new BufferedReader(fr); 
  String word; 
  while ((word = br.readLine()) != null) { 
// Aggiungere parola alla struttura dati    
  } 
br.close(); 
    
  } catch (IOException e){ 
  System.out.println("Errore nella lettura del file");   
} 
  
public List<RichWord> spellCheckText(List<String> inputTextList) 
```

Questo metodo esegue il controllo ortografico sul testo in input (rappresentato da una lista di parole) 
e restituisce una lista di *RichWord*. Per ogni  elemento di *inputTextList*, *spellCheckText* 
controlla se la parola è presente nel dizionario. In caso affermativo, la RichWord corrispondente 
sarà corretta, altrimenti sarà errata. La lista delle RichWord viene restituita in output. 
1. Implementare nel model tutta la logica dello *spell checking*, il controller si limita alla gestione  dell’interfaccia e richiama i metodi definiti nel model.

## Esercizio 2
Modificare l’algoritmo di ricerca del metodo *spellCheckText* implementando una ricerca lineare ed una 
dicotomica.  Si  consiglia  di  creare  nel  model  due  nuovi  metodi 
che sostituiscono *spellCheckText*: *spellCheckTextLinear* e *spellCheckTextDichotomic*, dove il 
primo utilizza una ricerca lineare, mentre il secondo quella dicotomica. 
Confrontare  le  differenze  di  prestazioni  tra  le  due  implementazioni  utilizzando  sia  un  *ArrayList*  ed  una 
*LinkedList*. Riempire la tabella nella pagina seguente con i tempi di esecuzione per ciascun caso. 
Quale implementazione utilizza il metodo contains di *Java List*? 

**Ricerca lineare** (source Wikipedia): 
Iterare  su  tutti  gli  elementi  del  vocabolario  a  partire  dal  primo.  La  ricerca  termina  quando  viene  trovato 
l’elemento cercato o si raggiunge l’ultimo, nel caso in cui l’elemento cercato non sia presente nella lista. 

**Ricerca dicotomica** (source Wikipedia): 
Sapendo  che  il  vocabolario  è  ordinato  alfabeticamente,  l'idea  è  quella  di  non  iniziare  la  ricerca  dal  primo 
elemento, ma da quello centrale, cioè a metà del dizionario. Si confronta questo elemento con quello cercato: 
- Se corrisponde, la ricerca termina indicando che l'elemento è stato trovato 
- se  è  superiore,  la  ricerca  viene  ripetuta  sugli  elementi  precedenti  (ovvero  sulla  prima  metà  del 
dizionario), scartando quelli successivi 
- se  è  inferiore,  la  ricerca  viene  ripetuta  sugli  elementi  successivi  (ovvero  sulla  seconda  metà  del 
dizionario), scartando quelli precedenti. 
Il procedimento viene ripetuto iterativamente fino a quando o si trova l’elemento cercato, o tutti gli elementi 
vengono scartati. In quest’ultimo caso la ricerca termina indicando che il valore non è stato trovato.
