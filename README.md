# swt_esa10
JUnit

## MwSt.java
Diese Klasse stellt den Einstieg in das Programm dar und liest Benutzereingaben aus. Die Eingaben des Users werden auf Richtigkeit geprüft (handelt es sich um eine Zahl? Ist die Eingabe im erlaubten Eingabebereich?).

## FinalOutput.java
Die "unangenehme" Methode formatiert lediglich das Ergebnis.

## JUnit Test
Die Tests prüfen, ob die Umwandlung String -> Integer das richtige Ergebnis liefert (bei leeren Eingaben, nur Buchstaben oder gemischt), ob die Auswahl des Benutzers im korrekten Bereich ist (ähnlich wie beim ersten Test), es wird bewusst eine Exception provoziert (Der Wert 1.5 kann nicht als Integer geparst werden) und mit dem Plug-in Mockito wird die Klasse `FinalOutput` simuliert.

## Fazit
TDD stellt eine interessante Herangehensweise dar. Nachdem ich die Tests geschrieben hatte, habe ich mit der Implementierung begonnen. Dabei haben mich manche Tests überrascht: Beim Test von `assertTrue(MwSt.checkInput("1.5"))` hätte ich erwartet, dass Java einfach die Dezimalstellen abschneidet und das Ergebnis `true` ist (die Konvertierung wirft aber einen Fehler).

Beim Prototyping würde ich jedoch auf TDD verzichten. Allerdings sehe ich die Gefahr, dass viele Prototypen dann doch in der Produktion übernommen werden und in den meisten Firmen Zeit und Ressourcen für Refactoring (Stichwort Softwarequalität) fehlen wird.
