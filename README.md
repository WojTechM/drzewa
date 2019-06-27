# README
Warsztaty o BFS i DFS - poruszenie grafów, drzew i drzew binarnych

Prezentacja wprowadzająca do grafów jest do znalezienia na repozytorium

Na tym repozytorium znajdziesz proste zadanka związane z pracą na grafach.

Zacznij proszę od napisania algorytmu przeszukiwania w głąb w pakiecie 'zadanie_pierwsze'
a następnie, napisz przeszukiwanie wszerz. Algorytmy powinny przechodzić po całym drzewie binarnych poszukiwań 
zbierając kolejne wartości jego węzłów.

W zadaniu drugim (pakiet 'zadanie_drugie') w ramach powtórzenia sobie algorytmów musisz napisać je raz jeszcze,
jednak tym razem tak, by działały na dowolnym grafie, nie tylko na drzewach binarnych.

Do każdego algorytmu przygotowane są testy.
Oczekują one wartości pobieranych od lewej do prawej w przypadku drzew, a w przypadku grafów 
w kolejności dodawania (tj. graf któremu dodamy sąsiadów o wartościach 3, 1 i 2 powinien operować na nich w tej dokładnie kolejności)

Jeśli popatrzycie na formatowanie jakiego oczekuję w testach, zauważycie że jest to standardowa wizualizacja listy.
Przykładowy kawałek kodu jak to osiągnąć:
```
    List<Integer> wartości = new ArrayList<>();
    return wartości.toString();
```
    
#Protip
Przeszukiwanie w głąb bardzo łatwo zaimplementować z wykorzystaniem rekurencji.
Przeszukiwanie wszerz natomiast łatwo zrozumieć przy podejściu iteracyjnym.
