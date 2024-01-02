# [Лабораторна робота №7]() (Tests)

## Опис тестів ECommercePlatformTest, OrderTest, ProductTest, UserTest:
* #### testValidOrderCreation: Перевірка правильності створення замовлення.
* #### testOrderWithNullDetails: Перевірка реакції на спробу створення замовлення без деталей.
* #### testOrderWithEmptyDetails: Перевірка реакції на спробу створення замовлення з порожніми деталями.
* #### testOrderWithNegativeProductQuantity: Перевірка реакції на спробу створення замовлення з від'ємною кількістю продуктів.
* #### testSetNullOrderId: Перевірка реакції на спробу встановити нульовий ідентифікатор замовлення.
* #### testSetNullUserId: Перевірка реакції на спробу встановити нульовий ідентифікатор користувача.
* #### testValidProductCreation: Перевірка правильності створення продукту.
* #### testSetNegativePrice: Перевірка реакції на спробу встановити від'ємну ціну продукту.
* #### testSetNegativeStock: Перевірка реакції на спробу встановити від'ємний запас продукту.
* #### testSetNullProductName: Перевірка реакції на спробу встановити нульове ім'я продукту.
* #### testAddProductToCart: Перевірка правильності додавання продукта до корзини користувача.
* #### testRemoveProductFromCart: Перевірка правильності видалення продукта з корзини користувача.
* #### testRemoveNonExistentProductFromCart: Перевірка реакції на спробу видалити неіснуючий продукт з корзини.
* #### testAddNegativeQuantityToCart: Перевірка реакції на спробу додати від'ємну кількість продукта до корзини.
* #### testSetNullUsername: Перевірка реакції на спробу встановити нульове ім'я користувача.
* #### testAddUser: Перевірка додавання користувача на платформу.
* #### testAddUserWithExistingId: Перевірка спроби додати користувача з існуючим ID.
* #### testAddProduct: Перевірка додавання продукту на платформу.
* #### testAddProductWithExistingId: Перевірка спроби додати продукт з існуючим ID.
* #### testCreateOrder: Перевірка створення замовлення для користувача.
* #### testCreateOrderForNonexistentUser: Перевірка спроби створення замовлення для неіснуючого користувача.
* #### testUpdateProductStock: Перевірка оновлення кількості продукту на складі.
* #### testUpdateProductStockForNonexistentProduct: Перевірка спроби оновити кількість на складі для неіснуючого продукту.
* #### testUpdateProductStockToNegativeValue: Перевірка спроби встановити негативну кількість продукту на складі.
* #### testListProductsSortedByName: Перевірка отримання списку продуктів, відсортованих за назвою.
* #### testListProductsSortedByStock: Перевірка отримання списку продуктів, відсортованих за кількістю на складі.
* #### testFilterProductsByAvailability: Перевірка фільтрації продуктів за наявністю на складі.