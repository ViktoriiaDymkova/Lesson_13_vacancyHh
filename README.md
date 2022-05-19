## Проект автоматизации тестирования страницы вакансии на ресурсе hh.ru

---
### Вакансия [QA Engineer](https://spb.hh.ru/vacancy/48204083?query=QA%20engineer&from=vacancy_search_catalog&hhtmFrom=vacancy_search_catalog)

<a id="anchor"></a>

:closed_book: __Содержание__
+ Технологии и инструменты
+ Реализованные проверки
+ Сборка в Jenkins
+ Запуск из терминала
+ Отчет Allure Report
+ Отчет в Telegram
+ Видео примера прохождения теста




:toolbox:__Технологии и инструменты__

<img width="10%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg"><img width="10%" title="Gradle" src="images/logo/Gradle.svg"><img width="10%" title="Java" src="images/logo/Java.svg"><img width="10%" title="Jenkins" src="images/logo/Jenkins.svg"><img width="10%" title="JUnit5.svg" src="images/logo/JUnit5.svg"><img width="10%" title="Selenide.svg" src="images/logo/Selenide.svg"><img width="10%" title="Selenoid.svg" src="images/logo/Selenoid.svg"><img width="10%" title="GitHub.svg" src="images/logo/GitHub.svg"><img width="10%" title="Allure_Report.svg" src="images/logo/Allure_Report.svg"><img width="10%" title="Telegram.svg" src="images/logo/Telegram.svg">

---
__Реализованные проверки__

:white_check_mark: _Положительная проверка вакансии_

- [ ] Проверка соответствия названия вакансии ожиданию: QA Engineer
- [ ] Проверка соответствия города вакансии: Санкт-Петербург
- [ ] Проверка соответствия в ключевых навыках:  Java
- [ ] Проверка наличия уведомления об ошибке при некорректном вводе телефона

---

:x: _Отрицательная проверка вакансии_
- [ ] Проверка соответствия в ключевых навыках:  Python

---
:toolbox: __Сборка в Jenkins__

[Проект Lesson_13_vacancyHh](https://jenkins.autotests.cloud/job/Lesson_13_vacancyHh/)


<img width="100%" title="сборка в дженкинсе.png" src="images/screenshot/сборка в дженкинсе.png">


__Параметризированная сборка в Jenkins__

Мы можем собрать джобу с предложенными параметрами, выбрав из выпадающих вариантов:

<img width="100%" title="парам сборка.png" src="images/screenshot/парам сборка.png">

---
:computer: __Запуск из терминала__

Локальный запуск теста:

```
gradle clean vacancy  
```
Удаленный запуск теста:
```
clean
vacancy
 -Dbrowser=${BROWSER}
 -DbrowserSize=${BROWSER_SIZE}
 -Dremote=${REMOTE}
```

---
:bar_chart: __Отчет Allure Report__

 Обзор

<img width="100%" title="аллюр отчет .png" src="images/screenshot/аллюр отчет .png">

Проведенные тесты с шагами, возможностью просмотра скриншота, лога и видео

<img width="100%"  title="тесты.png" src="images/screenshot/тесты.png">

---
:incoming_envelope: __Отчет в Telegram__

<img width="30%"  title="тлготчет.png" src="images/screenshot/тлготчет.png">

Кроме красочной инфографики достпупна возможность перейти по ссыле для просмотра отчета:
[просмотреть сейчас ](https://jenkins.autotests.cloud/job/Lesson_13_vacancyHh/35/allure/)

---
:clapper: __Видео примера прохождения теста__

Запуск проходит на удаленном веб-драйвере Selenoid
<img title="Selenoid Video" src="images/video/видео.gif">

:arrow_up: [Вверх страницы](#anchor)

---
