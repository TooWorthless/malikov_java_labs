# [Лабораторна робота №2](https://github.com/TooWorthless/malikov_java_labs/blob/main/src/main/java/com/university/lab2/README.md) (Tests)

## Опис тестів BookTest:
* testIncorrectTitle - перевірка правильності реагування програми на некорректні значення в полі Title
* testIncorrectAuthor - перевірка правильності реагування програми на некорректні значення в полі Author
* testBorrow - перевірка правильності отримання статусу книги

## Опис тестів DVDTest:
* testIncorrectTitle - перевірка правильності реагування програми на некорректні значення в полі Title
* testIncorrectDuration - перевірка правильності реагування програми на некорректні значення в полі Duration
* testBorrow - перевірка правильності отримання статусу dvd

## Опис тестів LibraryTest:
* testAddItem - перевірка правильності додавання книги до бібліотеки
* testRemoveItem - перевірка правильності видалення книги
* testRegPatron - перевірка правильності рєестрації Patron
* testLendItem - перевірка правильності взяття книги або dvd
* testLendIncorrectItem - перевірка правильності реагування програми на взяття некоректного предмету
* testLendItemToIncorrectPatron - перевірка правильності реагування програми на взяття предмету за некоректним Patron
* testLendSameItem - перевірка правильності реагування програми на взяття вже зайнятого предмета
* testReturnItem - перевірка правильності повернення предмету
* testReturnIncorrectItem - перевірка правильності повернення некоректного предмета
* testReturnItemToIncorrectPatron - перевірка правильності роботи у разі повернення за некоректним Patron
* testReturnSameItem - перевірка правильності роботи у разі повернення вже поверненного предмета

## Опис тестів PatronTest:
* testBorrow, testReturnItem - перевірка правильності взяття та повернення Patron
* testReturnIncorrectItem - перевірка правильності повернення некоректного предмета