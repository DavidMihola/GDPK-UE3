#
# Das Makefile sollte die Dateien aneinanderhängen und so die
# Datei für die Abgabe erzeugen
#
# Die Frage ist: Wie kriegt man die Zwischenüberschriften und so
# hinein?

# Aufgabe 1:
# Verschiebbar.java
# Skalierbar.java
# Linie.java
# Punkt.java
# Scheibe.java

# Aufgabe 2:
# Person.java
# Mann.java
# Frau.java
# Kind.java
# Begruessung.java

all: Abgabe.txt

%.txt: %.java
	/bin/echo "# $<:" | cat - "$<" > "$@"

Aufgabe1.txt: Verschiebbar.txt Skalierbar.txt Linie.txt Punkt.txt Scheibe.txt
	/bin/echo -e "\n1 Objekte und Interfaces\n" | cat - $+ > "$@"

Aufgabe2.txt: Person.txt Mann.txt Frau.txt Kind.txt Begruessung.txt
	/bin/echo -e "\n2 Dynamisch vs switch-case\n" | cat - $+ > "$@"

Aufgabe3+4.txt: Node.txt IntStack.txt
	/bin/echo -e "\n3+4 Rekursive Datenstrukturen - IntStack\n" | cat - $+ > "$@"

Aufgabe4.2.txt: Aufgabe4.2.txt.sicher
	cp $< $@

Abgabe.txt: Aufgabe1.txt Aufgabe2.txt Aufgabe3+4.txt Aufgabe4.2.txt
	/bin/echo -e "VU Grundlaged der Programmkonstruktion\n3. Übung\n\nbearbeitet von:\nDavid Mihola, 9902433\nFlorian Mihola, 0304850\n" | cat - $+ > "$@"

clean:
	rm -f *.txt
