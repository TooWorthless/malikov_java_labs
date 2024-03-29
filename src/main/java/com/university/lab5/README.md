# Лабораторна робота №5
*Малікова Вадима*
*ПД-32*

## Мета:
1. Зрозуміти базові принципи обробки виняткових ситуацій в Java.
2. Створити спеціалізовані класи винятків для обробки конкретних помилкових сценаріїв.
3. Використовувати пропагацію винятків.

## Завдання:
1. Реалізуйте клас BankAccount з членами класу accountNumber, accountName і balance.
2. Реалізуйте методи deposit(double amount), withdraw(double amount), getBalance() та getAccountSummary().
3. Створіть спеціалізовані класи винятків:
4. InsufficientFundsException
5. NegativeAmountException
6. AccountNotFoundException
7. Реалізуйте клас Bank, який зберігає колекцію об'єктів BankAccount.
8. У класі Bank, реалізуйте методи:
9. createAccount(String accountName, double initialDeposit)
10. findAccount(int accountNumber)
11. transferMoney(int fromAccountNumber, int toAccountNumber, double amount)
12. Обробляйте винятки відповідно в кожному методі.
13. Створіть тестові класи, де ви моделюєте різні сценарії для тестування обробки виняткових ситуацій.

## Опис результату роботи:
* Створено клас BankAccount - зберігає номер, назву, та баланс акаунта та надає можливості взаємодії з циа даними
* Створено клас Bank - зберігає акаунти та надає можливості роботи з списком збережених аккаунтів і додаванням нових
* Створено 3 класи-винятки: AccountNotFoundException, InsufficientFundsException, NegativeAmountException
* Додано тести та приклад виокристання класів

## Tests:
### [LB5_Tests](https://github.com/TooWorthless/malikov_java_labs/blob/main/src/test/java/com/university/lab5/README.md)

## Висновок:
У ході виконання лабораторної роботи №5 мною було отримано розуміння теми Exceptions, зобуто навички створення і використання своїх власних винятків в мові програмування Java.

У кінці виконання роботи усі вимоги до функціональності та завдання були реалізовані і протестовані.