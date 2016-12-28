### Test Automation Course in University

Tests running instruction:
  * install [sbt](http://www.scala-sbt.org/download.html)
  * cd ./webdriver
  * sbt run

## Test cases
#### site: https://www.vocabulary.com/


| № | Описание | Шаги | Данные | Ожидаемый результат |
| :---: | :--- | :--- | :--- | :--- |
| 1 | Открытие формы для входа | 1. зайти на сайт https://www.vocabulary.com/ <br />2. нажать на кнопку "sign in" |  | Откроется форма для входа |
| 2 | Вход на сайт | 1. зайти на сайт https://www.vocabulary.com/ <br />2. нажать на кнопку "sign in" <br />3. ввести email <br />4. ввести пароль <br />5. нажать на кнопку "sign in" | email: alex_frankfurt@mail.ru  <br />password: might39 | Переход на главную страницу, nickname == Alex A. |
| 3 | Вход на сайт с неправильным паролем | 1. зайти на сайт https://www.vocabulary.com/ <br />2. нажать на кнопку "sign in" <br />3. ввести email <br />4. ввести неправильный пароль <br />5. нажать на кнопку "sign in" | email: alex_frankfurt@mail.ru <br />password: notVal1d | появление сообщения "Sorry, we don't recognize that username and password." |
| 4 | Открытие попапа для регистрации | 1. зайти на сайт https://www.vocabulary.com/ <br />2. нажать на кнопку "sign up" <br/> 3. нажать на кнопку  "sign up as a student" |  | Откроется форма для регистрации, появится кнопка с надписью "create your account" |
| 5 | Просмотр профиля | 1. зайти на сайт https://www.vocabulary.com/ <br />2. нажать на кнопку "sign in" <br />3. ввести email <br />4. ввести пароль <br />5. нажать на кнопку "sign in" <br />6. Нажать на картинку "три" в правом верхнем углу навигации <br/> 7. Нажать на кнопку "My account" | email: alex_frankfurt@mail.ru <br />password: might39 | Переход на https://lingualeo.com/ru/profile |
