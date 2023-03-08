/*Создать объект, описывающий автомобиль (производитель, 
модель, год выпуска, средняя скорость), и следующие функции 
для работы с этим объектом.
1. Функция для вывода на экран информации об автомобиле.
2. Функция для подсчета необходимого времени для преодоления переданного расстояния со средней скоростью. 
Учтите, что через каждые 4 часа дороги водителю необходимо делать перерыв на 1 час.*/

/*let car = {
  proizvod: "Германия",
  model: "BMW",
  age: 2015,
  speed: 120}

   function showInformation() {
    alert(
      "Производитель: " +
        car.proizvod +
        "\nМодель: " +
        car.model +
        "\nГод выпуска: " +
        car.age +
        "\nсредняя скорость: " +
        car.speed +"км/ч" )
  }

  function time(distance) {
    if (typeof distance !== "number") {
      throw new TypeError("distance is not a number");
    }
    const hours = distance / car.speed;
    if (hours % 4 === 0) {
      return hours + Math.floor((hours - 1) / 4);
    }
    return hours + Math.floor(hours / 4);
  }
showInformation();
let distance = parseInt(prompt("Напишите расстояние "));
time(distance);
alert("Время для прохождения дистанции " + time(distance) );*/

/*
Создать объект, хранящий в себе отдельно числитель и знаменатель дроби, и следующие функции для работы с этим объектом.
1. Функция сложения 2-х объектов-дробей.
2. Функция вычитания 2-х объектов-дробей.
3. Функция умножения 2-х объектов-дробей.
4. Функция деления 2-х объектов-дробей.
5. Функция сокращения объекта-дроби*/

  function summ(nominator1, denominator1, nominator2, denominator2) {
    let sum = nominator1 / denominator1 + nominator2 / denominator2;
    alert("Сумма " + sum);
  }

  function raznost(nominator1, denominator1, nominator2, denominator2) {
    let raz = nominator1 / denominator1 - nominator2 / denominator2;
    alert(" Разность: " + raz);
  }
  function proiz(nominator1, denominator1, nominator2, denominator2) {
    let pr =
      (nominator1 / denominator1) * (nominator2 / denominator2);
    alert("Произведение " + pr);
  }
  function delenie(nominator1, denominator1, nominator2, denominator2) {
    let del = nominator1 / denominator1 / (nominator2 / denominator2);
    alert("Частное" + del);
  }

var nominator1, denominator1, nominator2, denominator2;
nominator1 = prompt("введите числитель первой дроби ");
denominator1 = prompt("введите знаменатель первой дроби: ");
nominator2 = prompt("введите числитель второй дроби ");
denominator2 = prompt("введите знаменатель второй дроби ");

summ(nominator1, denominator1, nominator2, denominator2);
raznost(nominator1, denominator1, nominator2, denominator2);
proiz(nominator1, denominator1, nominator2, denominator2);
delenie(nominator1, denominator1, nominator2, denominator2);

