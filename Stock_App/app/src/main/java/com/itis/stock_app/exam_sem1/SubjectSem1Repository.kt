package com.itis.stock_app.exam_sem1

object SubjectSem1Repository {
    val list: List<SubjectSem1> = listOf(
        SubjectSem1(0, "Алгебра и геометрия",
            "https://lms.kantiana.ru/pluginfile.php/330756/mod_book/chapter/10416/Page16.jpg",
            "Арсланов Марат Мирзаевич",
            "https://shelly.kpfu.ru/e-ksu/docs/F248567701/Arslanov_2.jpg?rnd=2076",
            "MEDIUM OR AS LUCKY",
            "Даются 2 теоретических вопроса и 1 практическое задание. " +
                    "Заходит 8 человек, дальше по 1 доходите. На написание билетов дается 60 минут." +
                    " Потом Марат Мирзаевич вас вызывает к себе и задает вопросы." +
                    " Вопросы может задавать не только по билету. В основном, они на понимание." +
                    " Чтобы успешно сдать экзамен, необходимо решить практику, " +
                    "сначала он смотрит её. Если не решите, шанс сдать становится меньше, " +
                    "но если вы хорошо разбираетесь в предмете, то сдать сможете. Списывать не стоит.",
            "Теория:\n" +
                    "1. Свойства линейно-зависимых\\независимых векторов. \n" +
                    "2. Комплексные числа. Модуль и аргумент комплексного числа. Геометрическая форма" +
                    "числа. Операции над комплексными числами. Формула Муавра.\n" +
                    " \n" + "1. Обратная матрица. Способ вычисления обратной матрицы через" +
                    "алгебраические дополнения.\n" +
                    "2. Интерполяционная теорема лагранжа.\n" +
                    " \n" + "1. Теорема Кронекера-Капелли. \n" +
                    "2. Разложение определителя по строке/столбца.\n" +
                    " \n" + "Практика: \n" +
                    "1. Разложить на элементарные симметричексие многочлены многочлен x1^3*x2^2*x3\n" +
                    "\n" +
                    "2. Перемножить матрицы и найти значения параметра когда ранг матрицы равен 2.\n" +
                    "\n" +
                    "3. x^2+2ix+i=0 - решить уравнение\n" +
                    "\n" +
                    "4. Дан многочлен x^3+3x^2-x-1=0. Цель: построить ряд Штурма, найти " +
                    "количество вещественных корней, для каждого корня найти между какими " +
                    "целыми числами он находится (какому промежутку принадлежит).\n" +
                    "\n" +
                    "5. Разложить на множители комплексных коэффициентов. x^6-2x^3-3=0."),
        SubjectSem1(1, "Математический анализ",
            "https://dropi.ru/img/uploads/2018-04-23/3_original.jpeg",
            "Скворцова Галия Шакировна",
            "https://marcon-kholod.ru/img/not_found.jpg",
            "MEDIUM",
            "Перед экзаменом пишете вступительный тест. Если успешно написали тест и хотите" +
                    " 4 или 5, то садитесь писать билет. В билете 2 задания: теоретическое и практическое. " +
                    "Если хотите 3, то достаточно рассказать обязательные определения и " +
                    "решить какие-то простые практические задачи. Экзамен сдать не так сложно, " +
                    "если готовились. Галия Шакировна идет навстречу студентам и помогает.",
            "1. Числовая последовательность (примеры), предел последовательности," +
                    "элементарные свойства. \n" +
                    "2. Уравнение касательной поверхности в точке (0,0) к функции (1+x^2)^1/2 * cos(y)\n" +
                    " \n" +
                    "1. Ограниченное множество. Мажоранта, Миноранта, Супермум, Инфимум, Существование " +
                    " и их свойства \n" +
                    "2. По Тейлору разложить до x^2 (корень 3 степени из(a^3+x)). \n" +
                    " \n" +
                    "1. Определение и свойства непрерывности функции в точке. Левый и правый пределы" +
                    " функции в точке. Точки разрыва (с примерами). Свойства непрерывных на отрезке функций.\n" +
                    "2. Интеграл ln(x)xˆn, где n != 1"),
        SubjectSem1(2, "Информатика и программирование",
            "https://www.oxfordcc.co.uk/files/shutterstock_230705509-scaled.jpg",
            "Абрамский Михаил Михайлович",
            "https://shelly.kpfu.ru/e-ksu/docs/F1980796675/EZ4B8235___kopiya.JPG?rnd=3343",
            "EASY",
            "Сначала пишете теоретическую часть на листах. На это дается 1,5 часа. " +
                    "Потом пишете практическую часть на своих ноутбуках. На это тоже " +
                    "1,5 часа. За каждый вопрос теоретической части дается 4 балла, за " +
                    "каждое задание в практической части - 9 баллов. В теории 8 вопросов, " +
                    "в практике 2 задания. Оценка формируется при складывании баллов за " +
                    "семестр и экзамен. Вызывает к себе в порядке возрастания баллов. " +
                    "Готовьтесь по презентациям с лекций и " +
                    "делайте домашние задания по практике в течение семестра, " +
                    "и все сдадите.",
            "Теория:\n" +
                    "1. Подчеркните неверные определения: \n" +
                    "a. Тезис Черча-Тьюринга говорит о том, что любой алгоритм, придуманный человеком, можно написать на машине Тьюринга\n" +
                    "b. Фон Нейман предложил хранить числа в двоичном виде, чтобы быстрее совершать вычисления.\n" +
                    "c. Понятие переменная появилось в языках низкого уровня\n" +
                    "d. Целочисленная переменная вмещает в себя одинаковое количество отрицательных и положительных чисел.\n" +
                    "\n"+
                    "2. Указать сложность кода и пояснить\n" +
                    "m = n\n" +
                    "For(int i; i < m; i++){\n" +
                    "While (n != 0) {\n" +
                    "Print(arr[n/2])\n" +
                    "n = n / 2\n" +
                    "}\n" +
                    "\n" +
                    "3. Определить, что выведет код (уже не помню какой, но там основной прикол в Dangling else)\n" +
                    "\n" +
                    "4. Опишите, как можно переписать while с continue без continue.\n" +
                    "\n" +
                    "5. Напишите максимально короткий код, который проверяет, что s - символ английского алфавита \n" +
                    "(учитывать строчные и заглавные буквы)\n" +
                    "\n" +
                    "6. Final и finally - что это такое. Отдельно указать, есть ли между ними связь.\n" +
                    "\n" +
                    "7. Как через позднее связывание можно реализовать полиморфизм.\n" +
                    "\n" +
                    "8. Привести пример кода, который нарушает принцип I, написать почему, написать \n" +
                    "правильный вариант кода.\n" +
                    " \n" +
                    "Практика: \n" +
                    "1. Вводится массив строк. Проверить, является ли он отсортированным по возрастанию\n" +
                    " количества гласных букв в строке. Также проверить, не превышает ли k количество строк,\n" +
                    " которые длиннее своих соседей ([i -1] и [i + 1]) (k вводится отдельно), крайние значения не проверяются)\n" +
                    "\n" +
                    "2. Реализовать класс <<параллелограмм>> (на координатной плоскости)\n" +
                    "Гарантируется, что 2 стороны параллельны Ох\n" +
                    "Через конструктор передаются значения атрибутов.\n" +
                    "Содержит методы:\n" +
                    "- площадь\n" +
                    "- периметр\n" +
                    "- найти углы\n" +
                    "- переопределенные equals и toString\n" +
                    "Если введённые данные не являются параллелограммом, то нужно выбросить исключение\n" +
                    "Также в отдельном классе написать static-методы\n" +
                    "- считает общую площадь в массиве из параллелограммов\n" +
                    "- проверяет, что в массиве только 2 равных параллелограмма"))
}