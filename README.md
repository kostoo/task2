# task2

На диске лежит файл:
data.xml
Такого содержания:

<train>
    <id>46ed6171-1eba-4411-bcb4-d7cb7ca4aefe</id>
    <name>Москва - Северобайкальск</name>
    <locomotive-type>Электровоз</locomotive-type>
    <form-date>2022-05-01T04:00:00+03:00</form-date>
    <wagons>
        <wagon>
            <id>9e565543-fc83-4dab-8530-cff975351953</id>
            <num>1</num>
            <seats>50</seats>
            <type>Плацкарт</type>
        </wagon>
        <wagon>
            <id>c6b961c5-6fe5-406f-8406-318ff55a3105</id>
            <num>2</num>
            <seats>30</seats>
            <type>Купе</type>
        </wagon>
        <wagon>
            <id>2d820483-0f2e-4b98-830d-b58e4ac2ff6b</id>
            <num>3</num>
            <seats>25</seats>
            <type>Ресторан</type>
        </wagon>
    </wagons>
</train>

Необходимо:
Составить XSD схему для этого документа.
Составить JAXB классы, отражающие эту схему.
Написать программу, которая прочитает этот файл, превратит данные в нем в объекты с помощью JAXB,
а затем преобразует в JSON и сохранит эти данные рядом в файл data.json

Обычное консольное приложение.
Можно использовать библиотеки для работы с XML и JSON, но нельзя использовать Spring.