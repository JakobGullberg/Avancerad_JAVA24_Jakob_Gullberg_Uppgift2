# Avancerad_JAVA24_Jakob_Gullberg_Uppgift2
Studenthanteringssystem

# Student Management System

## Beskrivning
Detta är ett konsolbaserat system för hantering av studentinformation, utvecklat med Java. Systemet använder Singleton-designmönstret för att säkerställa att endast en instans av hanteringssystemet existerar, vilket bidrar till en ren och effektiv kodstruktur.

### Funktioner:
1. **Lägg till studentuppgifter**: 
   Användaren kan lägga till en ny student med unikt ID, namn och betyg.
2. **Spara studentposter till fil**: 
   Alla studentposter kan sparas till en fil för framtida åtkomst.
3. **Läs studentposter från fil**: 
   Existerande studentposter kan laddas från en fil och visas i systemet.
4. **Sök efter student via ID**: 
   Systemet låter användaren hitta en specifik student baserat på deras unika ID.
5. **Visa alla studenter**: 
   Visar en lista över alla studenter som lagras i minnet.
6. **Avsluta programmet**: 
   Programmet avslutas utan att radera sparade poster från filen.

## Tekniska detaljer
- **Singleton-designmönster**: 
  Säkerställer att endast en instans av `StudentManagementSystem` existerar under hela programmets livslängd.
- **Datastruktur**: 
  ArrayList används för att lagra studentposter i minnet.
- **Filhantering**: 
  Programmet använder filinmatning och filutmatning för att läsa och skriva studentposter till en fil.
- **Konsolbaserat gränssnitt**: 
  Ett användarvänligt menybaserat gränssnitt för interaktion med systemet.

## Val av datastruktur: ArrayList
ArrayList valdes som datastruktur för att lagra studentposter eftersom:
- Den är enkel att använda och erbjuder dynamisk storlek, vilket gör det lätt att lägga till och ta bort poster.
- Den ger snabb åtkomst till element via index, vilket är användbart när man itererar genom listan för att visa eller spara poster.
- Personligen har jag erfarenhet av att använda ArrayList tidigare, vilket gjorde det till ett naturligt val.

## Hur man använder systemet
1. Starta programmet genom att köra `Main.java`.
2. Följ instruktionerna i konsolmenyn för att hantera studentuppgifter.
3. Spara dina ändringar till en fil för att behålla data mellan programkörningar.

## Filnamn
När du sparar eller läser från en fil, ange filnamnet (t.ex. `students.txt`). Filen kommer att innehålla student-ID, namn och betyg separerade med kommatecken.

---
**Förbättringsmöjligheter i framtida projekt:**
- Implementera validering för inmatning för att hantera felaktig data.
- Utöka systemet för att stödja flera filformat, t.ex. JSON eller XML.
- Lägga till ytterligare information om studenter.

**Avslutande ord:**
Det här projektet är ett utmärkt exempel på hur man använder Java för att skapa ett enkelt men kraftfullt hanteringssystem och jag lärde mig ytterligare detaljer om Singleton-mönstret.


