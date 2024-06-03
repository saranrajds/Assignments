let questions = [];
let crtAnswer = "";
let isChanged = false;

$(document).ready(function() {
    
    isChanged = false;
    // const params = new URLSearchParams(window.location.search);
    // const qustionNumber = params.get('q') == null ? 0 : Number(params.get('q'));
    // console.log(qustionNumber);
    // let questionLen = questions.length;

    $(".start-btn").show();
    $(".quiz-content-section").hide();

});

function onStartQuiz() {
    console.log("onStartQuiz");
    $(".start-btn").hide();
    $(".quiz-content-section").show();
    loadQuestions(1);
}
function loadQuestions(qustionNumber) {
    
    questions = [
        {
          "question": "Which of the following is the correct way to declare a variable in Java?",
          "options": [
            "int num = 5;",
            "int num = \"5\";",
            "int num == 5;",
            "int num := 5;"
          ],
          "answer": "int num = 5;"
        },
        {
          "question": "What is the size of an int variable in Java?",
          "options": [
            "4 bytes",
            "2 bytes",
            "8 bytes",
            "1 byte"
          ],
          "answer": "4 bytes"
        },
        {
          "question": "Which method is used to print something to the console in Java?",
          "options": [
            "System.out.write()",
            "System.write()",
            "System.print()",
            "System.out.println()"
          ],
          "answer": "System.out.println()"
        },
        {
          "question": "What is the default value of a boolean variable in Java?",
          "options": [
            "true",
            "false",
            "0",
            "null"
          ],
          "answer": "false"
        },
        {
          "question": "Which keyword is used to create a new object in Java?",
          "options": [
            "class",
            "object",
            "new",
            "create"
          ],
          "answer": "new"
        }
    ]
    
    createQuizContent(qustionNumber);
}

function createQuizContent(qustionNumber) {

    const form = document.createElement('form');
    form.id = 'myForm';
    
    const quizBody = document.createElement('div');
    quizBody.className = 'quiz-body';

    const quizHead = document.createElement('div');
    quizHead.className = 'quiz-head';

    const quizName = document.createElement('div');
    quizName.className = 'quiz-name';

    const h4 = document.createElement('h4');
    h4.textContent = 'Question '+qustionNumber;

    quizName.appendChild(h4);
    quizHead.appendChild(quizName);

    const quizQuestionBody = document.createElement('div');
    quizQuestionBody.className = 'quiz-question-body';

    const question = document.createElement('div');
    question.className = 'question';

    const questionText = document.createElement('span');
    questionText.textContent = questions[qustionNumber-1]['question'];

    question.appendChild(questionText);

    const questionAnswer = document.createElement('div');
    questionAnswer.className = 'qeustion-answer';

    const choices = questions[qustionNumber-1]['options'];

    let index = 1;
    choices.forEach(choice => {
        
        const choiceDiv = document.createElement('div');
        choiceDiv.className = "choice_"+index;

        const input = document.createElement('input');
        input.type = 'radio';
        input.name = 'choice';
        input.className = "choice choice_"+index;
        input.readOnly = true;
        input.value = choice;
        input.onclick = () => checkAnswer(choice, questions[qustionNumber-1].answer);

        choiceDiv.appendChild(input);
        choiceDiv.append(` ${choice}`);
        questionAnswer.appendChild(choiceDiv);
        index++;

    });

    quizQuestionBody.appendChild(question);
    quizQuestionBody.appendChild(questionAnswer);

    const actionButton = document.createElement('div');
    actionButton.className = 'action-button';

    if (qustionNumber > 1) {
        const prevButtonLink = document.createElement('a');
        prevButtonLink.href = '?q='+(qustionNumber-1);
        prevButtonLink.classList.add('disabled-link');

        const prevButton = document.createElement('button');
        prevButton.className = 'btn btn-primary previous';
        prevButton.textContent = 'previous';
        // prevButton.type = 'submit';
        prevButton.id = "previoubtn"
        prevButton.onclick = () => previousBtnClick(qustionNumber-1);
    
        // prevButtonLink.appendChild(prevButton);
        // actionButton.appendChild(prevButtonLink);
        
    }
   
    if (qustionNumber < questions.length) {
        const nextButtonLink = document.createElement('a');
        nextButtonLink.href = '?q='+(qustionNumber+ 1);
        nextButtonLink.style.textAlign = 'center';
        nextButtonLink.classList.add('disabled-link');

        if(qustionNumber == 1) {
            nextButtonLink.style.width = "100%";
        }

        const nextButton = document.createElement('button');
        nextButton.className = 'btn btn-primary next';
        nextButton.textContent = 'Next';
        // nextButton.type = 'submit';
        nextButton.id = 'nextBtn';
        nextButton.onclick = () => nextBtnClick(qustionNumber+1);

        nextButtonLink.appendChild(nextButton);
        actionButton.appendChild(nextButtonLink);
    }
    else {
        const submitButtonLink = document.createElement('a');
        submitButtonLink.href = 'javascript:void(0)';
        submitButtonLink.style.textAlign = 'end';

        const submitButton = document.createElement('button');
        submitButton.className = 'btn btn-primary submit';
        submitButton.textContent = 'Submit';
        submitButton.onclick = () => submitBtnClick();

        submitButtonLink.appendChild(submitButton);
        actionButton.appendChild(submitButtonLink);    
    }
    
    quizBody.appendChild(quizHead);
    quizBody.appendChild(quizQuestionBody);
    quizBody.appendChild(actionButton);
    form.appendChild(quizBody);
    const quizContainer = document.getElementById('quiz-container');
    quizContainer.appendChild(form);

    form.addEventListener('submit', function(event) {
        event.preventDefault();
    });
}

function checkAnswer(selectedOption, correctAnswer) {

    $('.disabled-link').attr("class","");
    crtAnswer = correctAnswer;

    if (selectedOption === correctAnswer) {
        // alert("Correct!");
    } else {
        // alert("Incorrect. Try again.");
    }
    console.log("crtAnswer ", crtAnswer);
    isChanged = true;

}

function validateForm() {
    
    const selectedOption = document.querySelector('input[name="choice"]:checked');
    return selectedOption !== null;
}

function previousBtnClick(qustionNumber) {
    console.log('previousBtnClick ',qustionNumber);
    clearQuestion(qustionNumber);
    // if (isChanged) {
    //     if(totalMark > 0)
    //         totalMark--;
    //     else 
    //         totalMark = 0;
    // }
}

function nextBtnClick(qustionNumber) {
    // console.log('e ',e);
    calculateScore();
    clearQuestion(qustionNumber);

}

function calculateScore() {
    const selectedOption = document.querySelector('input[name="choice"]:checked').value;
    console.log("selectedOption ", selectedOption , crtAnswer);
    if (selectedOption === crtAnswer) {
        let totalMark = Number($("#score").text()) == '' ? 0 : Number($("#score").text());         
        $("#score").text(totalMark + 1);
    }
}

function clearQuestion(qustionNumber) {
    const quizContainer = document.getElementById('quiz-container');
    quizContainer.innerHTML = "";
    createQuizContent(qustionNumber);
}

function submitBtnClick() {
    calculateScore();

    $(".start-btn").hide();
    $(".quiz-content-section").hide();
    $(".mark-btn").show();
    let score = $("#score").text();
    $("#total-mark").text("Total Question => " + questions.length);
    $("#correct-mark").text("Total correct Mark => " + score);
    $("#wrong-mark").text("Total Wrong Mark => " + Math.abs(Number(questions.length) - Number(score)));
    window.addEventListener('popstate', function(event) {
        history.pushState(null, null, location.href);
    });
}