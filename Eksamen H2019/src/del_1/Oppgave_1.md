# Oppgave 1 (17 poeng)

## a)

Hva blir verdien av uttrykket nedenfor i Java?

    19/10

D. 1

## b)

Hvor mange x-er blir skrevet ut?

    int i = 1;
    while (i < 10) {
        System.out.println("x");
    }

B. 9.

## c)

Hvor mange x-er blir skrevet ut?

    int j = 1;
    while (j < 10) {
        if (j % 2 == 0) {
            System.out.println("x");
        }
        j++;
}

B. 4

## d)

Hva blir skrevet ut?

    System.out.println("2" + 1);

C. 21

## e)

I Java har vi mulighet for å ha flere metoder med samme navn så lenge parameterlisten er ulik. Hva kalles dette?

B. Overloading

## f)

Hva blir skrevet ut på skjermen?

    public static void metode1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void metode2(int[] tabell) {
        int temp = tabell[0];
        tabell[0] = tabell[1];
        tabell[1] = temp;
    }
    public static void main(String[] args ) {
        int[] tab1 = { 1, 2 };
        int[] tab2 = { 1, 2 };

        metode1(tab1[0], tab1[1]);
        System.out.println(tab1[0] + " " + tab1[1]);

        metode2(tab2);
        System.out.println(tab2[0] + " " + tab2[1]);
    }

A 1 2, 2 1


## g)

g)
Anta Student-klassen er definert og at den har en standardkonstruktør. Da kan vi utføre setningen

	Student s = new Student();

Kryss av om setningene nedenfor er lov / ikke lov i Java

s = 0; ikke lov
if (s != null) { //lovlige java setninger } lov
s = "Hei"; ikke lov

## h)

Vi har gitt første linje av en metode. Knytt sammen begrepene.

	public static double g(int y)
	
A returdatatype. double
B metodenavn. g
C parameter. y


## i)

Angi for hver datatype

A '1'. char
B '12'. char
C "1". String
D 12,5. double
E 1. int


## j)

Anta variabel x har verdi 3 og y har verdi 8. Hva er verdien av uttrykkene i Java?

(x == 3) && (y != 8). false
(x > 3) || (y <= 8). true
!(x >= y). true

## k)

Vi ser på et programsystem for å behandle studenter ved HVL. Vi har bestemt oss for å ha klassene HVL_Student, Data_Student og Kjemi_Student som skal organiseres i et arvehierarki.

Hvilken relasjon mellom klassene ville dette naturlig føre til?.

Data_Student er en subklasse av HVL_Student. Sant

KjemiStudent er en superklasse av Data_Student. Usant

HVL_Student er en superklasse av Kjemi_Student. Sant






	
