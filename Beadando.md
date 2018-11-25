# AVL fa

A feladat végcélja egy AVL-fa megvalósítása. A követelmények a részfeladatokkal kerülnek folyamatosan bevezetésre. A részfeladatok mellett szerepel, hogy hány pontot lehet rá kapni, és az is, hogy addig megoldani a beadandót pontosan hány pontot ér: _([pont érték], [összpontszám])_ formában. A feladatokat csak ebben a szigorú sorrendben lehet megoldani, amennyiben nem így teszel, csak addig értékelem a beadandót, amíg az elsõ ponttól kezdve hibátlanul és hiánytalanul eljutottál.

----
## Mi az az AVL fa?
Találhatsz róla cikket a [Wikipedia-n](https://hu.wikipedia.org/wiki/AVL-fa)

> "A számítógép-tudományban az AVL-fa alatt egy ön-kiegyensúlyozó bináris keresõfát értünk. Ez volt az elsõ ilyen adatszerkezet. Egy AVL-fában bármely csúcspont két részfájának magassága közti különbség legfeljebb egy."

----

### 1. feladat (1, 1)
Készíts egy olyan adatszerkezetet, mely alkalmas egész számok tárolására. Legyen meg rajta a következõ 4 mûvelet:

* add(i) -- az "i" elemet elhelyezi az adatszerkezetben, ha az még nem szerepel benne
* remove(i) -- az "i" elemet törli az adatszerkezetbõl (ha nem szerepel benne, nem változik semmi)
* contains(i) -- igaz / hamis értéket ad vissza, annak megfelelõen, hogy az "i" érték szerepel-e az adatszerkezetben
* size() -- visszaadja a tárolt elemek számát

### 2. feladat (1, 2)
Írj tesztet, mely ellenõrzi:

* az új (üres) adatszerkezet mérete 0
* üres adatszerkezetbe értéket rakva annak mérete 1 lesz
* ugyanazt az értéket kétszer berakva az üres adatszerkezetbe annak mérete nem változik
* 2 különbözõ értéket rakva az üres adatszerkezetbe, annak mérete 2 lesz
* az adatszerkezet, ha nem tartalmazza "i"-t, arra kérdezve hamissal tér vissza
* az adatszerkezet, ha tartalmazza "i"-t, arra kérdezve igazzal tér vissza

### 3. feladat (3, 5)
* Az adatszerkezet valósítsa meg az [Iterable](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html) interface-t. 
* Az elemeken végig iterálva azokat növekvõ sorrendben kapjuk meg.
* Az iterátoron mûködjön a remove() metódus is.

### 4. feladat (2, 7)
Írj tesztet, mely használja az iterátort.

* validáld, hogy az iterátor minden elemen végigmegy
* validáld, hogy az iterátor lépésszáma megegyezik az adatszerkezetben tárolt adatok számával
* validáld, hogy az elemek növekvõ sorrendben következnek
* validáld, hogy a remove metódust használva az iterátoron az adatszerkezetbõl az adott elem törlõdött

### 5. feladat (3, 10)
Tedd az adatszerkezetet generikussá, és adj lehetõséget arra, hogy konstrukciós idõben kapjon az adatszerkezet egy [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)-t, amit a rendezéshez használ. (Ha ez hiányzik, kezelje az adatokat [Comparable](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)-ként, ha az nem lehetséges, dobjon Exception-t.) Valamint igazítsd az eddigi kódokat (teszteket is beleértve) a generikus formával kompatibilissá.

### 6. feladat (2, 12)
* teszteld, hogy az adatszerkezet képes (Comparator nélkül) tárolni és sorban visszaadni Double értékeket
* teszteld, hogy az adatszerkezet (Comparator nélkül) képes tárolni és betûrendben visszaadni String értékeket
* teszteld, hogy az adatszerkezet a megfelelõ Comparatorral String értékeket azok hossza szerint rendezve ad vissza.

### 7. feladat (3, 15)
Legyen az adatszerkezetnek egy nodeIterator() nevû metódusa, mely "Node<T>" típusú elemeket ad vissza.
A Node<T> osztály a következõ metódusokat biztosítsa:

* parent() -- visszaadja a node fában szereplõ szülõ node-ját, vagy null-t, ha nincs neki.
* left() -- visszaadja a fában szereplõ bal gyereket, vagy nullt, ha nincs neki
* right() -- visszaadja a fában szereplõ jobb gyereket, vagy nullt, ha nincs neki
* value() -- visszaadja a tárolt értéket

Az iterátort használva, a node-okat érték szerint növekvõ sorrendben kapjuk vissza.

### 8. feladat (5, 20)
* Minden node kapjon egy height() nevû mûveletet, mely megmondja, milyen magas a node-tól kezdõdõ részfa. (Az üres fa magassága 0, az egy elemû fa -- tehát sem bal, sem jobb gyerekkel nem rendelkezõ node -- magassága 1. A legalább egy gyerekkel rendelkezõ fa magassága a gyermek fák magasságának maximuma + 1.
* Minden node kapjon egy hightDiff() mûveletet, mely kiszámolja a bal és jobb gyermek magasságának különbségét.
* garantáld az AVL tulajdonságot (minden részfa bal és jobb gyermekének magasság különbsége legfeljebb 1)
* írj tesztet, mely ellenõrzi, hogy az AVL tulajdonság a gráfban fenn áll.