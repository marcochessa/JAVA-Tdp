## Esercizio 1 
Dopo  anni  di  studi,  alcuni  scienziati  sono  riusciti  a  decifrare  un  linguaggio  alieno  trasmesso  da  un  remoto 
pianeta. Per poter interpretare i messaggi che gli alieni hanno inviato alla terra nell’ultimo decennio, gli 
scienziati hanno chiesto di ideare un traduttore che possa aiutarli. 
 
Realizzare in linguaggio Java una semplice applicazione dotata di interfaccia grafica che funga da traduttore 
di parole aliene. Deve essere possibile sia l’aggiunta di nuove parole che la ricerca di quelle esistenti. 
 
Lo scopo del programma è quello di permettere all’utente di: 
 
- Inserire una nuova parola e la relativa traduzione secondo il seguente pattern:  
<parola aliena> <traduzione> (separate da uno spazio) 
Cliccando sul bottone Translate la parola e la sua traduzione verranno aggiunte al dizionario. 
 
- Cercare  la  traduzione  di  una  parola  esistente  inserendo  <parola  aliena>  e  facendo  click  sul  bottone 
Translate. La traduzione verrà visualizzata nell’area di testo sottostante. 
 
Implementare i controlli per eventuali errori sull’input: gli unici caratteri ammessi sono [a-zA-Z] (ossia solo 
le  lettere  alfabetiche,  siano  essere  maiuscole  o  minuscole),  ma  la  ricerca  deve  essere  case  insensitive.  Si 
suggerisce di convertire tutto il testo ricevuto in minuscolo prima di elaborarlo.

## Esercizio 2  
Partendo  dalla  soluzione  del  precedente  esercizio,  si  vuole  aggiungere  al  programma  il  supporto  per 
traduzioni  multiple  associate  a  ciascuna  parola  aliena.  Ogni  parola  aliena,  in  particolare,  potrà  essere 
associata a una collezione di possibili traduzioni. L’utente potrà inserire più di una traduzione per una data 
parola cliccando più volte il bottone Translate avendo cura di specificare la stessa parola aliena. Viceversa, 
quando l’utente vorrà recuperare la traduzione di una determinata parola aliena, il programma stamperà tutte 
le traduzioni ad essa associate.  

## Esercizio opzionale:  
Implementare la ricerca di una parola con wildcard: quando nella parola aliena compare il simbolo “?”, il carattere corrispondente può essere qualsiasi. È ammesso un solo “?” per ogni parola da cercare. 
 
Esempio: 
Se  la  traduzione  della  parola  ALIENO  corrisponde  ad  ANDREA,  cercando  ALI?NO  si  deve  ottenere 
ANDREA. Fare attenzione al caso in cui più parole aliene soddisfino il criterio di ricerca (es. ALINNO). 
