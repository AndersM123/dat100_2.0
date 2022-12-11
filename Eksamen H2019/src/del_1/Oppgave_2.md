# Oppgave 2 (13 poeng)

## a) 

Du har gitt setningen

	double[] tabell = new double[5];
	
	Fyll inn de to tomme feltene slik at det blir en utvidet for-l�kke (for studenter som har tatt faget tidligere er det ogs� kalt en forenklet for-l�kke) som g�r gjennom tabellen ovenfor.
	

for ( element : tabell ) {}

## b)

Minst en av metodene gir kompileringsfeil. Hvilken/hvilke?

	public class Feil {
	
		private int x;
		
		public void f(int x) {
			x = 5;
		}
		public void g() {
			int x = 5;
		}
		public void h(int y) {
			int y = 5;
		}
	}

g og h


## c)

Anta vi har definert et Interface (en kontrakt) og en klasse som implementerer interfacet. Hva kan vi bruke de til?

	Klasse. Deklarere pekere/referanser og Opprette objekt (bruke new)

Interface. ?Deklarere pekere/referanser?

## d)


Blant alternativene nedenfor. Hva er de to viktigste fordelene med � bruke oppramstyper 	(enum)?

Svar:
Programmet blir lettere � lese 

Sikrer at variabler f�r lovlig verdi


## e)

Gitt koden nedenfor

	int sum = 0;
	for (int i = 4; i >= 1; i--) {
		sum = sum + i;
	}
	System.out.print(sum);

Hva blir skrevet ut?

4+3+2+1 = 10


## f)

Gitt koden nedenfor

	int log = 0;
	int tall = 1;
	do {
		tall = 2 * tall;
		log++ ;
	} while (tall < 21);
	System.out.println(log);

Hva blir skrevet ut?

tall = 16
log = 5

5 blir skrevet ut


## g)

Gitt koden nedenfor

	for (int i = 1; i <= 2; i++) {
	for (int j = 3; j < 7; j = j + 2) {
	System.out.print(i);
	System.out.print(j);
	}
	}

Legg merke til at vi bruker bare print slik at utskriften forsetter p� samme linje. Dermed kan vi se p� hele utskriften som et tall, for eksempel 12345. Hva blir tallet?

Den f�rste l�kken starter p� 1 og er en helt til den andre l�kken n�r kravet sitt <7. derav f�r vi 1 3 og 1 5. n� har l�kke nr 2 n�dd sin maks, s� l�kke 1 itererer i++. den andre l�kken kj�er p� nytt s� dermed f�r vi 2 3 og 2 5.

13152325


## h)

Gitt koden nedenfor

	public static void metodeA(int x) {
		
		if (x < 0) {
			throw new ArithmeticException("X er negativ");
		} else {
			"x = 0"
			System.out.print(1);
		}
		"x > 0"
		System.out.print(2);
	}
	
	public static void metodeB() {
		int[] tab = { 0, 1, -1, 2, 3 };
		
		try {
			for (int i = 0; i < tab.length; i++) {
				metodeA(tab[i]);
				System.out.print(3);
			}
		} catch (ArithmeticException exception) {
			System.out.println(4);
		} catch (Exception exception) {
			System.out.println(5);
		}
	}
	
Anta metodeB blir kalt fra main. Legg merke til at vi bruker bare print slik at utskriften forsetter p� samme linje. Dermed kan
vi se p� hele utskriften som et tall, for eksempel 12345. Hva blir tallet?


1231234














