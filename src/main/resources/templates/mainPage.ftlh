<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <Title>Cool Web App</Title>
    </head>


    <body>

        <script type="text/javascript" src="/static/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="/static/src/Actions.js"></script>

        <div>
            Для варианта задания №1

        </div>
        <p></p>
        <div id="divRandValue">
            №1 Случайное число: введите минимальное и максимальное число
            <div>
                <div>
                    <div>Min:</div><input type="number" name="addMinVal" id="addMinVal" placeholder=0>
                </div>
                <div>
                    <div>Max:</div><input type="number" name="addMaxVal" id="addMaxVal" placeholder=10>
                </div>
            </div>
            <div><button type="button" id="getRand" onclick="getRandValues()">Получить число</button>
            </div>
            Случайное число:
            <p id="randValResult">0</p>
        </div>
    <div id="divCounter">
        №2 Увеличить значение счетчика на:
        <div>
            <input type="number" name="numCounter" id="numCounter" placeholder=0>
        </div>
        <div><button type="button" id="getCounterVal" onclick="getCounterValue()">Получить число</button></div>
        Старое значение
        <p id="oldCounterResult">0</p>
        Новое значение
        <p id="newCounterResult">0</p>
    </div>

    <div id="divLogger">
        №3 Записать фразу в лог (80 символов):
        <div>
            <input type="text" maxlength="80" name="logText" id="logText">
        </div>
        <div><button type="button" id="submitLog" onclick="writeToLog()">Записать в лог</button></div>
        <div id="logMessage">
            В лог сделана запись:
            <p id="logResult"></p>
        </div>
    </div>

    </body>

</html>



