package e2e;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.testng.AssertJUnit.assertEquals;

public class Login extends TestBase {
    public static void main(String[] args) {

        String email = "test@gmail.com";
        String password = "test@gmail.com";

        Scanner input = new Scanner(System.in);

        System.out.println("Введите ваш email:");
        String inputEmail = input.next();

        System.out.println("Введите ваш пароль:");
        String inputPassword = input.next();

        // сравниваем введенный email и пароль с ожидаемыми значениями
        if (inputEmail.equals(email) && inputPassword.equals(password)) {
            System.out.println("Вы авторизованы!");
        } else {
            System.out.println("Неверный email или пароль.");
        }

        input.close();
    }

    @Test
    public void testLogin() {
        String email = "test@gmail.com";
        String password = "password123"; // предполагаемый пароль

        // Симулирование ввода данных пользователем
        ByteArrayInputStream in = new ByteArrayInputStream("test@gmail.com\npassword123\n".getBytes());
        System.setIn(in);

        // Запуск метода для авторизации и проверка результата
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Login.main(new String[0]);
        String result = out.toString().trim();
        assertEquals("Вы авторизованы!", result);
    }
}