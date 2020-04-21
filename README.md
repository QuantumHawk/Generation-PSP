# Generation-PSP
Циклическая генерация сеансового ключа
Счетчик С выставляется в начальное значение (ПСП  8, 16, или 32 бит).
Мастер-ключ Km — большое простое число (8, 16, или 32).
Сеансовый ключ получается по схеме, представленной ниже. 
В качестве алгоритма шифрования используется сложение по модуля 2 (побитовое сложение циклом); изменение значения счетчика от С к С+1 – циклический сдвиг влево на 1 бит. алгоритм изображен в issue

 Cyclic session key generation Counter C is set to the initial value (SRP 8, 16, or 32 bits). The Km master key is a large prime number (8, 16, or 32). The session key is obtained according to the scheme below. As the encryption algorithm, addition according to module 2 is used (bitwise addition by a loop); changing the counter value from C to C + 1 - a cyclic shift to the left by 1 bit. algorithm depicted in issue
