# LAB 01
## Parole
### Esercizio 1
Lo scopo del programma è quello di permettere all’utente di:

● Inserire delle parole in una struttura dati (tramite il bottone Inserisci)

● Visualizzare le parole inserite nell’area di testo sottostante in ordine alfabetico

● Permettere la cancellazione di tutte le parole tramite il bottone Reset

A tal fine si richiede di completare la classe Parole presente nel package 
it.polito.tdp.Lab01.model, e di utilizzare i metodi di tale classe a partire dal controller 
dell’applicazione (FXMLController). La classe Parole, definisce la struttura dati 
utilizzata dall’applicazione e offre i seguenti metodi (da implementare):

***public void addParola(String p)***: consente di inserire una parola nella 
struttura dati

***public List<String> getElenco()***: ritorna l’elenco di parole correnti inserite 
ordinate alfabeticamente
  
***public void reset()***: elimina tutte le parole dalla struttura dati.
  
I metodi ***addParola(String p)*** e ***getElenco()*** dovranno essere richiamati nell’event 
handler associato al bottone Inserisci (metodo doInsert della classe 
FXMLController), mentre il metodo reset() dovrà essere richiamato dall’event handler 
del bottone Reset (metodo doReset).
  
### Esercizio 2
Modificando il file Scene.fxml e le classi ***Parole*** e ***FXMLController***, integrare il 
programma con le seguenti funzionalità:
1. Aggiungere, di fianco al bottone Reset, il bottone Cancella, che permette di 
eliminare dalla struttura dati solamente la parola selezionata nell’area di testo. 
Implementare l’opportuno metodo aggiuntivo nella classe Parole, che dovrà 
essere richiamato all’evento di pressione del bottone Cancella.
  
2. Aggiungere, sotto all’area di testo per la visualizzazione delle parole, un’ulteriore 
area di testo per visualizzare i tempi di esecuzione di ciascuna operazione 
eseguita dal programma (utilizzare la funzione ***System.nanoTime()***).
  
3. Creare due versioni della classe Parole, basandole rispettivamente su una 
***LinkedList*** e un ***ArrayList***. Sperimentare con le due versioni del programma: ci 
sono differenze nelle prestazioni?
