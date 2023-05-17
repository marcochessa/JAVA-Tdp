## ESERCIZIO 1

A partire dal progetto base relativo al decimo laboratorio (Lab10), realizzare un’applicazione utilizzando JavaFX in grado di eseguire la simulazione di flussi d’acqua. Si consideri il data-set **rivers.sql** [GitHub - DB/rivers.sql]  ottenuto  combinando  un  sottoinsieme  delle  informazioni  presenti  nella  *Time  Series  Data Library*[^1] (TSDL). Tale data-set contiene la portata dei flussi di acqua di alcuni fiumi, misurati quotidianamente per diversi anni. Notare che i diversi fiumi sono stati misurati in intervalli di tempo indipendenti tra loro. Si noti anche che le portate dei fiumi sono molto diverse tra loro, di vari ordini di grandezza. 

La struttura del database è mostrata in *Fig 1*. 

*Fig 1* 

![](Aspose.Words.2856b298-ccf8-4778-8701-9885db7e0f04.003.png)

La tabella ‘river’ contiene i fiumi considerati nel data set, ciascuno rappresentato da un identificatore numerico ‘id’ e da una stringa descrittiva ‘name’.  

La tabella ‘flow’ contiene le misurazioni effettuate, nelle date specificate dal campo ‘day’ e per il fiume identificato  dal  campo  (chiave  esterna)  ‘river’.  La  colonna  ‘flow’  riporta  il  flusso  misurato  nel  giorno specificato, espresso in *metri cubi per secondo*. La chiave primaria ‘id’ è un semplice identificatore univoco della misurazione. 

Scopo dell’esercitazione: Realizzare un’applicazione JavaFX che permetta di interrogare  il data-set e di supportare un progettista che ha l’incarico di costruire la diga per la realizzazione di un bacino idrico che si inserisce nel flusso del fiume (Fig 2). 

*Fig 2* 

![](Aspose.Words.2856b298-ccf8-4778-8701-9885db7e0f04.004.png)

Descrizione dall’applicazione: L’applicazione deve fornire le seguenti funzionalità: 

1. Permettere  all’utente  di  selezionare,  da  una  tendina,  uno  specifico  fiume.  Appena  il  fiume  è selezionato, occorre riempire i campi dell’interfaccia che riportano, rispettivamente: la data della prima misurazione disponibile per tale fiume, la data dell’ultima misurazione disponibile per tale fiume, il numero totale di misurazioni, il valore medio del flusso misurato per tale fiume (detto  ). 
1. Permettere all’utente di simulare l’effetto di un bacino idrico della capienza totale  (espressa in metri cubi). La simulazione dovrà aggiornare, giorno per giorno, la quantità di acqua presente nel bacino (detta  ), in funzione dei dati sul flusso in ingresso (detto  ) presente nel data set. Il calcolo deve tenere conto delle seguenti regole: 
1. L’utente può specificare il valore di  inserendo un “fattore di scala”  > 0, dal quale si calcolerà[^2]  = ⋅ ⋅ 30  (in altre parole,  indica la frazione di un mese a flusso “medio” che il bacino potrà contenere prima di riempirsi). 
1. L’occupazione iniziale del bacino è  ⁄ 
   1. 2
1. Il bacino dovrà garantire un flusso in uscita (detto  ) pari ad almeno  , ogni giorno \_

dell’anno. Per gli scopi della simulazione, si assuma  = 0.8 ⋅ . 

\_

4. Quando  > , il livello  nel bacino salirà di una quantità legata alla differenza tra i due flussi. 
4. Non è possibile avere  > . In caso di flusso in ingresso eccessivo, questo deve essere scaricato in uscita (evento detto “tracimazione”). 
4. In ogni giorno dell’anno, c’è una probabilità pari al 5% di avere un flusso richiesto in uscita più elevato, pari a 10 ⋅ \_ , in quanto i campi devono essere irrigati. 

Il simulatore dovrà determinare, in funzione di  : 

- il numero di giorni in cui non si è potuta garantire l’erogazione minima; 
- l’occupazione media  del bacino nel corso della simulazione. 

*Fig 3* 

![](Aspose.Words.2856b298-ccf8-4778-8701-9885db7e0f04.005.png)

Nella realizzazione del codice, si parta dai file e classi esistenti (FXML, Bean, e DAO); è ovviamente permesso aggiungere o modificare classi e metodi.  

Tutti i possibili errori di immissione o validazione dati devono essere gestiti, non sono ammesse eccezioni generate dal programma. 

[^1]: [ https://datamarket.com/data/list/?q=interval:day%20provider:tsdl ](https://datamarket.com/data/list/?q=interval:day%20provider:tsdl), create da Rob Hyndman, Professore di Statistica alla Monash University, Australia. 
[^2]: Attenzione alle unità di misura, in quanto  è espresso in  3 al secondo e non al giorno. 