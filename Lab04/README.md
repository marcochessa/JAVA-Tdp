**ESERCIZIO 1** 

Dopo  aver  fatto  il  fork  del  progetto  relativo  al  quarto  laboratorio,  realizzare  in  linguaggio  Java un’applicazione dotata di interfaccia grafica che permetta la gestione degli studenti e dei corsi di ateneo. L’applicazione permette di cercare informazioni relative ad un corso o ad uno studente e di iscrivere uno studente ad un corso. Prestare attenzione alla gestione di tutte le possibili condizioni di errore. 

**Punto 1**  Realizzare un’interfaccia grafica con *JavaFx* simile a quella mostrata in *Fig 1*. I campi 

*Nome* e *Cognome* sono dei *TextField* non editabili. Il pulsante *Reset* permette di cancellare il contenuto di tutti i campi. 

Utilizzare il database *iscritticorsi.sql* (presente nella cartella del progetto), per popolare il menù a tendina con tutti i corsi disponibili. Inserire anche un campo vuoto da utilizzare quando non si vuole selezionare nessun corso in particolare. 

Fare uso dei pattern MVC e DAO, come spiegato a lezione. 

**Punto 2**  Implementare  la  funzionalità  di  completamento  automatico:  data  la  matricola  di  uno 

studente, facendo click sul pulsante verde adiacente, completare in automatico il nome e cognome di uno studente. (Esempio *Fig. 1*) 

**Punto 3**  Implementare la ricerca degli studenti iscritti ad un corso: selezionato un corso dal menù a 

tendina,  facendo  click  sul  pulsante  *Cerca  iscritti  corso*,  vengono  visualizzati  tutti  gli studenti iscritti a quel corso. (Esempio *Fig. 2*) Se nessun corso è selezionato, avvisare l’utente con un messaggio di errore. 

**Punto 4**  Implementare la ricerca dei corsi a cui è iscritto uno studente: data la matricola, facendo 

click sul pulsante *Cerca corsi,* controllare se lo studente è presente nel database, ed in caso visualizzare tutti i corsi ai quali è iscritto. (Esempio *Fig. 3*) Se la matricola non è presente, visualizzare un messaggio di errore. 

**Punto 5**  Implementare la funzionalità di ricerca se uno studente è iscritto ad un corso: selezionato 

un corso ed inserita la matricola di uno studente, facendo click su *Cerca*, è possibile sapere se lo studente specificato è iscritto a quel corso. (Esempio Fig. 4) 

**Continua nella pagina seguente!** 

Controllare di aver gestito tutte le possibili condizioni di errore. (Es. studente non presente, studente non iscritto ad alcun corso, studente già iscritto ad un corso, corso senza iscritti, caratteri non permessi nel campo matricola). 


**Punto 6** **(OPZIONALE)** 

Implementare la funzione di iscrizione di uno studente ad un corso: selezionato un corso ed inserita la matricola di uno studente, facendo click sul pulsante *Iscrivi* è possibile iscrivere lo studente a quel corso. (Esempio *Fig.5*) 

![](Aspose.Words.b09e222b-32b9-44d6-8644-bc6e0cfe06e5.003.png)

**Fig. 1** 

![](Aspose.Words.b09e222b-32b9-44d6-8644-bc6e0cfe06e5.004.png)

**Fig. 2** 

![](Aspose.Words.b09e222b-32b9-44d6-8644-bc6e0cfe06e5.005.png)

**Fig. 4** 

![](Aspose.Words.b09e222b-32b9-44d6-8644-bc6e0cfe06e5.006.png)

**Fig. 4** 

![](Aspose.Words.b09e222b-32b9-44d6-8644-bc6e0cfe06e5.007.png)
**Fig. 6****
