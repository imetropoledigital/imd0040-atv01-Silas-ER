[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/SuSXJHSc)
## Atividade

Nesta atividade você deverá criar um programa para imprimir os primeiros "N" números primos. O valor de "N" deverá ser recebido via argumento da linguagem Java.

Acesse o arquivo Primos.java e adicione o código no local indicado:

```java
public class Primos {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Você deve passar um parâmetro.");
            System.exit(0);
        }
        int qnt = Integer.parseInt(args[0]); //Converte para número a entrada
        //TODO Adicionar código aqui
    }
}
```

## Exemplos

O resultado deverá ser impresso no console um valor por linha.

### Exemplo 01

Entrada: 
```console
1
```   
Saída:  
```console
2
```

### Exemplo 02

Entrada:
```console
5
```   
Saída:
```console
2
3
5
7
11
```

## Testes

O programa possui testes automatizados implementados. Se quiser testar execute o seguinte comando:

```shell
## para Linux/Mac
$ ./gradlew test 

## para Windows
$ ./gradlew.bat test 
```