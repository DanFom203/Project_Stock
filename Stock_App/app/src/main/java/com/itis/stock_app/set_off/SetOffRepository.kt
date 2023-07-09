package com.itis.stock_app.set_off

object SetOffRepository {
    val list: List<SetOff> = listOf(
        SetOff(1,"Русский Язык и Культура Речи",
            "https://csri.ru/800/600/https/gazetahamovniki.moscow/wp-content/uploads/sites/10/2020/06/file762ut1r2net5m68j8ox.jpg",
            "https://marcon-kholod.ru/img/not_found.jpg",
            "Галиулина Ильвира Рафаилевна",
            "Для русскоговорящего человека не будет проблемой получить зачет по этому предмету." +
                    "Готовиться тщательно необоходимости нет, однако просмотреть содержимое билетов за день перед зачетом строго рекомендуется. " +
                    "На зачёте можно списать, и это совсем не сложно - преподаватель специально отводит глаза.",
            "EASY",
            "Отсутствуют"
        ),
        SetOff(2, "Дискретная Математика",
            "https://mindmatters.ai/wp-content/uploads/sites/2/2023/05/3d-rendering-of-abstract-blocks-of-mathematical-formulas-located-in-the-virtual-space-stockpack-adobe-stock-1597x898.jpg",
        "https://shelly.kpfu.ru/e-ksu/docs/F393261902/foto_Korneeva.jpg?rnd=2029",
        "Корнеева Наталья Николаевна",
            "Этот зачет по сложности - на уровне экзамена. Сначала вы всей группой заходите в аудиторию и " +
                    "пишете вступительный тест, который длится 12 минут. " +
                    "Материал тяжелый, и учить его будет нелегко." +
                    "Но преподаватель - очень добродушная женщина, которая не будет давить на Вас." +
                    "Если выучить билеты - проблем не будет никаких. Мало кто отправляется на пересдачу.",
            "MEDIUM",
            "Вопросы из теста:\n" +
                    "\n" +
                    "1) построить полином жегалкина для не(Х)\n" +
                    "2) привести пример монотонной функции, которая не является самодвойственной\n" +
                    "3) написать определение полной системы функций\n" +
                    "4) построить граф по таблице смежности (всего 5 вершин, у каждой степень 2)\n" +
                    "5) привести пример графа, который является и эйлеровым, и гамильтоновым\n" +
                    "6) найти остов наименьшего веса и указать вес\n" +
                    "7) является ли к4 планарным\n" +
                    "\n" +
                    "Теория в билете:\n" +
                    "\n" +
                    "1) Базис, примеры базисов для 1,2,3,4 функций (с доказательством)\n" +
                    "2) Маршрут, замкнутый маршрут, цепь, простая цепь, цикл, простой цикл, " +
                    "лемма о том, что если вершины соединены 2-мя простыми цепями, " +
                    "то значит, есть простой цикл (доказательство)"),
        SetOff(3,"Введение в Психологию Личной Эффективности",
            "https://proprikol.ru/wp-content/uploads/2020/11/kartinki-psihologiya-34.jpg",
            "https://shelly.kpfu.ru/e-ksu/docs/F1425588054/IMG_0054.jpg?rnd=8228",
            "Роженко Виктория Акифовна",
            "Самый главный совет по данной дисциплине - на протяжении всего семестра ходить на занятия и выполнять домашнюю работу. " +
                    "Ничего сложного в этом нет, а взамен вашей усидчивости и ответственности вы получите автомат 80+ баллов, и не будете сдавать зачет.",
            "NOT_A_PROBLEM_AT_ALL",
            "Отсутствуют"
        ),
        SetOff(4, "Профессиональный и Разговорный Английский Язык",
            "https://top-akciya.ru/wp-content/uploads/2021/12/2.jpg",
            "https://avt-4.foto.mail.ru/mail/elenak9595/_avatar180?",
        "Кудрявцева Елена Анатольевна",
            "Очень добрый преподаватель, который за выполнение всех классных и домашних работ позволяет получить автомат 90+ баллов. " +
                    "Другие преподаватели более строги к посещению и дают более сложные задания, но не сдать этот предмет очень тяжело. Большинство получают автоматы.",
            "NOT_A_PROBLEM_AT_ALL",
            "Отсутствуют"
        ),
        SetOff(5, "История в элекстронной форме",
            "https://i.sunhome.ru/journal/215/dlya-chego-nuzhna-istoriya.501.orig.jpg",
            "https://marcon-kholod.ru/img/not_found.jpg",
            "Коломыц Ольга Григорьевна / Ибрагимов Руслан Рустамович",
            "Изучение данной дисциплины происходит в онлайн формате, потому предмет считается легким. " +
                    "Каждую неделю будет даваться домашнее задание, и если его вовремя делать, то на зачет идти не придется - у вас будет автомат. " +
                    "Списать домашние задания легко - вы находитесь у себя дома/в общежитии, вам никто не будет мешать.",
            "NOT_A_PROBLEM_AT_ALL",
            "Отсутствуют"
        ),
        SetOff(6,"Философия и Стратегии Мышления",
            "https://pobedarf.ru/wp-content/uploads/2021/11/e40c0ec2d74b0750d0d68.jpg",
            "https://marcon-kholod.ru/img/not_found.jpg",
            "Либерман С.А. / Савельева А.Б. / Хорт М.Г.",
            "Изучение данной дисциплины происходит в онлайн формате, потому предмет считается легким. " +
                    "Каждую неделю будет даваться домашнее задание, и если его вовремя делать, то на зачет идти не придется - у вас будет автомат. " +
                    "Списать домашнее задание довольно сложно - в интернете мало информации, но отличным помощником может стать Chat GPT или другая нейронка.",
            "NOT_A_PROBLEM_AT_ALL",
            "Отсутствуют"
        ),
        SetOff(7,"Технологии, Которые Изменят Мир",
            "https://vuzopedia.ru/storage/app/uploads/public/632/5dc/291/6325dc2912e0f923083420.jpg",
            "https://vuzopedia.ru/storage/app/uploads/public/aa9/a0a/f34/thumb__0_300_0_0_auto.jpg",
            "Харитонов Антон Викторович / Ефремова Анна Олеговна",
            "Данная дисциплина - выборная, состоит из 8-9 лекция и 8-9 практик. " +
                    "Стоит сходить на несколько лекций, и постоянно ходить на практику, выполняя при этом большую часть домашних заданий. " +
                    "Если вы будете так делать - у вас будет автомат 80+ баллов.",
            "NOT_A_PROBLEM_AT_ALL",
            "Отсутствуют"
        ),
        SetOff(8,"Физическая Культура",
        "https://www.sb.by/upload/iblock/644/644d56160b688381a4ed217ba7b8a319.jpg",
            "https://marcon-kholod.ru/img/not_found.jpg",
            "Преподаватель будет зависеть от вашего выбора",
            "Главный совет - не стоит идти на ОФП, если только вам не нравится бег, выматывающие занятия и нормативы. " +
                    "В случае выбора плавания, имейте в виду - бассейн находится далеко от вуза. " +
                    "Автоматы можно легко получить у любого преподавателя данной дисциплины - главное это посещаемость. ",
            "NOT_A_PROBLEM_AT_ALL",
            "Отсутствуют"
        )
    )
}