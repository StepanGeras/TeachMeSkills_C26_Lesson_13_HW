package com.teachmeskills.lesson13;

import com.teachmeskills.lesson13.information.Authentication;

/**
 * Создать класс, в котором будет статический метод.
 * Этот метод принимает на вход три параметра:
 * 	Login
 * 	Password
 * 	confirmPassword
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должен содержать
 * пробелы.
 * Если login не соответствует этим требованиям, необходимо "выбросить" WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * *Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * Классы-исключения WrongPasswordException и WrongLoginException - пользовательские
 * классы исключения с двумя конструкторами – один по умолчанию, второй
 * принимает сообщение исключения и передает его в конструктор класса Exception.
 * Метод возвращает true, если значения валидны или false в другом случае.
 * Разместить классы по пакетам: класс для проверки значений должен находится в своем отдельном пакете, классы для исключений - в своем.
 * Создать класс Runner для тестирования этого класса.
 * Попробовать решить задачу двумя способами:
 * 1. методами класса String "из коробки", например метод contains
 * 2. разбив строку на массив char'ов (string toCharArray()) и сделать обход и проверку массива
 */

public class Runner {

    public static void main(String[] args) {

        String login = "qwer";
        String password = "asdf1";
        String confirmPassword = "asdf1";

        if (Authentication.secretInformation(login, password, confirmPassword)){
            System.out.println("The values are valid");
        } else {
            System.out.println("Values are not valid");
        }

    }

}
