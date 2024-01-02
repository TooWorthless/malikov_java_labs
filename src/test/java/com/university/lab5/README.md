# [Лабораторна робота №5](https://github.com/TooWorthless/malikov_java_labs/blob/main/src/main/java/com/university/lab5/README.md) (Tests)

## Опис тестів BankAccountTest:
* testDeposit - Перевірка збілшення загальної суми після додавання грошей на баланс
* testIncorrectAuthor - перевірка правильності реагування програми на некорректні значення в полі Author
* testBorrow - перевірка правильності отримання статусу книги

## Опис тестів BankTest:
* testCreateAccount - Перевірка створення акаунта в звичайних умовах
* testNegativeAmountExceptionOnCreateAccount - Перевірка створення акаунта при негативному значенні початкового депозита
* testFindAccount - Перевірка пошуку акаунта в звичайних умовах
* testAccountNotFoundException - Перевірка пошуку акаунта за неіснуючим номером
* testTransferMoney - Перевірка переказу грошей в звичайних умовах
* testInsufficientFundsExceptionOnTransferMoney - Перевірка некоректного переказу грошей
* testNegativeAmountExceptionOnTransferMoney - Перевірка некоректного переказу грошей