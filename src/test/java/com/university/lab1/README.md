# [Лабораторна робота №1](https://github.com/TooWorthless/malikov_java_labs/blob/main/src/main/java/com/university/lab1/README.md) (Tests)

## Опис тестів BookTest:
* testGetTitle - перевірка правильності отримання назви книги
* testGetAuthor - перевірка правильності отримання автора книги
* testGetIsbn - перевірка правильності отримання isbn коду книги
* testGetYear - перевірка правильності отримання дати публікації книги
* testInvalidYearInputting - перевірка правильності створення об'єкту книги в разі некоректної дати публікації

## Опис тестів LibraryTest:
* testAddBook - перевірка правильності додавання книги до бібліотеки
* testDelBookByIsbn - перевірка правильності видалення книги по коду isbn
* testGetBookByTitle - перевірка правильності отримання книги по назві 
* testGettingBooksListNonEmpty - перевірка правильності отримання не порожнього списка книг
* testGettingBooksListEmpty - перевірка правильності отримання порожнього списка книг
* testDelBookByIncorrectIsbn - перевірка правильності видалення книги за некоректним значенням
* testEmptyLibrary - перевірка правильності робои у разі використання методів пошуку та видалення для порожньої бібліотеки