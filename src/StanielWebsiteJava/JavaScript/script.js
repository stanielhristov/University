//References
let timeLeft = document.querySelector(".time-left");
let quizContainer = document.getElementById("container");
let nextBtn = document.getElementById("next-button");
let countOfQuestion = document.querySelector(".number-of-question");
let displayContainer = document.getElementById("display-container");
let scoreContainer = document.querySelector(".score-container");
let restart = document.getElementById("restart");
let userScore = document.getElementById("user-score");
let startScreen = document.querySelector(".start-screen");
let startButton = document.getElementById("start-button");
let questionCount;
let scoreCount = 0;
let count = 11;
let countdown;


const quizArray = [
  {
    id: "0",
    question: "Кой е най-говореният език в света?",
    options: ["Испански", "Мандарин", "Английски", "Немски"],
    correct: "Мандарин",
  },
  {
    id: "1",
    question: "Кой е единственият континент в света без пустиня?",
    options: ["Северна Америка", "Азия", "Африка", "Европа"],
    correct: "Европа",
  },
  {
    id: "2",
    question: "Коя е най-дългата река в света?",
    options: ["Нил", "Амазонка", "Янцзъ", "Мисисипи"],
    correct: "Нил",
  },
  {
    id: "3",
    question: "Кой е най-успешният футболист в историята на Шампионската лига? ",
    options: ["Лионел Меси", "Кристияно Роналдо", "Карим Бензема", "Томас Мюлер"],
    correct: "Кристияно Роналдо",
  },
  {
    id: "4",
    question: "Кой е най-продаваният автомобил в света?",
    options: ["Volkswagen Golf", "Toyota Corolla", "Opel Astra", "Ford Fiesta"],
    correct: "Toyota Corolla",
  },
  {
    id: "5",
    question: "Какво е Java?",
    options: ["Програмен език", "Операционна система", "База данни", "Хардуерен компонент"],
    correct: "Програмен език",
  },
  {
    id: "6",
    question: "Какво е Git?",
    options: ["Система за управление на версии", "Система за управление на бази данни", "Система за управление на проекти", "Система за управление на файлове"],
    correct: "Система за управление на версии",
  },
  {
    id: "7",
    question: "Кой е най-продаваният албум на всички времена?",
    options: ["The Dark Side of the Moon” на Pink Floyd", "“Back in Black” на AC/DC", "Thriller” на Michael Jackson", "“The Bodyguard” на Whitney Houston"],
    correct: "Thriller” на Michael Jackson",
  },
  {
    id: "8",
    question: "Кой е главният актьор във филма “Матрицата”?",
    options: ["Уил Смит", "Киану Рийвс", "Брус Уилис", "Том Круз"],
    correct: "Киану Рийвс",
  },
  {
    id: "9",
    question: "Кой е основателят на Apple?”?",
    options: ["Джеф Безос", "Стив Джобс", "Бил Гейтс", "Илън Мъск"],
    correct: "Стив Джобс",
  },
  {
    id: "10",
    question: "Кое от следните организми е пример за едноклетъчен организъм??",
    options: ["Човекът", "Пчелата", "Гъбата", "Амебата"],
    correct: "Амебата",
  },
  {
    id: "11",
    question: "Кой от следните процесори е известен с висока производителност и мощност?",
    options: ["Intel Core i5", "AMD Ryzen 3", "Qualcomm Snapdragon", "Apple M1"],
    correct: "Apple M1",
  },
  {
    id: "12",
    question: "Кой от следните процесори е известен с висока производителност и мощност?",
    options: ["Intel Core i5", "AMD Ryzen 3", "Qualcomm Snapdragon", "Apple M1"],
    correct: "Apple M1",
  },
  {
    id: "13",
    question: "Кое от следните животни е най-близко до изчезване, съществуващо само в определена част от света?",
    options: ["Панда", "Ему", "Комодски варан", "Коала"],
    correct: "Комодски варан",
  },
  {
    id: "14",
    question: "Коя от следните планети в Слънчевата система е най-голяма по диаметър?",
    options: ["Марс", "Сатурн", "Венера", "Юпитер"],
    correct: "Юпитер",
  },
];


restart.addEventListener("click", () => {
  initial();
  displayContainer.classList.remove("hide");
  scoreContainer.classList.add("hide");
});

nextBtn.addEventListener(
  "click",
  (displayNext = () => {
    questionCount += 1;
    //if last question
    if (questionCount == quizArray.length) {
      displayContainer.classList.add("hide");
      scoreContainer.classList.remove("hide");
      userScore.innerHTML =
        "Your score is " + scoreCount + " out of " + questionCount;
    } else {
      countOfQuestion.innerHTML =
        questionCount + 1 + " of " + quizArray.length + " Question";
      quizDisplay(questionCount);
      count = 11;
      clearInterval(countdown);
      timerDisplay();
    }
  })
);

const timerDisplay = () => {
  countdown = setInterval(() => {
    count--;
    timeLeft.innerHTML = `${count}s`;
    if (count == 0) {
      clearInterval(countdown);
      displayNext();
    }
  }, 1000);
};

const quizDisplay = (questionCount) => {
  let quizCards = document.querySelectorAll(".container-mid");

  quizCards.forEach((card) => {
    card.classList.add("hide");
  });

  quizCards[questionCount].classList.remove("hide");
};

function quizCreator() {

  quizArray.sort(() => Math.random() - 0.5);

  for (let i of quizArray) {

    i.options.sort(() => Math.random() - 0.5);

    let div = document.createElement("div");
    div.classList.add("container-mid", "hide");

    countOfQuestion.innerHTML = 1 + " of " + quizArray.length + " Question";

    let question_DIV = document.createElement("p");
    question_DIV.classList.add("question");
    question_DIV.innerHTML = i.question;
    div.appendChild(question_DIV);

    div.innerHTML += `
    <button class="option-div" onclick="checker(this)">${i.options[0]}</button>
     <button class="option-div" onclick="checker(this)">${i.options[1]}</button>
      <button class="option-div" onclick="checker(this)">${i.options[2]}</button>
       <button class="option-div" onclick="checker(this)">${i.options[3]}</button>
    `;
    quizContainer.appendChild(div);
  }
}


function checker(userOption) {
  let userSolution = userOption.innerText;
  let question =
    document.getElementsByClassName("container-mid")[questionCount];
  let options = question.querySelectorAll(".option-div");


  if (userSolution === quizArray[questionCount].correct) {
    userOption.classList.add("correct");
    scoreCount++;
  } else {
    userOption.classList.add("incorrect");

    options.forEach((element) => {
      if (element.innerText == quizArray[questionCount].correct) {
        element.classList.add("correct");
      }
    });
  }


  clearInterval(countdown);

  options.forEach((element) => {
    element.disabled = true;
  });
}


function initial() {
  quizContainer.innerHTML = "";
  questionCount = 0;
  scoreCount = 0;
  count = 11;
  clearInterval(countdown);
  timerDisplay();
  quizCreator();
  quizDisplay(questionCount);
}


startButton.addEventListener("click", () => {
  startScreen.classList.add("hide");
  displayContainer.classList.remove("hide");
  initial();
});


window.onload = () => {
  startScreen.classList.remove("hide");
  displayContainer.classList.add("hide");
};
