# race-condition

1. Создать поток с помощью extends Thread
2. Создать поток с помощью implements Runnable
3. Реализовать гонку потоков: инкрементировать счетчик от 0 до 100
4. В PR добавить файл с логами (вывод комманд System.out), где будет явно продемонстрировано гонку потоков

    Пример логов:
    ```
       Thread-0 value = 19
       Thread-1 value = 20
       Thread-0 value = 17
       Thread-1 value = 21
       Thread-1 value = 22
    ```
