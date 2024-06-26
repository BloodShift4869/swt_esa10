# swt_esa10
JUnit

## MwSt.java
Diese Klasse stellt den Einstieg in das Programm dar und liest Benutzereingaben aus. Die Eingaben des Users werden auf Richtigkeit geprüft (handelt es sich um eine Zahl? Ist die Eingabe im erlaubten Eingabebereich?).

## FinalOutput.java
Die "unangenehme" Methode formatiert lediglich das Ergebnis.

## JUnit Test
Die Tests prüfen, ob die Umwandlung String -> Integer das richtige Ergebnis liefert (bei leeren Eingaben, nur Buchstaben oder gemischt), ob die Auswahl des Benutzers im korrekten Bereich ist (ähnlich wie beim ersten Test), es wird bewusst eine Exception provoziert (Der Wert 1.5 kann nicht als Integer geparst werden) und mit dem Plug-in Mockito wird die Klasse FinalOutput simuliert.
