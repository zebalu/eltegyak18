# AVL fa

A feladat v�gc�lja egy AVL-fa megval�s�t�sa. A k�vetelm�nyek a r�szfeladatokkal ker�lnek folyamatosan bevezet�sre. A r�szfeladatok mellett szerepel, hogy h�ny pontot lehet r� kapni, �s az is, hogy addig megoldani a beadand�t pontosan h�ny pontot �r: _([pont �rt�k], [�sszpontsz�m])_ form�ban. A feladatokat csak ebben a szigor� sorrendben lehet megoldani, amennyiben nem �gy teszel, csak addig �rt�kelem a beadand�t, am�g az els� pontt�l kezdve hib�tlanul �s hi�nytalanul eljutott�l.

----
## Mi az az AVL fa?
Tal�lhatsz r�la cikket a [Wikipedia-n](https://hu.wikipedia.org/wiki/AVL-fa)

> "A sz�m�t�g�p-tudom�nyban az AVL-fa alatt egy �n-kiegyens�lyoz� bin�ris keres�f�t �rt�nk. Ez volt az els� ilyen adatszerkezet. Egy AVL-f�ban b�rmely cs�cspont k�t r�szf�j�nak magass�ga k�zti k�l�nbs�g legfeljebb egy."

----

### 1. feladat (1, 1)
K�sz�ts egy olyan adatszerkezetet, mely alkalmas eg�sz sz�mok t�rol�s�ra. Legyen meg rajta a k�vetkez� 4 m�velet:

* add(i) -- az "i" elemet elhelyezi az adatszerkezetben, ha az m�g nem szerepel benne
* remove(i) -- az "i" elemet t�rli az adatszerkezetb�l (ha nem szerepel benne, nem v�ltozik semmi)
* contains(i) -- igaz / hamis �rt�ket ad vissza, annak megfelel�en, hogy az "i" �rt�k szerepel-e az adatszerkezetben
* size() -- visszaadja a t�rolt elemek sz�m�t

### 2. feladat (1, 2)
�rj tesztet, mely ellen�rzi:

* az �j (�res) adatszerkezet m�rete 0
* �res adatszerkezetbe �rt�ket rakva annak m�rete 1 lesz
* ugyanazt az �rt�ket k�tszer berakva az �res adatszerkezetbe annak m�rete nem v�ltozik
* 2 k�l�nb�z� �rt�ket rakva az �res adatszerkezetbe, annak m�rete 2 lesz
* az adatszerkezet, ha nem tartalmazza "i"-t, arra k�rdezve hamissal t�r vissza
* az adatszerkezet, ha tartalmazza "i"-t, arra k�rdezve igazzal t�r vissza

### 3. feladat (3, 5)
* Az adatszerkezet val�s�tsa meg az [Iterable](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html) interface-t. 
* Az elemeken v�gig iter�lva azokat n�vekv� sorrendben kapjuk meg.
* Az iter�toron m�k�dj�n a remove() met�dus is.

### 4. feladat (2, 7)
�rj tesztet, mely haszn�lja az iter�tort.

* valid�ld, hogy az iter�tor minden elemen v�gigmegy
* valid�ld, hogy az iter�tor l�p�ssz�ma megegyezik az adatszerkezetben t�rolt adatok sz�m�val
* valid�ld, hogy az elemek n�vekv� sorrendben k�vetkeznek
* valid�ld, hogy a remove met�dust haszn�lva az iter�toron az adatszerkezetb�l az adott elem t�rl�d�tt

### 5. feladat (3, 10)
Tedd az adatszerkezetet generikuss�, �s adj lehet�s�get arra, hogy konstrukci�s id�ben kapjon az adatszerkezet egy [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)-t, amit a rendez�shez haszn�l. (Ha ez hi�nyzik, kezelje az adatokat [Comparable](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)-k�nt, ha az nem lehets�ges, dobjon Exception-t.) Valamint igaz�tsd az eddigi k�dokat (teszteket is bele�rtve) a generikus form�val kompatibiliss�.

### 6. feladat (2, 12)
* teszteld, hogy az adatszerkezet k�pes (Comparator n�lk�l) t�rolni �s sorban visszaadni Double �rt�keket
* teszteld, hogy az adatszerkezet (Comparator n�lk�l) k�pes t�rolni �s bet�rendben visszaadni String �rt�keket
* teszteld, hogy az adatszerkezet a megfelel� Comparatorral String �rt�keket azok hossza szerint rendezve ad vissza.

### 7. feladat (3, 15)
Legyen az adatszerkezetnek egy nodeIterator() nev� met�dusa, mely "Node<T>" t�pus� elemeket ad vissza.
A Node<T> oszt�ly a k�vetkez� met�dusokat biztos�tsa:

* parent() -- visszaadja a node f�ban szerepl� sz�l� node-j�t, vagy null-t, ha nincs neki.
* left() -- visszaadja a f�ban szerepl� bal gyereket, vagy nullt, ha nincs neki
* right() -- visszaadja a f�ban szerepl� jobb gyereket, vagy nullt, ha nincs neki
* value() -- visszaadja a t�rolt �rt�ket

Az iter�tort haszn�lva, a node-okat �rt�k szerint n�vekv� sorrendben kapjuk vissza.

### 8. feladat (5, 20)
* Minden node kapjon egy height() nev� m�veletet, mely megmondja, milyen magas a node-t�l kezd�d� r�szfa. (Az �res fa magass�ga 0, az egy elem� fa -- teh�t sem bal, sem jobb gyerekkel nem rendelkez� node -- magass�ga 1. A legal�bb egy gyerekkel rendelkez� fa magass�ga a gyermek f�k magass�g�nak maximuma + 1.
* Minden node kapjon egy hightDiff() m�veletet, mely kisz�molja a bal �s jobb gyermek magass�g�nak k�l�nbs�g�t.
* garant�ld az AVL tulajdons�got (minden r�szfa bal �s jobb gyermek�nek magass�g k�l�nbs�ge legfeljebb 1)
* �rj tesztet, mely ellen�rzi, hogy az AVL tulajdons�g a gr�fban fenn �ll.